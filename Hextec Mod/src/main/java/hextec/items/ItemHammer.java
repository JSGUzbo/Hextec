package hextec.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHammer extends Item
{
	public ItemHammer() 
	{
		this.setUnlocalizedName("hammer");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setMaxDamage(20);
	}
}
