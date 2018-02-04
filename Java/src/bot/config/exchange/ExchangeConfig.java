package src.bot.config.exchange;

import com.google.common.base.MoreObjects;

 /**
 ** Exchange API
 **/

public class ExchangeConfig {

    private String exchangeName;
    private String exchangeAdapter;
    private AuthenticationConfig authenticationConfig;
    private NetworkConfig networkConfig;
    private OptionalConfig optionalConfig;

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getExchangeAdapter() {
        return exchangeAdapter;
    }

    public void setExchangeAdapter(String exchangeAdapter) {
        this.exchangeAdapter = exchangeAdapter;
    }

    public AuthenticationConfig getAuthenticationConfig() {
        return authenticationConfig;
    }

    public void setAuthenticationConfig(AuthenticationConfig authenticationConfig) {
        this.authenticationConfig = authenticationConfig;
    }

    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    public NetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    public OptionalConfig getOptionalConfig() {
        return optionalConfig;
    }

    public void setOptionalConfig(OptionalConfig optionalConfig) {
        this.optionalConfig = optionalConfig;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("exchangeName", exchangeName)
                .add("exchangeAdapter", exchangeAdapter)
                // WARNING - careful showing this!
                //.add("authenticationConfig", authenticationConfig)
                .add("networkConfig", networkConfig)
                .add("optionalConfig", optionalConfig)
                .toString();
    }
}
