package com.Tone.letsmodreboot.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.Tone.letsmodreboot.creativetab.creativeTabLMRB;
import com.Tone.letsmodreboot.reference.Materials;
import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemToneArmor extends ItemArmor {
	// item.letsmodreboot:tonesChestPlate.name=Tone's Chest Plate

	private static final int TA1 = 0;

	public ItemToneArmor() {
		super(Materials.Armor.tArmorStrength,TA1,1);   //0 is helmet--1 is chest -- 2 is legs -- 3 is feet
		//need to write out a code that draws it on the character
		this.setUnlocalizedName("tonesChestPlate");
		this.setCreativeTab(creativeTabLMRB.LMRB_TAB);

	}

	@Override
	public String getUnlocalizedName() {

		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		// item.modid:itemname.name
	};

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {

		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName()
				.substring(this.getUnlocalizedName().indexOf(".") + 1));
		// This code fetches the texture for the item
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

	}

}
