package net.tslat.aoa3.worldgen.structures.voxponds;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class ToxicStem4 extends AoAStructure { //StructureSize: 1x4x2
	private static final BlockState toxicStem = AoABlocks.TOXIC_STEM.get().getDefaultState();

	public ToxicStem4() {
		super("ToxicStem4");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, toxicStem);
		addBlock(world, basePos, 0, 1, 0, toxicStem);
		addBlock(world, basePos, 0, 2, 0, toxicStem);
		addBlock(world, basePos, 0, 2, 1, toxicStem);
		addBlock(world, basePos, 0, 3, 1, toxicStem);
	}
}
