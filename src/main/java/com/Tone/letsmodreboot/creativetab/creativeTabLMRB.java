package com.Tone.letsmodreboot.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.Tone.letsmodreboot.init.ModBlocks;
import com.Tone.letsmodreboot.init.ModItems;
import com.Tone.letsmodreboot.reference.Reference;

public class creativeTabLMRB {

	public static final CreativeTabs LMRB_TAB = new CreativeTabs(
			Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {

			return ModItems.mapleLeaf;
			//this is the Icon for the LMRB tab.
			

		}

		@Override
		public String getTranslatedTabLabel() {

			return "Let's Mod Reboot";

		}

	};

}
