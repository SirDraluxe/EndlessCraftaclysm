package net.mcreator.endlesscraftaclysm.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;

import net.mcreator.endlesscraftaclysm.procedures.AlmaDominanceOnEffectActiveTickProcedure;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

public class AlmaDominanceMobEffect extends MobEffect {
	public AlmaDominanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16750900);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, Identifier.fromNamespaceAndPath(EndlesscraftaclysmMod.MODID, "effect.alma_dominance_0"), 2, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		AlmaDominanceOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}