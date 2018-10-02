package hextec.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class BlockTitaniumOre extends Block
{

	public BlockTitaniumOre() {
		super(Material.rock);
		this.setUnlocalizedName("titanium_ore");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setHardness(Blocks.diamond_ore.getBlockHardness(null, null));
		this.setHarvestLevel("pickaxe", 2);
	}
	
}
