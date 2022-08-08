package baeDateConvert;

import com.ataccama.dqc.commons.plugin.IPluginStartupClass;
import com.ataccama.dqc.commons.plugin.PluginConfiguration;
import com.ataccama.dqc.expressions.model.user.UserFunctionRegister;

public class PluginStartupClass implements IPluginStartupClass {

	public void pluginStart(PluginConfiguration config) {
		UserFunctionRegister.registerUserFunctionClass(BAEDateConvert.class);

	}

}

