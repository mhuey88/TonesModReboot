package com.Tone.letsmodreboot.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.Tone.letsmodreboot.creativetab.creativeTabLMRB;
import com.Tone.letsmodreboot.reference.Materials;
import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToneSword extends ItemSword {

	public ItemToneSword() {
		super(Materials.Tools.tSwordStrength);
		//You added a custom sword strength
		//-----------------------------------------
		
		// you could have set as  "super(material.IRON)" and it would have been as strong as iron.
		this.setUnlocalizedName("tonesSword");
		this.setCreativeTab(creativeTabLMRB.LMRB_TAB);
		//this.maxStackSize = 1;

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
