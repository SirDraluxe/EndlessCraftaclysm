package net.mcreator.endlesscraftaclysm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.endlesscraftaclysm.init.EndlesscraftaclysmModItems;

public class NexurianJavanicusRightclickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET && Mth.nextInt(RandomSource.create(), 0, 10) >= 1) {
			if (entity instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
		}
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
				&& itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, Identifier.parse("endlesscraftaclysm:purify")))) != 0) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack8 = new ItemStack(EndlesscraftaclysmModItems.NEXURIAN_PURIFIED_MILK.get()).copy();
				_setstack8.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack8);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
				&& (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, Identifier.parse("endlesscraftaclysm:purify")))) != 0) == false) {
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack13 = new ItemStack(EndlesscraftaclysmModItems.NEXURIAN_MILK.get()).copy();
				_setstack13.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack13);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}