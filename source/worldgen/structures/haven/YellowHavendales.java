package net.tslat.aoa3.worldgen.structures.haven;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class YellowHavendales extends AoAStructure {
	public YellowHavendales() {
		super("YellowHavendales");
	}
	
	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		int y = 0;

		while (y <= 2) {
			if (world.getBlockState(basePos.add(0, y, 0)).getBlock() == Blocks.AIR) {
				addBlock(world, basePos, 0, y, 0, AoABlocks.YELLOW_HAVENDALES_STEM.get().getDefaultState());
				y++;
			}
			else {
				break;
			}

			if (rand.nextInt(3) == 0)
				break;
		}

		addBlock(world, basePos, 0, y, 0, AoABlocks.YELLOW_HAVENDALES.get().getDefaultState());
	}
}
