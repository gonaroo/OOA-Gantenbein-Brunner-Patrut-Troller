
package src.bot.mail;

import src.bot.domain.emailalerts.SmtpConfig;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.mail.*;
// Import klappt nicht...
import javax.mail.jar;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * A simple mail sender using SMTP and TLS. It sends plain/text email only.
 */


@Component
@ComponentScan(basePackages = {"com.bot.repository"})
public class EmailAlerter {

    private static final Logger LOG = LogManager.getLogger();

    private SmtpConfig smtpConfig;
    private Properties smtpProps;
    private boolean sendEmailAlertsEnabled;

    private final EmailAlertsConfigService emailAlertsConfigService;


    @Autowired
    public EmailAlerter(EmailAlertsConfigService emailAlertsConfigService) {
        this.emailAlertsConfigService = emailAlertsConfigService;
        initialise();
    }

    public void sendMessage(String subject, String msgContent) {

        if (sendEmailAlertsEnabled) {

            final Session session = Session.getInstance(smtpProps, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(smtpConfig.getAccountUsername(), smtpConfig.getAccountPassword());
                }
            });

            try {
                final Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(smtpConfig.getFromAddress()));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(smtpConfig.getToAddress()));
                message.setSubject(subject);
                message.setText(msgContent);

                LOG.info(() -> "About to send following Email Alert with message content: " + msgContent);
                Transport.send(message);

            } catch (MessagingException e) {
                // not much we can do here, especially if the alert was critical - the bot is shutting down; just log it.
                LOG.error("Failed to send Email Alert. Details: " + e.getMessage(), e);
            }
        } else {
            LOG.warn("Email Alerts are disabled. Not sending the following message: Subject: "
                    + subject + " Content: " + msgContent);
        }
    }

    // ------------------------------------------------------------------------
    // Private utils
    // ------------------------------------------------------------------------

    private void initialise() {

        final EmailAlertsConfig emailAlertsConfig = emailAlertsConfigService.getEmailAlertsConfig();
        if (emailAlertsConfig != null) {

            sendEmailAlertsEnabled = emailAlertsConfig.isEnabled();
            if (sendEmailAlertsEnabled) {

                LOG.info(() -> "Email Alert for emergency bot shutdown is enabled. Loading SMTP config...");

                smtpConfig = emailAlertsConfig.getSmtpConfig();

                if (smtpConfig == null) {
                    final String errorMsg = "Failed to initialise Email Alerter. " +
                            "Alerts are enabled but no SMTP Config has been supplied in config.";
                    throw new IllegalStateException(errorMsg);
                }

                LOG.info(() -> "SMTP host: " + smtpConfig.getHost());
                LOG.info(() -> "SMTP TLS Port: " + smtpConfig.getTlsPort());
                LOG.info(() -> "Account username: " + smtpConfig.getAccountUsername());
                // uncomment below for testing only
//                    LOG.info( () -> "Account password: " + smtpConfig.getAccountPassword());

                LOG.info(() -> "From address: " + smtpConfig.getFromAddress());
                LOG.info(() -> "To address: " + smtpConfig.getToAddress());

                smtpProps = new Properties();
                smtpProps.put("mail.smtp.auth", "true");
                smtpProps.put("mail.smtp.starttls.enable", "true");
                smtpProps.put("mail.smtp.host", smtpConfig.getHost());
                smtpProps.put("mail.smtp.port", smtpConfig.getTlsPort());

            } else {
                LOG.warn("Email Alerts are disabled. Are you sure you want to configure this?");
            }
        }
    }
}