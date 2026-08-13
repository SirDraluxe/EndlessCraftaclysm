package net.mcreator.endlesscraftaclysm.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NexurianSoulstoneItem extends Item {
	public NexurianSoulstoneItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}