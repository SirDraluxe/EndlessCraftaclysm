package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.endlesscraftaclysm.network.EndlesscraftaclysmModVariables;
import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModItems;

public class NexurianStargazerOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EndlesscraftaclysmModItems.NEXURIAN_STONE_OF_MEMORY.get() && EndlesscraftaclysmModVariables.NexurianERaidActive == false
				&& !world.isClientSide()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack3 = new ItemStack(Blocks.AIR).copy();
				_setstack3.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			EndlesscraftaclysmModVariables.NexurianERaidActive = true;
			EndlesscraftaclysmModVariables.NexurianERaidWave = 1;
			EndlesscraftaclysmModVariables.NexurianERaidCenterX = x;
			EndlesscraftaclysmModVariables.NexurianERaidCenterY = y;
			EndlesscraftaclysmModVariables.NexurianERaidCenterX = z;
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ),
										Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"bossbar add nexeraid_bossbar {\"text\":\"Nexurian Elemental Raid - Wave 1\",\"color\":\"blue\"}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
								_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"bossbar set nexeraid_bossbar style notched_10");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ), Vec2.ZERO,
								_level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"bossbar set nexeraid_bossbar players @a");
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ),
							BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("event.raid.horn")), SoundSource.NEUTRAL, 50, 1);
				} else {
					_level.playLocalSound(EndlesscraftaclysmModVariables.NexurianERaidCenterX, EndlesscraftaclysmModVariables.NexurianERaidCenterY, EndlesscraftaclysmModVariables.NexurianERaidCenterZ,
							BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("event.raid.horn")), SoundSource.NEUTRAL, 50, 1, false);
				}
			}
			NexurianElementalRaidTier1Procedure.execute(world, entity);
		}
	}
}