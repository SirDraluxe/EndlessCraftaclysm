package net.mcreator.endlesscraftaclysm.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;

import net.mcreator.endlesscraftaclysm.procedures.ScratchEffectStartedappliedProcedure;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

public class ScratchMobEffect extends MobEffect {
	public ScratchMobEffect() {
		super(MobEffectCategory.HARMFUL, -13408513);
		this.addAttributeModifier(Attributes.ARMOR, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.scratch_0"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(Attributes.ARMOR_TOUGHNESS, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.scratch_1"), -4, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		ScratchEffectStartedappliedProcedure.execute(entity.level(), entity);
	}
}