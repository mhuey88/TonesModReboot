package com.Tone.letsmodreboot.handler;

import java.io.File;

import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static Configuration configuration;
	public static boolean testValue = false;

	public static void init(File configFile) {
		// Create the configuration object from the given configuration file
		if (configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}// end of If

	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(
			ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {

			loadConfiguration();

		}// end of IF

	};// end of Configura..ChangedEvent;

	private static void loadConfiguration() {

		testValue = configuration.getBoolean("configValue",
				Configuration.CATEGORY_GENERAL, true,
				"This is an example configuration value");

		if (configuration.hasChanged()) {

			configuration.save();
		}// end of IF
	}

}
