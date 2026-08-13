package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.endlesscraftaclysm.network.EndlesscraftaclysmModVariables;
import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModEntities;
import net.mcreator.endlesscraftaclysm.entity.NexurianCorpseEntity;

import java.util.Comparator;

public class NexurianTurretRaidSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (EndlesscraftaclysmModVariables.NexurianERaidActive == true) {
			entity.getPersistentData().putBoolean("nexeraid", true);
		} else {
			entity.getPersistentData().putBoolean("nexeraid", false);
		}
		if (EndlesscraftaclysmModVariables.NexurianERaidActive == true && Mth.nextInt(RandomSource.create(), 0, 100) <= 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BEAMER.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			(findEntityInWorldRange(world, NexurianCorpseEntity.class, x, y, z, 1)).startRiding(entity);
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}