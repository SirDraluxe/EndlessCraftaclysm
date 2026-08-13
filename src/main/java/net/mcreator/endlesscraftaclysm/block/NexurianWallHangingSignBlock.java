package net.mcreator.endlesscraftaclysm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModWoodTypes;
import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModBlocks;

public class NexurianWallHangingSignBlock extends WallHangingSignBlock {
	public NexurianWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(EndlesscraftaclysmModWoodTypes.NEXURIAN_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f).noCollision().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn()
				.overrideLootTable(EndlesscraftaclysmModBlocks.NEXURIAN_HANGING_SIGN.get().getLootTable()).overrideDescription(EndlesscraftaclysmModBlocks.NEXURIAN_HANGING_SIGN.get().getDescriptionId()));
	}
}