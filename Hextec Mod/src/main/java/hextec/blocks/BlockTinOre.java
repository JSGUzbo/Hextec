package hextec.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTinOre extends Block
{

	public BlockTinOre() {
		super(Material.rock);
		this.setUnlocalizedName("tin_ore");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
}
