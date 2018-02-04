
package src.bot.util;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Factory for creating user components defined in the bot configuration files.
 * These are currently the Exchange Adapters and Trading Strategies.
 */

public abstract class ConfigurableComponentFactory {

	private static final Logger LOG = LogManager.getLogger();

	private ConfigurableComponentFactory() {
	}

	/*
	 * Loads and instantiates a given class and returns it.
	 */
	public static <T> T createComponent(String componentClassName) {
		try {
			final Class componentClass = Class.forName(componentClassName);
			final Object rawComponentObject = componentClass.newInstance();
			LOG.info(() -> "Successfully created the Component class for: " + componentClassName);

			// should be one of ours
			return (T) rawComponentObject;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			final String errorMsg = "Failed to load and initialise Component class.";
			LOG.error(errorMsg, e);
			throw new IllegalStateException(errorMsg, e);
		}
	}
}