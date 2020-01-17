package net.tslat.aoa3.structure.shyrelands;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class DivinePlatform extends AoAStructure {
	private static final IBlockState whiteBricks = BlockRegister.bricksShyreWhite.getDefaultState();
	private static final IBlockState yellowBricks = BlockRegister.bricksShyreYellow.getDefaultState();
	private static final IBlockState shyreGlass = BlockRegister.glassShyre.getDefaultState();
	private static final IBlockState divineStation = BlockRegister.divineStation.getDefaultState();
	private static final IBlockState ironBars = Blocks.IRON_BARS.getDefaultState();
	private static final IBlockState stairsNorth = BlockRegister.stairsShyreYellowBricks.getDefaultState();
	private static final IBlockState stairsWest = stairsNorth.withProperty(BlockStairs.FACING, EnumFacing.WEST);
	private static final IBlockState stairsEast = stairsNorth.withProperty(BlockStairs.FACING, EnumFacing.EAST);
	private static final IBlockState stairsSouth = stairsNorth.withProperty(BlockStairs.FACING, EnumFacing.SOUTH);
	private static final IBlockState stairsSouthLeft = stairsWest.withProperty(BlockStairs.SHAPE, BlockStairs.EnumShape.OUTER_LEFT);
	private static final IBlockState stairsSouthRight = stairsEast.withProperty(BlockStairs.SHAPE, BlockStairs.EnumShape.OUTER_RIGHT);
	private static final IBlockState stairsEastLeft = stairsSouth.withProperty(BlockStairs.SHAPE, BlockStairs.EnumShape.OUTER_LEFT);
	private static final IBlockState stairsEastRight = stairsNorth.withProperty(BlockStairs.SHAPE, BlockStairs.EnumShape.OUTER_RIGHT);
	private static final IBlockState stairsNorthLeft = stairsEast.withProperty(BlockStairs.SHAPE, BlockStairs.EnumShape.OUTER_LEFT);
	private static final IBlockState stairsNorthRight = stairsWest.withProperty(BlockStairs.SHAPE, BlockStairs.EnumShape.OUTER_RIGHT);
	private static final IBlockState stairsWestLeft = stairsNorth.withProperty(BlockStairs.SHAPE, BlockStairs.EnumShape.OUTER_LEFT);
	private static final IBlockState stairsWestRight = stairsSouth.withProperty(BlockStairs.SHAPE, BlockStairs.EnumShape.OUTER_RIGHT);

	public DivinePlatform() {
		super("DivinePlatform");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 5, stairsEastLeft);
		addBlock(world, basePos, 2, 0, 6, stairsEast);
		addBlock(world, basePos, 2, 0, 7, stairsEast);
		addBlock(world, basePos, 2, 0, 8, stairsEastRight);
		addBlock(world, basePos, 3, 0, 3, yellowBricks);
		addBlock(world, basePos, 3, 0, 4, yellowBricks);
		addBlock(world, basePos, 3, 0, 5, yellowBricks);
		addBlock(world, basePos, 3, 0, 6, yellowBricks);
		addBlock(world, basePos, 3, 0, 7, yellowBricks);
		addBlock(world, basePos, 3, 0, 8, yellowBricks);
		addBlock(world, basePos, 3, 0, 9, yellowBricks);
		addBlock(world, basePos, 3, 0, 10, yellowBricks);
		addBlock(world, basePos, 4, 0, 3, yellowBricks);
		addBlock(world, basePos, 4, 0, 4, shyreGlass);
		addBlock(world, basePos, 4, 0, 5, shyreGlass);
		addBlock(world, basePos, 4, 0, 6, shyreGlass);
		addBlock(world, basePos, 4, 0, 7, shyreGlass);
		addBlock(world, basePos, 4, 0, 8, shyreGlass);
		addBlock(world, basePos, 4, 0, 9, shyreGlass);
		addBlock(world, basePos, 4, 0, 10, yellowBricks);
		addBlock(world, basePos, 5, 0, 2, stairsSouthRight);
		addBlock(world, basePos, 5, 0, 3, yellowBricks);
		addBlock(world, basePos, 5, 0, 4, shyreGlass);
		addBlock(world, basePos, 5, 0, 5, whiteBricks);
		addBlock(world, basePos, 5, 0, 6, whiteBricks);
		addBlock(world, basePos, 5, 0, 7, whiteBricks);
		addBlock(world, basePos, 5, 0, 8, whiteBricks);
		addBlock(world, basePos, 5, 0, 9, shyreGlass);
		addBlock(world, basePos, 5, 0, 10, yellowBricks);
		addBlock(world, basePos, 5, 0, 11, stairsNorthLeft);
		addBlock(world, basePos, 6, 0, 2, stairsSouth);
		addBlock(world, basePos, 6, 0, 3, yellowBricks);
		addBlock(world, basePos, 6, 0, 4, shyreGlass);
		addBlock(world, basePos, 6, 0, 5, whiteBricks);
		addBlock(world, basePos, 6, 0, 6, shyreGlass);
		addBlock(world, basePos, 6, 0, 7, shyreGlass);
		addBlock(world, basePos, 6, 0, 8, whiteBricks);
		addBlock(world, basePos, 6, 0, 9, shyreGlass);
		addBlock(world, basePos, 6, 0, 10, yellowBricks);
		addBlock(world, basePos, 6, 0, 11, stairsNorth);
		addBlock(world, basePos, 7, 0, 2, stairsSouth);
		addBlock(world, basePos, 7, 0, 3, yellowBricks);
		addBlock(world, basePos, 7, 0, 4, shyreGlass);
		addBlock(world, basePos, 7, 0, 5, whiteBricks);
		addBlock(world, basePos, 7, 0, 6, shyreGlass);
		addBlock(world, basePos, 7, 0, 7, shyreGlass);
		addBlock(world, basePos, 7, 0, 8, whiteBricks);
		addBlock(world, basePos, 7, 0, 9, shyreGlass);
		addBlock(world, basePos, 7, 0, 10, yellowBricks);
		addBlock(world, basePos, 7, 0, 11, stairsNorth);
		addBlock(world, basePos, 8, 0, 2, stairsSouthLeft);
		addBlock(world, basePos, 8, 0, 3, yellowBricks);
		addBlock(world, basePos, 8, 0, 4, shyreGlass);
		addBlock(world, basePos, 8, 0, 5, whiteBricks);
		addBlock(world, basePos, 8, 0, 6, whiteBricks);
		addBlock(world, basePos, 8, 0, 7, whiteBricks);
		addBlock(world, basePos, 8, 0, 8, whiteBricks);
		addBlock(world, basePos, 8, 0, 9, shyreGlass);
		addBlock(world, basePos, 8, 0, 10, yellowBricks);
		addBlock(world, basePos, 8, 0, 11, stairsNorthRight);
		addBlock(world, basePos, 9, 0, 3, yellowBricks);
		addBlock(world, basePos, 9, 0, 4, shyreGlass);
		addBlock(world, basePos, 9, 0, 5, shyreGlass);
		addBlock(world, basePos, 9, 0, 6, shyreGlass);
		addBlock(world, basePos, 9, 0, 7, shyreGlass);
		addBlock(world, basePos, 9, 0, 8, shyreGlass);
		addBlock(world, basePos, 9, 0, 9, shyreGlass);
		addBlock(world, basePos, 9, 0, 10, yellowBricks);
		addBlock(world, basePos, 10, 0, 3, yellowBricks);
		addBlock(world, basePos, 10, 0, 4, yellowBricks);
		addBlock(world, basePos, 10, 0, 5, yellowBricks);
		addBlock(world, basePos, 10, 0, 6, yellowBricks);
		addBlock(world, basePos, 10, 0, 7, yellowBricks);
		addBlock(world, basePos, 10, 0, 8, yellowBricks);
		addBlock(world, basePos, 10, 0, 9, yellowBricks);
		addBlock(world, basePos, 10, 0, 10, yellowBricks);
		addBlock(world, basePos, 11, 0, 5, stairsWestRight);
		addBlock(world, basePos, 11, 0, 6, stairsWest);
		addBlock(world, basePos, 11, 0, 7, stairsWest);
		addBlock(world, basePos, 11, 0, 8, stairsWestLeft);
		addBlock(world, basePos, 6, 1, 6, divineStation);
		addBlock(world, basePos, 6, 1, 7, divineStation);
		addBlock(world, basePos, 7, 1, 6, divineStation);
		addBlock(world, basePos, 7, 1, 7, divineStation);
		addBlock(world, basePos, 4, 4, 4, shyreGlass);
		addBlock(world, basePos, 4, 4, 9, shyreGlass);
		addBlock(world, basePos, 9, 4, 4, shyreGlass);
		addBlock(world, basePos, 9, 4, 9, shyreGlass);
		addBlock(world, basePos, 4, 5, 4, ironBars);
		addBlock(world, basePos, 4, 5, 9, ironBars);
		addBlock(world, basePos, 9, 5, 4, ironBars);
		addBlock(world, basePos, 9, 5, 9, ironBars);
		addBlock(world, basePos, 4, 6, 4, ironBars);
		addBlock(world, basePos, 4, 6, 9, ironBars);
		addBlock(world, basePos, 9, 6, 4, ironBars);
		addBlock(world, basePos, 9, 6, 9, ironBars);
		addBlock(world, basePos, 3, 7, 3, shyreGlass);
		addBlock(world, basePos, 3, 7, 4, shyreGlass);
		addBlock(world, basePos, 3, 7, 5, shyreGlass);
		addBlock(world, basePos, 3, 7, 8, shyreGlass);
		addBlock(world, basePos, 3, 7, 9, shyreGlass);
		addBlock(world, basePos, 3, 7, 10, shyreGlass);
		addBlock(world, basePos, 4, 7, 3, shyreGlass);
		addBlock(world, basePos, 4, 7, 4, whiteBricks);
		addBlock(world, basePos, 4, 7, 5, whiteBricks);
		addBlock(world, basePos, 4, 7, 6, shyreGlass);
		addBlock(world, basePos, 4, 7, 7, shyreGlass);
		addBlock(world, basePos, 4, 7, 8, whiteBricks);
		addBlock(world, basePos, 4, 7, 9, whiteBricks);
		addBlock(world, basePos, 4, 7, 10, shyreGlass);
		addBlock(world, basePos, 5, 7, 3, shyreGlass);
		addBlock(world, basePos, 5, 7, 4, whiteBricks);
		addBlock(world, basePos, 5, 7, 6, whiteBricks);
		addBlock(world, basePos, 5, 7, 7, whiteBricks);
		addBlock(world, basePos, 5, 7, 9, whiteBricks);
		addBlock(world, basePos, 5, 7, 10, shyreGlass);
		addBlock(world, basePos, 6, 7, 4, shyreGlass);
		addBlock(world, basePos, 6, 7, 5, whiteBricks);
		addBlock(world, basePos, 6, 7, 8, whiteBricks);
		addBlock(world, basePos, 6, 7, 9, shyreGlass);
		addBlock(world, basePos, 7, 7, 4, shyreGlass);
		addBlock(world, basePos, 7, 7, 5, whiteBricks);
		addBlock(world, basePos, 7, 7, 8, whiteBricks);
		addBlock(world, basePos, 7, 7, 9, shyreGlass);
		addBlock(world, basePos, 8, 7, 3, shyreGlass);
		addBlock(world, basePos, 8, 7, 4, whiteBricks);
		addBlock(world, basePos, 8, 7, 6, whiteBricks);
		addBlock(world, basePos, 8, 7, 7, whiteBricks);
		addBlock(world, basePos, 8, 7, 9, whiteBricks);
		addBlock(world, basePos, 8, 7, 10, shyreGlass);
		addBlock(world, basePos, 9, 7, 3, shyreGlass);
		addBlock(world, basePos, 9, 7, 4, whiteBricks);
		addBlock(world, basePos, 9, 7, 5, whiteBricks);
		addBlock(world, basePos, 9, 7, 6, shyreGlass);
		addBlock(world, basePos, 9, 7, 7, shyreGlass);
		addBlock(world, basePos, 9, 7, 8, whiteBricks);
		addBlock(world, basePos, 9, 7, 9, whiteBricks);
		addBlock(world, basePos, 9, 7, 10, shyreGlass);
		addBlock(world, basePos, 10, 7, 3, shyreGlass);
		addBlock(world, basePos, 10, 7, 4, shyreGlass);
		addBlock(world, basePos, 10, 7, 5, shyreGlass);
		addBlock(world, basePos, 10, 7, 8, shyreGlass);
		addBlock(world, basePos, 10, 7, 9, shyreGlass);
		addBlock(world, basePos, 10, 7, 10, shyreGlass);
		addBlock(world, basePos, 3, 8, 3, ironBars);
		addBlock(world, basePos, 3, 8, 10, ironBars);
		addBlock(world, basePos, 10, 8, 3, ironBars);
		addBlock(world, basePos, 10, 8, 10, ironBars);
		addBlock(world, basePos, 3, 9, 3, yellowBricks);
		addBlock(world, basePos, 3, 9, 10, yellowBricks);
		addBlock(world, basePos, 10, 9, 3, yellowBricks);
		addBlock(world, basePos, 10, 9, 10, yellowBricks);
		addBlock(world, basePos, 1, 10, 1, whiteBricks);
		addBlock(world, basePos, 1, 10, 12, whiteBricks);
		addBlock(world, basePos, 2, 10, 2, yellowBricks);
		addBlock(world, basePos, 2, 10, 11, yellowBricks);
		addBlock(world, basePos, 11, 10, 2, yellowBricks);
		addBlock(world, basePos, 11, 10, 11, yellowBricks);
		addBlock(world, basePos, 12, 10, 1, whiteBricks);
		addBlock(world, basePos, 12, 10, 12, whiteBricks);
		addBlock(world, basePos, 0, 11, 1, whiteBricks);
		addBlock(world, basePos, 0, 11, 12, whiteBricks);
		addBlock(world, basePos, 1, 11, 0, whiteBricks);
		addBlock(world, basePos, 1, 11, 1, yellowBricks);
		addBlock(world, basePos, 1, 11, 12, yellowBricks);
		addBlock(world, basePos, 1, 11, 13, whiteBricks);
		addBlock(world, basePos, 12, 11, 0, whiteBricks);
		addBlock(world, basePos, 12, 11, 1, yellowBricks);
		addBlock(world, basePos, 12, 11, 12, yellowBricks);
		addBlock(world, basePos, 12, 11, 13, whiteBricks);
		addBlock(world, basePos, 13, 11, 1, whiteBricks);
		addBlock(world, basePos, 13, 11, 12, whiteBricks);
		addBlock(world, basePos, 0, 12, 0, yellowBricks);
		addBlock(world, basePos, 0, 12, 13, yellowBricks);
		addBlock(world, basePos, 13, 12, 0, yellowBricks);
		addBlock(world, basePos, 13, 12, 13, yellowBricks);
	}
}
