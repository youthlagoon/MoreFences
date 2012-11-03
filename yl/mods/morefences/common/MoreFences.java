package yl.mods.morefences.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.BlockFence;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;


@Mod(modid = "yl_morefences", name = "More Fences", version = "0.1a")

public class MoreFences {
	
	public static Block moreFencesWood;
	public static Block moreFencesWoodGate;
	public static Block moreFencesIron;
	public static Block moreFencesIronGate;
	public static Block moreFencesGlass;
	public static Block moreFencesGlassGate;
	public static Block moreFencesStone;
	public static Block moreFencesStoneGate;
	public static Block moreFencesObsidian;
	public static Block moreFencesObsidianGate;
	public static Block moreFencesGlowStone;
	public static Block moreFencesGlowStoneGate;
	
	
	@Init
	public void modInit(FMLInitializationEvent event){
		makeBlocks();
		nameBlocks();
		registerBlocks();
		addRecipes();
		
	}
	
	
	
	//Make new blocks.
	private void makeBlocks(){
		moreFencesWood = new MakeMFBlock(3231, 21).setBlockName("ylMFWood").setHardness(2.0f).setResistance(5.0f);
		moreFencesWoodGate = new MakeMFGateBlock(3331, 21).setBlockName("ylMFWoodGate").setHardness(2.0f).setResistance(5.0f);
		
		moreFencesIron = new MakeMFBlock(3232, 22).setBlockName("ylMFIron").setHardness(2.0f).setResistance(5.0f);
		moreFencesIronGate = new MakeMFGateBlock(3332, 22).setBlockName("ylMFIronGate").setHardness(2.0f).setResistance(5.0f);
		
		moreFencesGlass = new MakeMFBlock(3233, 67).setBlockName("ylMFGlass").setHardness(2.0f).setResistance(5.0f);
		moreFencesGlassGate = new MakeMFGateBlock(3333, 67).setBlockName("ylMFGlassGate").setHardness(2.0f).setResistance(5.0f);
		
		moreFencesStone = new MakeMFBlock(3234, 6).setBlockName("ylMFStone").setHardness(2.0f).setResistance(5.0f);
		moreFencesStoneGate = new MakeMFGateBlock(3334, 6).setBlockName("ylMFStoneGate").setHardness(2.0f).setResistance(5.0f);
		
		moreFencesObsidian = new MakeMFBlock(3235, 37).setBlockName("ylMFObsidian").setHardness(3.0f).setResistance(8.0f);
		moreFencesObsidianGate = new MakeMFGateBlock(3335, 37).setBlockName("ylMFObsidianGate").setHardness(3.0f).setResistance(8.0f);

		moreFencesGlowStone = new MakeMFBlock(3236, 105).setBlockName("ylMFGlowStone").setHardness(3.0f).setResistance(8.0f).setLightValue(0.75f);
		moreFencesGlowStoneGate = new MakeMFGateBlock(3336, 105).setBlockName("ylMFGLowStoneGate").setHardness(3.0f).setResistance(8.0f).setLightValue(0.75f);

	}
	
	
	//Name of blocks added to language registry.
	private void nameBlocks(){
		LanguageRegistry.addName(moreFencesWood, "Log Fence");
		LanguageRegistry.addName(moreFencesWoodGate, "Log Gate");
		
		LanguageRegistry.addName(moreFencesIron, "Iron Fence");
		LanguageRegistry.addName(moreFencesIronGate, "Iron Gate");
		
		LanguageRegistry.addName(moreFencesGlass, "Glass Fence");
		LanguageRegistry.addName(moreFencesGlassGate, "Glass Gate");
		
		LanguageRegistry.addName(moreFencesStone, "Stone Fence");
		LanguageRegistry.addName(moreFencesStoneGate, "Stone Gate");
		
		LanguageRegistry.addName(moreFencesObsidian, "Obsidian Fence");
		LanguageRegistry.addName(moreFencesObsidianGate, "Obsidian Gate");
		
		LanguageRegistry.addName(moreFencesObsidian, "Glow Stone Fence");
		LanguageRegistry.addName(moreFencesObsidianGate, "Glow Stone Gate");
	}

	
	//Blocks added to game registry.
	private void registerBlocks(){
		GameRegistry.registerBlock(moreFencesWood);
		GameRegistry.registerBlock(moreFencesWoodGate);
		
		GameRegistry.registerBlock(moreFencesIron);
		GameRegistry.registerBlock(moreFencesIronGate);
		
		GameRegistry.registerBlock(moreFencesGlass);
		GameRegistry.registerBlock(moreFencesGlassGate);
		
		GameRegistry.registerBlock(moreFencesStone);
		GameRegistry.registerBlock(moreFencesStoneGate);
	
		GameRegistry.registerBlock(moreFencesObsidian);
		GameRegistry.registerBlock(moreFencesObsidianGate);
		
		GameRegistry.registerBlock(moreFencesGlowStone);
		GameRegistry.registerBlock(moreFencesGlowStoneGate);
	}
	
	
	//Recipes added to game registry.
	private void addRecipes(){
		//Wood Fence
		GameRegistry.addRecipe(new ItemStack(moreFencesWood,4), new Object[]{
			"yxy","yxy", Character.valueOf('x'), Item.stick, Character.valueOf('y'), Block.planks 
			});
		
		//Iron Fence
		GameRegistry.addRecipe(new ItemStack(moreFencesIron,4), new Object[]{
			"yxy","yxy", Character.valueOf('x'), Item.stick, Character.valueOf('y'), Item.ingotIron 
			});
		
		//Glass Fence
		GameRegistry.addRecipe(new ItemStack(moreFencesGlass,4), new Object[]{
			"yxy","yxy", Character.valueOf('x'), Item.stick, Character.valueOf('y'), Block.glass 
			});
		
		//Stone Fence
		GameRegistry.addRecipe(new ItemStack(moreFencesStone,4), new Object[]{
			"yxy","yxy", Character.valueOf('x'), Item.stick, Character.valueOf('y'), Block.stone 
			});
		
		//Obsidian Fence
		GameRegistry.addRecipe(new ItemStack(moreFencesObsidian,4), new Object[]{
			"yxy","yxy", Character.valueOf('x'), Item.stick, Character.valueOf('y'), Block.obsidian 
			});
	}
	
	
	
}
