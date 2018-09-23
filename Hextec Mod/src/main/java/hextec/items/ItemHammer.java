package hextec.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHammer extends Item
{
	public ItemHammer() 
	{
		this.setUnlocalizedName("hammer");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setMaxDamage(19);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		return itemStack;
	}
}
