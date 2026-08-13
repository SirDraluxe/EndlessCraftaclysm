package net.mcreator.endlesscraftaclysm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModWoodTypes;

public class NexurianHangingSignBlock extends CeilingHangingSignBlock {
	public NexurianHangingSignBlock(BlockBehaviour.Properties properties) {
		super(EndlesscraftaclysmModWoodTypes.NEXURIAN_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f).noCollision().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}