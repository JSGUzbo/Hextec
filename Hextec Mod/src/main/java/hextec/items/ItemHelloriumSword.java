package hextec.items;

import hextec.Hextec;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemHelloriumSword extends ItemSword
{

	public ItemHelloriumSword() 
	{
		super(Hextec.helloriumToolMaterial);
		this.setUnlocalizedName("hellorium_sword");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
