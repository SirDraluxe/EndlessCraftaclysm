package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.endlesscraftaclysm.network.EndlesscraftaclysmModVariables;

public class NexurianCallerOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (EndlesscraftaclysmModVariables.NexurianERaidActive == true) {
			entity.getPersistentData().putBoolean("nexeraid", true);
		} else {
			entity.getPersistentData().putBoolean("nexeraid", false);
		}
	}
}