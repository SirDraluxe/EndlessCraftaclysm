package net.mcreator.endlesscraftaclysm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class NexurianStoneBlock extends Block {
	public NexurianStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.7f, 7f));
	}
}