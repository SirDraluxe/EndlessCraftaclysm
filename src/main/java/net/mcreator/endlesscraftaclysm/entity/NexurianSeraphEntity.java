package net.mcreator.endlesscraftaclysm.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.projectile.throwableitemprojectile.AbstractThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.endlesscraftaclysm.procedures.NexurianSeraphOnInitialEntitySpawnProcedure;
import net.mcreator.endlesscraftaclysm.procedures.NexurianSeraphOnEntityTickUpdateProcedure;
import net.mcreator.endlesscraftaclysm.procedures.NexurianSeraphEntityDiesProcedure;

import javax.annotation.Nullable;

import java.util.EnumSet;

public class NexurianSeraphEntity extends Monster implements RangedAttackMob {
	public final AnimationState animationState0 = new AnimationState();

	public NexurianSeraphEntity(EntityType<NexurianSeraphEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
		refreshDimensions();
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(3, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (NexurianSeraphEntity.this.getTarget() != null && !NexurianSeraphEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return NexurianSeraphEntity.this.getMoveControl().hasWanted() && NexurianSeraphEntity.this.getTarget() != null && NexurianSeraphEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = NexurianSeraphEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				NexurianSeraphEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 0.6);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = NexurianSeraphEntity.this.getTarget();
				if (NexurianSeraphEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					NexurianSeraphEntity.this.doHurtTarget(this.getServerLevel(livingentity), livingentity);
				} else {
					double d0 = NexurianSeraphEntity.this.distanceToSqr(livingentity);
					if (d0 < 25) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						NexurianSeraphEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 0.6);
					}
				}
			}
		});
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 0.65, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = NexurianSeraphEntity.this.getRandom();
				double dir_x = NexurianSeraphEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = NexurianSeraphEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = NexurianSeraphEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 45, 25f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.death"));
	}

	@Override
	public boolean causeFallDamage(double l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.getDirectEntity() instanceof AbstractThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud || damagesource.typeHolder().is(NeoForgeMod.POISON_DAMAGE))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion(Explosion explosion) {
		return true;
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		NexurianSeraphEntityDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, EntitySpawnReason reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		NexurianSeraphOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ());
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		NexurianSeraphOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		NexurianBeamerProjectileEntity.shoot(this, target);
	}

	@Override
	public EntityDimensions getDefaultDimensions(Pose pose) {
		return super.getDefaultDimensions(pose).scale(1.5f);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	@Override
	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	@Override
	protected float getFlyingSpeed() {
		return (float) this.getAttributeValue(Attributes.FLYING_SPEED);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.21);
		builder = builder.add(Attributes.MAX_HEALTH, 27);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.FLYING_SPEED, 0.21);
		return builder;
	}
}