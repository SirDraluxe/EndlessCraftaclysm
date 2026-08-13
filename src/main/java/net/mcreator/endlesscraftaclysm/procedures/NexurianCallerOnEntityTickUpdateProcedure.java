package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModEntities;
import net.mcreator.endlesscraftaclysm.entity.NexurianCorpseEntity;
import net.mcreator.endlesscraftaclysm.entity.NexurianBugEntity;

public class NexurianCallerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(NexurianCorpseEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty() == false) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_CORPSE.get().spawn(_level, BlockPos.containing(x + 1, y + 1, z + 1), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if (!world.getEntitiesOfClass(NexurianBugEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty() == false) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_CORPSE.get().spawn(_level, BlockPos.containing(x + 1, y + 1, z + 1), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}