package com.Tone.letsmodreboot.init;

import com.Tone.letsmodreboot.block.BlockFlag;
import com.Tone.letsmodreboot.block.BlockLMRB;
import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks {
	
	public static final BlockLMRB flag = new BlockFlag();
	
	public static void init(){
		
		GameRegistry.registerBlock(flag, "flag");
	
	}

}
