package com.dinoethan.theprimevalmod.blocks.trees;

import java.util.List;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import com.dinoethan.theprimevalmod.util.IHasModel;

public class BlockLeavesBase extends BlockLeaves implements IHasModel 
{

	public void registerModels() {
		
	}

	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world,
			BlockPos pos, int fortune) {
		return null;
	}

	@Override
	public EnumType getWoodType(int meta) {
		return null;
	}
	
}
