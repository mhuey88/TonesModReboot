package com.Tone.letsmodreboot.item.armor;


import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.Tone.letsmodreboot.LMRBTester;
import com.Tone.letsmodreboot.creativetab.creativeTabLMRB;


public class TonesArmor extends ItemArmor {

	public TonesArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		/*to get this information from above I had to do a 
		 * auto load in for a constructor.
		 * SO i created the class extended it to ItemArmor
		 * then once it complained did a right click and added the constructor.
		 */
		
		this.setCreativeTab(creativeTabLMRB.LMRB_TAB);
		
		
		
	}
	
	public String getArmorTexture(ItemStack  stack, Entity entity, int slot, String type){
		if(stack.getItem()== LMRBTester.ToneHelmet || stack.getItem()== LMRBTester.ToneChestPlate||stack.getItem()== LMRBTester.ToneLeggings ||stack.getItem()== LMRBTester.ToneFeet ){
			return "LMRBTester:textures/models/armor/ToneArmor_1.png";
			
		}
		if(stack.getItem() == LMRBTester.ToneFeet){
			return "LMRBTester:textures/models/armor/ToneArmor_1.png";	
			
		}else return null;
		
		
	}
	

}
