package com.Tone.letsmodreboot.init;

import com.Tone.letsmodreboot.item.ItemLMRB;
import com.Tone.letsmodreboot.item.ItemMapleLeaf;
import com.Tone.letsmodreboot.item.ItemToneChestPlate;
import com.Tone.letsmodreboot.item.ItemToneSword;
import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
// This registry keeps you blocks and items protected
//if someone messes with your code.

public class ModItems {
	
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
	public static final ItemToneSword tonesSword = new ItemToneSword();
	public static final ItemToneChestPlate toneChestPlate = new ItemToneChestPlate();
	//public static final ItemToneArmorSet toneHelmet = new ItemToneArmorSet();
	//public static final ItemToneArmorSet toneLeggings = new ItemToneArmorSet();
	//public static final ItemToneArmorSet toneFeet = new ItemToneArmorSet();
	
		public static void init(){
			
			GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
			GameRegistry.registerItem(tonesSword, "tonesSword");
			GameRegistry.registerItem(toneChestPlate, "toneChestPlate2");
			//GameRegistry.registerItem(toneLeggings, "toneLeggings");
			//GameRegistry.registerItem(toneFeet, "toneFeet");
			
			
			
		}
		
		
		
	
		
		
		
	

}
