package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModMobEffects;

public class NexurianAlmaSwordItemInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE) ? _livEnt.getEffect(EndlesscraftaclysmModMobEffects.ALMA_DOMINANCE).getDuration() : 0) <= 1) {
			itemstack.setDamageValue((int) 5.5);
		}
	}
}