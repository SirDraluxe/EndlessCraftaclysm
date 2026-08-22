package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModMobEffects;
import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModItems;

public class ArmorTheftOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EndlesscraftaclysmModItems.NEXURIAN_ALMA_SWORD.get()) == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(EndlesscraftaclysmModMobEffects.ARMOR_THEFT);
		}
	}
}