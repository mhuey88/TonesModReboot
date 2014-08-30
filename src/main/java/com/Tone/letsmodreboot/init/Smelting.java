package com.Tone.letsmodreboot.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {
	
	public static void init(){
		
		GameRegistry.addSmelting(new ItemStack(ModItems.mapleLeaf),new ItemStack(ModBlocks.flag) , 0.1F);
		// if you smelt a leaf you with get a flag block.
		GameRegistry.addSmelting(new ItemStack(Blocks.wool), new ItemStack(ModBlocks.flag) , 0.1F);
		//burning only white wool gives you a Canada flag block
	}

}
