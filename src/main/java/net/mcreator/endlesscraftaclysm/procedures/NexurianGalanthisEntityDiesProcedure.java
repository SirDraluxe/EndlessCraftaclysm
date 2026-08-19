package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.endlesscraftaclysm.network.EndlesscraftaclysmModVariables;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

public class NexurianGalanthisEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		EndlesscraftaclysmMod.queueServerWork(40, () -> {
			EndlesscraftaclysmModVariables.NexurianGalanthisSummonCharge = 0;
			EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge = 0;
		});
	}
}