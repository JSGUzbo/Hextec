package hextec.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopperOre extends Block
{

	public BlockCopperOre() {
		super(Material.rock);
		this.setUnlocalizedName("copper_ore");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
}
