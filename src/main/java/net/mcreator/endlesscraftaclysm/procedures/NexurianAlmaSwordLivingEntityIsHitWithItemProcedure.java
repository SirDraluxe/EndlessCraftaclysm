package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModMobEffects;

public class NexurianAlmaSwordLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double ArmorSteal = 0;
		double AlmaRage = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) == 0) {
			if ((sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE)) == false) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE, 200, 0, true, true));
			}
			if ((sourceentity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE)) == true
					&& (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE).getAmplifier() : 0) < 4) {
				AlmaRage = sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE).getAmplifier() : 0;
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE, 200, (int) (AlmaRage + 1), true, true));
			}
			if ((sourceentity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE)) == true
					&& (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE).getAmplifier() : 0) >= 4) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE, 200, 4, true, true));
			}
		} else {
			if ((sourceentity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT)) == false) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ARMOR_THEFT, 200, 0, true, true));
				ArmorTheftedActivationProcedure.execute(entity);
			}
			if ((sourceentity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT)) == true
					&& (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT).getAmplifier() : 0) < 4) {
				ArmorSteal = sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT).getAmplifier() : 0;
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ARMOR_THEFT, 200, (int) (ArmorSteal + 1), true, true));
				ArmorTheftedActivationProcedure.execute(entity);
			}
			if ((sourceentity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT)) == true
					&& (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT).getAmplifier() : 0) >= 4) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ARMOR_THEFT, 200, 4, true, true));
				ArmorTheftedActivationProcedure.execute(entity);
			}
		}
	}
}