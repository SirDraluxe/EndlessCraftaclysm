package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModMobEffects;

public class NexurianAlmaSwordLivingEntityIsHitWithItemProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double ArmorSteal = 0;
		double AlmaRage = 0;
		if (!world.isClientSide()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) == 0) {
				if (AlmaRage <= 5) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE, 300, (int) AlmaRage, true, true));
					AlmaRage = AlmaRage + 1;
					itemstack.setDamageValue((int) (5.5 + AlmaRage * 2));
				} else {
					AlmaRage = 0;
					if (sourceentity instanceof LivingEntity _entity)
						_entity.removeEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE);
				}
			}
		}
	}
}