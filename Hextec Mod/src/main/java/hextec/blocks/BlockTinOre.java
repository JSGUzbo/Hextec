package hextec.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class BlockTinOre extends Block
{

	public BlockTinOre() {
		super(Material.rock);
		this.setUnlocalizedName("tin_ore");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setHardness(Blocks.iron_ore.getBlockHardness(null, null));
		this.setHarvestLevel("pickaxe", 1);
	}
	
}
