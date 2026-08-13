package net.mcreator.endlesscraftaclysm.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NexurianEnchantedDustItem extends Item {
	public NexurianEnchantedDustItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}