package com.Tone.letsmodreboot.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.Tone.letsmodreboot.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLMRB extends Block {
	
	public BlockLMRB(Material material){
		super(material);
		 //this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
		
		
	}
	public BlockLMRB() {
		
		this(Material.rock);
	}
	
	@Override
	public String getUnlocalizedName(){
		
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		//tile.modid:blockname.name
	};
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
		
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+ 1);
		
	}
	
	

}
