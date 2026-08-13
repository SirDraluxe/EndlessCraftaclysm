package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModEntities;

public class NexurianBugHiveOnTickUpdateProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextDouble(RandomSource.create(), 1, 10) == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 1, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			return false;
		}
		return true;
	}
}