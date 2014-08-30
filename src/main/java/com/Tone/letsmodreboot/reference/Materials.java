package com.Tone.letsmodreboot.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {

	public static final class Tools {

		public static final Item.ToolMaterial tSwordStrength = EnumHelper
				.addToolMaterial("ToneSwordStrength", 3, 1600, 12.0F, 8.0F, 22);

	}
	public static final class Armor {
		
		public static final ArmorMaterial tArmorStrength = EnumHelper.addArmorMaterial("TonesArmor",66,new int[]{6,16,12,6},10);
		
	}
	
}
