package hextec.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumOre extends Block
{

	public BlockTitaniumOre() {
		super(Material.rock);
		this.setUnlocalizedName("titanium_ore");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
}
