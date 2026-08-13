package net.mcreator.endlesscraftaclysm.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedBattlehogPorkchopItem extends Item {
	public CookedBattlehogPorkchopItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(10).saturationModifier(14f).build()));
	}
}