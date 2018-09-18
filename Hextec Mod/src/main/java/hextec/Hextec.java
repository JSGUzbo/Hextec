package hextec;

import hextec.items.ItemCopperIngot;
import hextec.items.ItemHammer;
import hextec.items.ItemIronPlate;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Hextec.MODID, version = Hextec.VERSION)
public class Hextec 
{
    public static final String MODID = "hextec";
    public static final String VERSION = "1.0";
    
    //variablen items
    public static Item copper_ingot = new ItemCopperIngot();
    public static Item hammer = new ItemHammer();
    public static Item iron_plate = new ItemIronPlate();
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent e)
    {
    	//crafting(shapeless)
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.string,4), new ItemStack(Blocks.wool));
    	
    	//crafting(shaped)
    	
    }
    
    @EventHandler
    public void inti(FMLInitializationEvent e)
    {
    	//items
    	GameRegistry.registerItem(copper_ingot, "copper_ingot");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(copper_ingot, 0, new ModelResourceLocation("hextec:copper_ingot","inventory"));
    	
    	GameRegistry.registerItem(hammer, "hammer");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(hammer, 0, new ModelResourceLocation("hextec:hammer","inventory"));
    	
    	GameRegistry.registerItem(iron_plate, "iron_plate");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(iron_plate, 0, new ModelResourceLocation("hextec:iron_plate","inventory"));
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent e)
    {
    	
    }
}
