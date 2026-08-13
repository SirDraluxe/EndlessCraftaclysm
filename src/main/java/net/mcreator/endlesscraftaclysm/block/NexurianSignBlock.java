package net.mcreator.endlesscraftaclysm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModWoodTypes;

public class NexurianSignBlock extends StandingSignBlock {
	public NexurianSignBlock(BlockBehaviour.Properties properties) {
		super(EndlesscraftaclysmModWoodTypes.NEXURIAN_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f).noCollision().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}