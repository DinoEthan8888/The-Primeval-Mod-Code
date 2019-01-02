package com.dinoethan.theprimevalmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

import com.dinoethan.theprimevalmod.main;
import com.dinoethan.theprimevalmod.blocks.AmberBlock;
import com.dinoethan.theprimevalmod.blocks.AmberLamp;
import com.dinoethan.theprimevalmod.blocks.AmberOre;
import com.dinoethan.theprimevalmod.blocks.MonkeyPuzzlePlanks;
import com.dinoethan.theprimevalmod.blocks.PrecambrianOre;
import com.dinoethan.theprimevalmod.blocks.slabs.BlockSlabDoubleBase;
import com.dinoethan.theprimevalmod.blocks.slabs.BlockSlabHalfBase;
import com.dinoethan.theprimevalmod.blocks.trees.BlockLeavesBase;
import com.dinoethan.theprimevalmod.blocks.trees.BlockLogBase;
import com.dinoethan.theprimevalmod.blocks.trees.BlockSaplingBase;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block AMBER_ORE_BLOCK = new AmberOre("amber_ore_block", Material.ROCK);
	public static final Block AMBER_BLOCK = new AmberBlock("amber_block", Material.IRON);
	public static final Block AMBER_LAMP = new AmberLamp("amber_lamp", Material.REDSTONE_LIGHT);
	public static final Block PRECAMBRIAN_ORE = new PrecambrianOre("precambrian_ore", Material.ROCK);
	public static final Block MONKEYPUZZLE_LOG = new BlockLogBase("monkeypuzzle_log");
	public static final Block MONKEYPUZZLE_PLANKS = new MonkeyPuzzlePlanks("monkeypuzzle_planks", Material.WOOD);
	public static final Block MONKEYPUZZLE_LEAVES = new BlockLeavesBase();
	public static final Block MONKEYPUZZLE_SAPLING = new BlockSaplingBase();
	public static final BlockSlab MONKEYPUZZLE_SLAB_DOUBLE = new BlockSlabDoubleBase("mokeypuzzle_slab_double", Material.WOOD, main.primevaltab, ModBlocks.MONKEYPUZZLE_SLAB_HALF);
    public static final BlockSlab MONKEYPUZZLE_SLAB_HALF = new BlockSlabHalfBase("monkeypuzzle_slab_half", Material.WOOD, main.primevaltab, ModBlocks.MONKEYPUZZLE_SLAB_HALF, ModBlocks.MONKEYPUZZLE_SLAB_DOUBLE);
}
