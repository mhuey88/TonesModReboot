package com.Tone.letsmodreboot;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.Tone.letsmodreboot.item.armor.TonesArmor;

import cpw.mods.fml.common.registry.GameRegistry;

public class LMRBTester extends LetsModReboot {
	
	
	
	private static int RA1;
	private static int RA2; 
	private static int RA3;
	private static int RA4;
	
	public static ArmorMaterial ToneArmorProperties= EnumHelper.addArmorMaterial("ToneArmorProperties", 66,new int[]{6,16,12,6}, 10);
	//"NameOfArmorMaterial", DamageBeforeBreakage, new int[](Helmet, Chest plate, Leggings, Boots), Enchantment level);
	//--------------------------------------------
	//public static Item ToneFakeItem = new ToneArmorSet(ToneSpecialArmor, RA1, 0).setUnlocalizedName("toneFakeItem").setTextureName("toneFakeItem");
	
	//--------------------------------------------------
	public static Item ToneHelmet = new TonesArmor(ToneArmorProperties, RA1, 0).setUnlocalizedName("toneHelmet").setTextureName("toneHelmet");
	public static Item ToneChestPlate = new TonesArmor(ToneArmorProperties, RA2, 1).setUnlocalizedName("toneChestPlate").setTextureName("toneHelmet");
	public static Item ToneLeggings = new TonesArmor(ToneArmorProperties, RA3, 2).setUnlocalizedName("toneLeggings").setTextureName("toneHelmet");
	public static Item ToneFeet = new TonesArmor(ToneArmorProperties, RA4, 3).setUnlocalizedName("toneFeet").setTextureName("toneHelmet");
	
	//public LMRBTester{}
	
	public static void init(){
		
		
		
		GameRegistry.registerItem(ToneHelmet, "toneHelmet");
		GameRegistry.registerItem(ToneChestPlate, "toneChestPlate");
		GameRegistry.registerItem(ToneLeggings, "toneLeggings");
		GameRegistry.registerItem(ToneFeet, "toneFeet");
		
		
		//GameRegistry.addRecipe(new ItemStack itemStack){}//
		
	
	}
	



}
