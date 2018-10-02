package hextec.items;

import hextec.Hextec;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemTitaniumPickaxe extends ItemPickaxe
{

	public ItemTitaniumPickaxe() {
		super(Hextec.titaniumToolMaterial);
		this.setUnlocalizedName("titanium_pickaxe");
		this.setCreativeTab(CreativeTabs.tabAllSearch);

	}

}
