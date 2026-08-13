package net.mcreator.endlesscraftaclysm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModWoodTypes;
import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModBlocks;

public class NexurianWallSignBlock extends WallSignBlock {
	public NexurianWallSignBlock(BlockBehaviour.Properties properties) {
		super(EndlesscraftaclysmModWoodTypes.NEXURIAN_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f).noCollision().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn()
				.overrideLootTable(EndlesscraftaclysmModBlocks.NEXURIAN_SIGN.get().getLootTable()).overrideDescription(EndlesscraftaclysmModBlocks.NEXURIAN_SIGN.get().getDescriptionId()));
	}
}