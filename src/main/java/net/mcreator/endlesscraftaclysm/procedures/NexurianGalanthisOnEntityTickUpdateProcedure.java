package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.hurtingprojectile.LargeFireball;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.endlesscraftaclysm.network.EndlesscraftaclysmModVariables;
import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModEntities;
import net.mcreator.endlesscraftaclysm.entity.NexurianGalanthisAntiGravityChargeRageModeEntity;
import net.mcreator.endlesscraftaclysm.entity.NexurianGalanthisAntiGravityChargeEntity;

public class NexurianGalanthisOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double GalanthisSkillroll = 0;
		double GalanthisRageroll = 0;
		if (!world.isClientSide()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 180 && EndlesscraftaclysmModVariables.NexurianGalanthisSummonCharge == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon endlesscraftaclysm:nexurian_seraph ~ ~5 ~");
				EndlesscraftaclysmModVariables.NexurianGalanthisSummonCharge = 1;
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 90 && EndlesscraftaclysmModVariables.NexurianGalanthisSummonCharge == 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon endlesscraftaclysm:nexurian_seraph ~ ~5 ~");
				EndlesscraftaclysmModVariables.NexurianGalanthisSummonCharge = 2;
			}
			if (entity.tickCount % 40 <= 0) {
				GalanthisSkillroll = Mth.nextInt(RandomSource.create(), 0, 100);
				if (GalanthisSkillroll >= 80) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute at @p run summon lightning_bolt ~ ~ ~");
					EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge = EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge + 1;
				} else if (GalanthisSkillroll >= 60) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/execute at @p run setblock ~ ~ ~ minecraft:cobweb");
					EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge = EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge + 1;
				} else if (GalanthisSkillroll >= 40) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/execute at @p run summon falling_block ~ ~10 ~ {BlockState:{Name:\"minecraft:anvil\"},HurtEntities:1b,FallHurtAmount:2.0f,FallHurtMax:40}");
					EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge = EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge + 1;
				} else if (GalanthisSkillroll >= 20) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new LargeFireball(EntityType.FIREBALL, projectileLevel);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new LargeFireball(EntityType.FIREBALL, projectileLevel);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge = EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge + 1;
				} else {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = initArrowProjectile(
									new NexurianGalanthisAntiGravityChargeEntity(EndlesscraftaclysmModEntities.NEXURIAN_GALANTHIS_ANTI_GRAVITY_CHARGE.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 1, (byte) 0)), null, 5,
									true, false, false, AbstractArrow.Pickup.DISALLOWED);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge = EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge + 1;
				}
				if (EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge == 7) {
					GalanthisRageroll = Mth.nextInt(RandomSource.create(), 0, 10);
					if (GalanthisRageroll >= 7) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute at @p run summon lightning_bolt ~ ~ ~");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute at @p run summon lightning_bolt ~ ~ ~");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute at @p run summon lightning_bolt ~ ~ ~");
					} else if (GalanthisRageroll >= 4) {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = initArrowProjectile(new NexurianGalanthisAntiGravityChargeRageModeEntity(EndlesscraftaclysmModEntities.NEXURIAN_GALANTHIS_ANTI_GRAVITY_CHARGE_RAGE_MODE.get(), 0, 0, 0, projectileLevel,
										createArrowWeaponItemStack(projectileLevel, 1, (byte) 0)), null, 5, true, false, false, AbstractArrow.Pickup.DISALLOWED);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = initArrowProjectile(new NexurianGalanthisAntiGravityChargeRageModeEntity(EndlesscraftaclysmModEntities.NEXURIAN_GALANTHIS_ANTI_GRAVITY_CHARGE_RAGE_MODE.get(), 0, 0, 0, projectileLevel,
										createArrowWeaponItemStack(projectileLevel, 1, (byte) 0)), null, 5, true, false, false, AbstractArrow.Pickup.DISALLOWED);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute at @p run summon tnt ~ ~ ~");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute at @p run summon tnt ~ ~ ~");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute at @p run summon tnt ~ ~ ~");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"execute at @p run summon tnt ~ ~ ~");
					}
					EndlesscraftaclysmModVariables.NexurianGalanthisRageCharge = 0;
				}
			}
		}
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}

	private static ItemStack createArrowWeaponItemStack(Level level, int knockback, byte piercing) {
		ItemStack weapon = new ItemStack(Items.ARROW);
		if (knockback > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.KNOCKBACK), knockback);
		if (piercing > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), piercing);
		return weapon;
	}
}