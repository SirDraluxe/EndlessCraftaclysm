package net.mcreator.endlesscraftaclysm.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BattlehogPorkchopItem extends Item {
	public BattlehogPorkchopItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(1.5f).build()));
	}
}