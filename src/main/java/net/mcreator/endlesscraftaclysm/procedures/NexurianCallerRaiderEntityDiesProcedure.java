package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.endlesscraftaclysm.network.EndlesscraftaclysmModVariables;
import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModEntities;

public class NexurianCallerRaiderEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_CORPSE.get().spawn(_level,
					BlockPos.containing(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY + 1, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EndlesscraftaclysmModEntities.NEXURIAN_BUG.get().spawn(_level,
					BlockPos.containing(EndlesscraftaclysmModVariables.NexurianERaidCenterX + 1, EndlesscraftaclysmModVariables.NexurianERaidCenterY + 1, EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 1), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (!world.isClientSide() && EndlesscraftaclysmModVariables.NexurianERaidActive == true) {
			EndlesscraftaclysmModVariables.NexurianERaidMobRemains = EndlesscraftaclysmModVariables.NexurianERaidMobRemains - 1;
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
								_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("bossbar set nexeraid_bossbar value " + Math.round(EndlesscraftaclysmModVariables.NexurianERaidMobRemains)));
			if (EndlesscraftaclysmModVariables.NexurianERaidMobRemains == 0) {
				EndlesscraftaclysmModVariables.NexurianERaidWave = EndlesscraftaclysmModVariables.NexurianERaidWave + 1;
				NexurianElementalRaidTier1Procedure.execute(world, entity);
			}
		}
	}
}