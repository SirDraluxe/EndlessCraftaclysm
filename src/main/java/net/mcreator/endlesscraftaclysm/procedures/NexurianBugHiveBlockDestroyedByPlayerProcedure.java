package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModEntities;

public class NexurianBugHiveBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 0, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 0, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 0, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 0, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 0, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
	}
}