package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModMobEffects;

public class ArmorTheftedActivationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double ArmorTheftedOverall = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) > 0) {
			if ((entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED)) == false) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED, 200, 0, true, true));
			}
			if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED)) == true
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED).getAmplifier() : 0) < 4) {
				ArmorTheftedOverall = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED).getAmplifier() : 0;
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED, 200, (int) (ArmorTheftedOverall + 1), true, true));
			}
			if ((entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED)) == true
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED).getAmplifier() : 0) >= 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ALMA_ARMOR_THEFTED, 200, 4, true, true));
			}
		}
	}
}