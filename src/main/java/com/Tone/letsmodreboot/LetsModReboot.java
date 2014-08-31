package com.Tone.letsmodreboot;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.Tone.letsmodreboot.client.handler.KeyInputEventHandler;
import com.Tone.letsmodreboot.handler.ConfigurationHandler;
import com.Tone.letsmodreboot.init.ModBlocks;
import com.Tone.letsmodreboot.init.ModItems;
import com.Tone.letsmodreboot.init.Recipes;
import com.Tone.letsmodreboot.init.Smelting;
import com.Tone.letsmodreboot.proxy.IProxy;
import com.Tone.letsmodreboot.reference.Reference;
import com.Tone.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		// Network Handling, Mod configurations, Items and Blocks.

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		proxy.registerKeyBindings();

		ModItems.init();

		ModBlocks.init();
		
		LMRBTester.init();

		LogHelper.info("Pre Initialization Complete!");
	}


	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {

		// Register GUIs, crafting recipes, and other general handlers.

		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		Recipes.init();
		LogHelper.info("Initialization Complete!");
		Smelting.init();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		/*
		 * if you want to run something after other Mods have done there
		 * Initialization, etc.
		 */
		LogHelper.info("Post Initialization Complete!");
		// ---------------------------------------------
		for (String oreName : OreDictionary.getOreNames()) {

			LogHelper.info(oreName);
			OreDictionary.getOres("stickWood");// oreName
		}
		;
		// ----- This code is used to search what items are classified as
		// stickWood in the oreDictionary.

	}

}// end of main class
