package hextec;

import hextec.blocks.BlockCopperOre;
import hextec.blocks.BlockPalladiumOre;
import hextec.blocks.BlockTinOre;
import hextec.blocks.BlockTitaniumOre;
import hextec.items.ItemCopperIngot;
import hextec.items.ItemDough;
import hextec.items.ItemHammer;
import hextec.items.ItemHelloriumIngot;
import hextec.items.ItemHelloriumSword;
import hextec.items.ItemIronPlate;
import hextec.items.ItemPalladiumIngot;
import hextec.items.ItemTinIngot;
import hextec.items.ItemTitaniumIngot;
import hextec.items.ItemTitaniumPickaxe;
import hextec.util.CopperOreGenerator;
import hextec.util.PalladiumOreGenerator;
import hextec.util.TinOreGenerator;
import hextec.util.TitaniumOreGenerator;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Hextec.MODID, version = Hextec.VERSION)
public class Hextec 
{
    public static final String MODID = "hextec";
    public static final String VERSION = "1.0";
    
  //Toolmaterials
    public static ToolMaterial helloriumToolMaterial = EnumHelper.addToolMaterial("hellorium", 5, 2000, 7, 8, 3);
    public static ToolMaterial titaniumToolMaterial = EnumHelper.addToolMaterial("titanium", ToolMaterial.EMERALD.getHarvestLevel(), ToolMaterial.EMERALD.getMaxUses()-500, ToolMaterial.EMERALD.getEfficiencyOnProperMaterial(), ToolMaterial.EMERALD.getDamageVsEntity(), ToolMaterial.EMERALD.getEnchantability());
    public static ToolMaterial bronzeToolMaterial = EnumHelper.addToolMaterial("bronze", ToolMaterial.IRON.getHarvestLevel(), ToolMaterial.IRON.getMaxUses()-500, ToolMaterial.IRON.getEfficiencyOnProperMaterial(), ToolMaterial.IRON.getDamageVsEntity(), ToolMaterial.IRON.getEnchantability());
    
    //Variables items
    public static Item copper_ingot = new ItemCopperIngot();
    public static Item hellorium_ingot = new ItemHelloriumIngot();
    public static Item palladium_ingot = new ItemPalladiumIngot();
    public static Item tin_ingot = new ItemTinIngot();
    public static Item titanium_ingot = new ItemTitaniumIngot();
    public static Item hammer = new ItemHammer();
    public static Item iron_plate = new ItemIronPlate();
    public static Item dough = new ItemDough();
    
    //Schwerter
    public static ItemSword hellorium_sword = new ItemHelloriumSword();
    
    //Pickaxes
    public static ItemPickaxe titanium_pickaxe = new ItemTitaniumPickaxe();
    
    //Variables blocks
    public static Block copper_ore = new BlockCopperOre();
    public static Block palladium_ore = new BlockPalladiumOre();
    public static Block tin_ore = new BlockTinOre();
    public static Block titanium_ore = new BlockTitaniumOre();
    
    
    
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent e)
    {
    	//crafting(shapeless)
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.string,4), new ItemStack(Blocks.wool));
    	
    	//crafting(shaped)
    	GameRegistry.addShapedRecipe(new ItemStack(Blocks.web), "s s"," s ","s s",'s',new ItemStack(Items.string));
    	//Ofenrezepte
    	
    }
    
    @EventHandler
    public void inti(FMLInitializationEvent e)
    {
    	//items
    	GameRegistry.registerItem(copper_ingot, "copper_ingot");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(copper_ingot, 0, new ModelResourceLocation("hextec:copper_ingot","inventory"));
    	
		GameRegistry.registerItem(hellorium_ingot, "hellorium_ingot");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(hellorium_ingot, 0, new ModelResourceLocation("hextec:hellorium_ingot","inventory"));
    	
    	GameRegistry.registerItem(palladium_ingot, "palladium_ingot");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(palladium_ingot, 0, new ModelResourceLocation("hextec:palladium_ingot","inventory"));
    	
    	GameRegistry.registerItem(tin_ingot, "tin_ingot");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(tin_ingot, 0, new ModelResourceLocation("hextec:tin_ingot","inventory"));
    	
    	GameRegistry.registerItem(titanium_ingot, "titanium_ingot");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(titanium_ingot, 0, new ModelResourceLocation("hextec:titanium_ingot","inventory"));
    	
    	GameRegistry.registerItem(hammer, "hammer");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(hammer, 0, new ModelResourceLocation("hextec:hammer","inventory"));
    	
    	GameRegistry.registerItem(iron_plate, "iron_plate");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(iron_plate, 0, new ModelResourceLocation("hextec:iron_plate","inventory"));
    	
    	GameRegistry.registerItem(hellorium_sword, "hellorium_sword");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(hellorium_sword, 0, new ModelResourceLocation("hextec:hellorium_sword","inventory"));
    	
    	GameRegistry.registerItem(dough, "dough");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(dough, 0, new ModelResourceLocation("hextec:dough","inventory"));
    	
    	//Blocks
    	GameRegistry.registerBlock(copper_ore,"copper_ore");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(copper_ore), 0, new ModelResourceLocation("hextec:copper_ore","inventory"));
    	
    	GameRegistry.registerBlock(palladium_ore,"palladium_ore");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(palladium_ore), 0, new ModelResourceLocation("hextec:palladium_ore","inventory"));
    	
    	GameRegistry.registerBlock(tin_ore,"tin_ore");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(tin_ore), 0, new ModelResourceLocation("hextec:tin_ore","inventory"));
    	
    	GameRegistry.registerBlock(titanium_ore,"titanium_ore");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(titanium_ore), 0, new ModelResourceLocation("hextec:titanium_ore","inventory"));
    	
    	//crafting(Moditem)
    	GameRegistry.addRecipe(new ItemStack(iron_plate),"iii","iii","h  ",'i',new ItemStack(Items.iron_ingot),'h',new ItemStack(hammer,1,OreDictionary.WILDCARD_VALUE));
    	GameRegistry.addShapelessRecipe(new ItemStack(dough), new ItemStack(Items.wheat),new ItemStack(Items.sugar));
    	//Smelting(Moditem)
    	GameRegistry.addSmelting(copper_ore,new ItemStack(copper_ingot), 20f);
    	GameRegistry.addSmelting(tin_ore,new ItemStack(tin_ingot), 25f);
    	GameRegistry.addSmelting(titanium_ore,new ItemStack(titanium_ingot), 30f);
    	GameRegistry.addSmelting(palladium_ore,new ItemStack(palladium_ingot), 40f);
    	GameRegistry.addSmelting(dough ,new ItemStack(Items.bread), 5f);
    	
    	//Worldgenerator
    	GameRegistry.registerWorldGenerator(new CopperOreGenerator(copper_ore), 1);
    	GameRegistry.registerWorldGenerator(new PalladiumOreGenerator(palladium_ore), 1);
    	GameRegistry.registerWorldGenerator(new TinOreGenerator(tin_ore), 1);
    	GameRegistry.registerWorldGenerator(new TitaniumOreGenerator(titanium_ore), 1);
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent e)
    {
    	
    }
}
