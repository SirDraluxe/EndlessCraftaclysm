package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.endlesscraftaclysm.network.EndlesscraftaclysmModVariables;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

public class NexurianElementalRaidTier1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && EndlesscraftaclysmModVariables.NexurianERaidActive == true) {
			if (EndlesscraftaclysmModVariables.NexurianERaidWave == 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
									_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"bossbar set nexeraid_bossbar max 24");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
									_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"bossbar set nexeraid_bossbar color blue");
				if (entity instanceof ServerPlayer _player)
					_player.sendSystemMessage(Component.literal("The Nexurian Army is approaching in 5 seconds."), true);
				EndlesscraftaclysmMod.queueServerWork(100, () -> {
					if (entity instanceof ServerPlayer _player)
						_player.sendSystemMessage(Component.literal("Start!"), true);
					EndlesscraftaclysmModVariables.NexurianERaidMobRemains = 24;
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "bossbar set nexeraid_bossbar value 24");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
				});
			}
			if (EndlesscraftaclysmModVariables.NexurianERaidWave == 2) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
									_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"bossbar set nexeraid_bossbar max 28");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
									_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"bossbar set nexeraid_bossbar name {\"text\":\"Nexurian Elemental Raid - Wave 2\",\"color\":\"blue\"}");
				EndlesscraftaclysmMod.queueServerWork(100, () -> {
					EndlesscraftaclysmModVariables.NexurianERaidMobRemains = 28;
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "bossbar set nexeraid_bossbar value 28");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_battlehog_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_battlehog_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_battlehog_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_battlehog_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 20)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_beamer_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 20)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_beamer_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 20), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_beamer_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 20), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_beamer_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
				});
			}
			if (EndlesscraftaclysmModVariables.NexurianERaidWave == 3) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
									_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"bossbar set nexeraid_bossbar max 32");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
									_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"bossbar set nexeraid_bossbar name {\"text\":\"Nexurian Elemental Raid - Wave 3\",\"color\":\"blue\"}");
				EndlesscraftaclysmMod.queueServerWork(100, () -> {
					EndlesscraftaclysmModVariables.NexurianERaidMobRemains = 32;
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "bossbar set nexeraid_bossbar value 32");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_battlehog_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_battlehog_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_battlehog_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_battlehog_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_corpse_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_alchemist_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_alchemist_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_alchemist_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 8)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 8), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO,
												_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon endlesscraftaclysm:nexurian_alchemist_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 16), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 16)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon endlesscraftaclysm:nexurian_armored_bug_raider ~ ~ ~ {ForgeData:{nexeraid:1b},Passengers:[{id:\"endlesscraftaclysm:nexurian_corpse\",HandItems:[{id:\"minecraft:iron_spear\",count:1}]}]}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 20)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_beamer_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 0), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 20)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_beamer_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 20), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_beamer_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 20), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 0)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_beamer_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 20), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 20)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_caller_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 20), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ - 20)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_caller_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX + 20), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 20)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_caller_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((EndlesscraftaclysmModVariables.NexurianERaidCenterX - 20), (EndlesscraftaclysmModVariables.NexurianERaidCenterY - 2), (EndlesscraftaclysmModVariables.NexurianERaidCenterZ + 20)), Vec2.ZERO, _level,
										LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon endlesscraftaclysm:nexurian_caller_raider ~ ~ ~ {ForgeData:{nexeraid:1b}}");
				});
			}
		}
	}
}