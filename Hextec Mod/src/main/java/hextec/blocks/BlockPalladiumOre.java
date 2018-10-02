package hextec.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class BlockPalladiumOre extends Block
{

	public BlockPalladiumOre() {
		super(Material.rock);
		this.setUnlocalizedName("palladium_ore");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setHardness(Blocks.diamond_ore.getBlockHardness(null, null));
		this.setHarvestLevel("pickaxe", 3);
	}
	
}
