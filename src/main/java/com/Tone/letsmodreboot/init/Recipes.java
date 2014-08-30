package com.Tone.letsmodreboot.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init(){
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), 
				" s ",//Top Row 
				"sss", //Middle Row
				" s ", //Bottom Row
				
				's' , new ItemStack(Items.stick));
		//if you make a cross shape using sticks it gives you a maple leaf.
		//-------------------------------
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
		//this is shapeless you just need two maple leaves to make a maple flag block.
		//-------------------------------------------
		
		//GameRegistry.addRecipe(new ShapedOreRecipe());
		//GameRegistry.addRecipe(new ShapelessOreRecipe();
		
		/*if you want to make it so your recipes you any type of the same item type in the game
		 * this is the registry you would use. 
		 */
	}
}
