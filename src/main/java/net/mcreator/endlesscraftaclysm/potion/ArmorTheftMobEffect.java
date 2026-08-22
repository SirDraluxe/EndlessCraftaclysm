package net.mcreator.endlesscraftaclysm.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

public class ArmorTheftMobEffect extends MobEffect {
	public ArmorTheftMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16750900);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.iron.break")));
		this.addAttributeModifier(Attributes.ARMOR, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.armor_theft_0"), 1.5, AttributeModifier.Operation.ADD_VALUE);
	}
}