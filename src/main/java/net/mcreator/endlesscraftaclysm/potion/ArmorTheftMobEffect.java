package net.mcreator.endlesscraftaclysm.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.endlesscraftaclysm.procedures.ArmorTheftOnEffectActiveTickProcedure;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

public class ArmorTheftMobEffect extends MobEffect {
	public ArmorTheftMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16750900);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.iron.break")));
		this.addAttributeModifier(Attributes.ARMOR, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.alma_armor_theft_0"), 1.5, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		ArmorTheftOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}