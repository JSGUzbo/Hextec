package hextec.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class BlockCopperOre extends Block
{

	public BlockCopperOre() {
		super(Material.rock);
		this.setUnlocalizedName("copper_ore");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(Blocks.stone.getBlockHardness(null, null));
	}
	
}
