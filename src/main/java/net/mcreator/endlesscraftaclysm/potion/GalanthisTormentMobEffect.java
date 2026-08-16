package net.mcreator.endlesscraftaclysm.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

public class GalanthisTormentMobEffect extends MobEffect {
	public GalanthisTormentMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777012, mobEffectInstance -> ParticleTypes.ENCHANT);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.galanthis_torment_0"), -0.1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(Attributes.ARMOR, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.galanthis_torment_1"), -0.1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.galanthis_torment_2"), -2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.galanthis_torment_3"), -0.1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.galanthis_torment_4"), -0.1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
	}
}