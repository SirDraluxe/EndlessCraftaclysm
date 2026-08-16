/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.endlesscraftaclysm.entity.*;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

@EventBusSubscriber
public class EndlesscraftaclysmModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, EndlesscraftaclysmMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianBoatEntity>> NEXURIAN_BOAT = register("nexurian_boat",
			EntityType.Builder.<NexurianBoatEntity>of(NexurianBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianChestBoatEntity>> NEXURIAN_CHEST_BOAT = register("nexurian_chest_boat",
			EntityType.Builder.<NexurianChestBoatEntity>of(NexurianChestBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianBugEntity>> NEXURIAN_BUG = register("nexurian_bug",
			EntityType.Builder.<NexurianBugEntity>of(NexurianBugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.4f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianCorpseEntity>> NEXURIAN_CORPSE = register("nexurian_corpse",
			EntityType.Builder.<NexurianCorpseEntity>of(NexurianCorpseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianAlchemistEntity>> NEXURIAN_ALCHEMIST = register("nexurian_alchemist",
			EntityType.Builder.<NexurianAlchemistEntity>of(NexurianAlchemistEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScratchPotionProjectile1Entity>> SCRATCH_POTION_PROJECTILE_1 = register("scratch_potion_projectile_1",
			EntityType.Builder.<ScratchPotionProjectile1Entity>of(ScratchPotionProjectile1Entity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianCallerProjectileEntity>> NEXURIAN_CALLER_PROJECTILE = register("nexurian_caller_projectile",
			EntityType.Builder.<NexurianCallerProjectileEntity>of(NexurianCallerProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianCallerEntity>> NEXURIAN_CALLER = register("nexurian_caller",
			EntityType.Builder.<NexurianCallerEntity>of(NexurianCallerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianBeamerProjectileEntity>> NEXURIAN_BEAMER_PROJECTILE = register("nexurian_beamer_projectile",
			EntityType.Builder.<NexurianBeamerProjectileEntity>of(NexurianBeamerProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianBeamerEntity>> NEXURIAN_BEAMER = register("nexurian_beamer",
			EntityType.Builder.<NexurianBeamerEntity>of(NexurianBeamerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianBattlehogEntity>> NEXURIAN_BATTLEHOG = register("nexurian_battlehog",
			EntityType.Builder.<NexurianBattlehogEntity>of(NexurianBattlehogEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianJavanicusEntity>> NEXURIAN_JAVANICUS = register("nexurian_javanicus",
			EntityType.Builder.<NexurianJavanicusEntity>of(NexurianJavanicusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.9f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianProioxisEntity>> NEXURIAN_PROIOXIS = register("nexurian_proioxis", EntityType.Builder.<NexurianProioxisEntity>of(NexurianProioxisEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianArmoredBugRaiderEntity>> NEXURIAN_ARMORED_BUG_RAIDER = register("nexurian_armored_bug_raider",
			EntityType.Builder.<NexurianArmoredBugRaiderEntity>of(NexurianArmoredBugRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.4f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianCorpseRaiderEntity>> NEXURIAN_CORPSE_RAIDER = register("nexurian_corpse_raider",
			EntityType.Builder.<NexurianCorpseRaiderEntity>of(NexurianCorpseRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianAlchemistRaiderEntity>> NEXURIAN_ALCHEMIST_RAIDER = register("nexurian_alchemist_raider",
			EntityType.Builder.<NexurianAlchemistRaiderEntity>of(NexurianAlchemistRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianCallerRaiderEntity>> NEXURIAN_CALLER_RAIDER = register("nexurian_caller_raider",
			EntityType.Builder.<NexurianCallerRaiderEntity>of(NexurianCallerRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianBeamerRaiderEntity>> NEXURIAN_BEAMER_RAIDER = register("nexurian_beamer_raider",
			EntityType.Builder.<NexurianBeamerRaiderEntity>of(NexurianBeamerRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianBattlehogRaiderEntity>> NEXURIAN_BATTLEHOG_RAIDER = register("nexurian_battlehog_raider",
			EntityType.Builder.<NexurianBattlehogRaiderEntity>of(NexurianBattlehogRaiderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<NexurianGalanthisEntity>> NEXURIAN_GALANTHIS = register("nexurian_galanthis",
			EntityType.Builder.<NexurianGalanthisEntity>of(NexurianGalanthisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.2f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		NexurianBugEntity.init(event);
		NexurianCorpseEntity.init(event);
		NexurianAlchemistEntity.init(event);
		NexurianCallerEntity.init(event);
		NexurianBeamerEntity.init(event);
		NexurianBattlehogEntity.init(event);
		NexurianJavanicusEntity.init(event);
		NexurianProioxisEntity.init(event);
		NexurianArmoredBugRaiderEntity.init(event);
		NexurianCorpseRaiderEntity.init(event);
		NexurianAlchemistRaiderEntity.init(event);
		NexurianCallerRaiderEntity.init(event);
		NexurianBeamerRaiderEntity.init(event);
		NexurianBattlehogRaiderEntity.init(event);
		NexurianGalanthisEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NEXURIAN_BUG.get(), NexurianBugEntity.createAttributes().build());
		event.put(NEXURIAN_CORPSE.get(), NexurianCorpseEntity.createAttributes().build());
		event.put(NEXURIAN_ALCHEMIST.get(), NexurianAlchemistEntity.createAttributes().build());
		event.put(NEXURIAN_CALLER.get(), NexurianCallerEntity.createAttributes().build());
		event.put(NEXURIAN_BEAMER.get(), NexurianBeamerEntity.createAttributes().build());
		event.put(NEXURIAN_BATTLEHOG.get(), NexurianBattlehogEntity.createAttributes().build());
		event.put(NEXURIAN_JAVANICUS.get(), NexurianJavanicusEntity.createAttributes().build());
		event.put(NEXURIAN_PROIOXIS.get(), NexurianProioxisEntity.createAttributes().build());
		event.put(NEXURIAN_ARMORED_BUG_RAIDER.get(), NexurianArmoredBugRaiderEntity.createAttributes().build());
		event.put(NEXURIAN_CORPSE_RAIDER.get(), NexurianCorpseRaiderEntity.createAttributes().build());
		event.put(NEXURIAN_ALCHEMIST_RAIDER.get(), NexurianAlchemistRaiderEntity.createAttributes().build());
		event.put(NEXURIAN_CALLER_RAIDER.get(), NexurianCallerRaiderEntity.createAttributes().build());
		event.put(NEXURIAN_BEAMER_RAIDER.get(), NexurianBeamerRaiderEntity.createAttributes().build());
		event.put(NEXURIAN_BATTLEHOG_RAIDER.get(), NexurianBattlehogRaiderEntity.createAttributes().build());
		event.put(NEXURIAN_GALANTHIS.get(), NexurianGalanthisEntity.createAttributes().build());
	}
}