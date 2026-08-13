/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

public class EndlesscraftaclysmModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, EndlesscraftaclysmMod.MODID);
	public static final DeferredHolder<Potion, Potion> SCRATCH_POTION = REGISTRY.register("scratch_potion", () -> new Potion("scratch_potion", new MobEffectInstance(EndlesscraftaclysmModMobEffects.SCRATCH, 4800, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> ENDURANCED_SCRATCH_POTION = REGISTRY.register("enduranced_scratch_potion",
			() -> new Potion("enduranced_scratch_potion", new MobEffectInstance(EndlesscraftaclysmModMobEffects.SCRATCH, 9600, 0, false, true)));
}