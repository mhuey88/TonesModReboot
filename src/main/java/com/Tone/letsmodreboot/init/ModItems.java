package com.Tone.letsmodreboot.init;

import com.Tone.letsmodreboot.item.ItemLMRB;
import com.Tone.letsmodreboot.item.ItemMapleLeaf;
import com.Tone.letsmodreboot.item.ItemToneArmor;
import com.Tone.letsmodreboot.item.ItemToneSword;
import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
// This registry keeps you blocks and items protected
//if someone messes with your code.

public class ModItems {
	
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
	public static final ItemToneSword tonesSword = new ItemToneSword();
	public static final ItemToneArmor tonesChestPlate = new ItemToneArmor();
	
		public static void init(){
			
			GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
			GameRegistry.registerItem(tonesSword, "tonesSword");
			GameRegistry.registerItem(tonesChestPlate, "tonesChestPlate");
			
		}
		
		
		
	
		
		
		
	

}
