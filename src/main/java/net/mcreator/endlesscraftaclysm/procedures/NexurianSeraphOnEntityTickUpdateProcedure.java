package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.endlesscraftaclysm.network.EndlesscraftaclysmModVariables;

public class NexurianSeraphOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double SeraphTNTCharge = 0;
		if (!world.isClientSide()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"effect give @n[type=endlesscraftaclysm:nexurian_galanthis] minecraft:resistance infinite 5");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"effect give @n[type=endlesscraftaclysm:nexurian_galanthis] minecraft:regeneration infinite 1");
			if (entity.tickCount % 60 <= 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute at @p run summon lightning_bolt ~ ~ ~");
				EndlesscraftaclysmModVariables.NexurianSeraphCharge = EndlesscraftaclysmModVariables.NexurianSeraphCharge + 1;
				if (EndlesscraftaclysmModVariables.NexurianSeraphCharge == 5) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute at @p run summon tnt ~ ~ ~");
					EndlesscraftaclysmModVariables.NexurianSeraphCharge = 0;
				}
			}
		}
	}
}