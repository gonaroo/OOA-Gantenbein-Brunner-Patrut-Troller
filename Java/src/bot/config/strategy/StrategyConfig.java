
package src.bot.config.strategy;

import com.google.common.base.MoreObjects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 /**
 * Encapsulates (optional) Strategy Config Items.
 **/
public final class StrategyConfig {

	private Map<String, String> items = new HashMap<>();

	public String getConfigItem(String key) {
		return items.get(key);
	}

	public int getNumberOfConfigItems() {
		return items.size();
	}

	public Set<String> getConfigItemKeys() {
		return Collections.unmodifiableSet(items.keySet());
	}

	public void setItems(Map<String, String> items) {
		this.items = items;
	}

	public Map<String, String> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("items", items).toString();
	}
}