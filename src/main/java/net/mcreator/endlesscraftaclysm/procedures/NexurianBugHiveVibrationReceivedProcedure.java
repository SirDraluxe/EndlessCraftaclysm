package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModEntities;
import net.mcreator.endlesscraftaclysm.entity.NexurianBugEntity;

public class NexurianBugHiveVibrationReceivedProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(16 / 2d), e -> true).isEmpty() == true
				&& !world.getEntitiesOfClass(NexurianBugEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(16 / 2d), e -> true).isEmpty() == false) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 1, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 1, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level, BlockPos.containing(x, y - 1, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			return true;
		}
		return false;
	}
}