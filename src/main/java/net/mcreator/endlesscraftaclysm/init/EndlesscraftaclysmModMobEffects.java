/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.endlesscraftaclysm.procedures.ScratchEffectStartedappliedProcedure;
import net.mcreator.endlesscraftaclysm.potion.ScratchMobEffect;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

@EventBusSubscriber
public class EndlesscraftaclysmModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, EndlesscraftaclysmMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> SCRATCH = REGISTRY.register("scratch", ScratchMobEffect::new);

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.is(SCRATCH)) {
			ScratchEffectStartedappliedProcedure.execute(entity.level(), entity);
		}
	}
}