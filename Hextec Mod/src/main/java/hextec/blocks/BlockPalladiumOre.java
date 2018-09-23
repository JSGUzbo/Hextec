package hextec.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPalladiumOre extends Block
{

	public BlockPalladiumOre() {
		super(Material.rock);
		this.setUnlocalizedName("palladium_ore");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
}
