package net.mcreator.endlesscraftaclysm.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class NexurianAppleItem extends Item {
	public NexurianAppleItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(1.6f).build()));
	}
}