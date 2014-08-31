package com.Tone.letsmodreboot.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.Tone.letsmodreboot.creativetab.creativeTabLMRB;
import com.Tone.letsmodreboot.reference.Materials;
import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToneChestPlate extends ItemArmor {
	private static int TA1;
	
	
	

	public ItemToneChestPlate() {
		super(Materials.Armor.TonesArmor, TA1, 1);
		this.setCreativeTab(creativeTabLMRB.LMRB_TAB);
		this.setUnlocalizedName("toneChestPlate2");

		/*ItemToneArmorSet toneChestPlate = new ItemToneArmorSet();
		ItemToneArmorSet toneHelmet = new ItemToneArmorSet();
		ItemToneArmorSet toneLeggings = new ItemToneArmorSet();
		ItemToneArmorSet toneFeet = new ItemToneArmorSet();

		toneChestPlate.setUnlocalizedName("toneChestPlate");
		toneHelmet.setUnlocalizedName("toneHelmet");
		toneLeggings.setUnlocalizedName("toneLeggings");
		toneFeet.setUnlocalizedName("toneFeet");*/

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
