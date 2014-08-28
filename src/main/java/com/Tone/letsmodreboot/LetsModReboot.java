package com.Tone.letsmodreboot;

import com.Tone.letsmodreboot.configuration.ConfigurationHandler;
import com.Tone.letsmodreboot.proxy.IProxy;
import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name=Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot {
	
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	
	public static IProxy proxy;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		//Network Handling, Mod configurations, Items and Blocks.
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		
	}
	
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
		//Register GUIs, crafting recipes, and other general handlers. 
	}
	
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		//if you want to run after other Mods have done there Initialization, etc.
		
	}
	
	
	

}//end of main class
