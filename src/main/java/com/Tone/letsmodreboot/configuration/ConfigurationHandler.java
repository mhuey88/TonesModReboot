package com.Tone.letsmodreboot.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static void init(File configFile) {
		//Create the configuration object from the given configuration file
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		try {
			//load the configuration file
			configuration.load();
			// Read in properties from configuration file
			
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
		}
		catch (Exception e){
			//log the exception
			
		}//end of catch 
		finally {
			
			//Save the configuration file
			configuration.save();
			
		}//end of finally
		
		System.out.println("Configuration Test: " + configValue);
	}

}
