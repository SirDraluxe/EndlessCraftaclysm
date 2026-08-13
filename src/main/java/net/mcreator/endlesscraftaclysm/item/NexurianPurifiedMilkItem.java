package net.mcreator.endlesscraftaclysm.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class NexurianPurifiedMilkItem extends Item {
	public NexurianPurifiedMilkItem(Item.Properties properties) {
		super(properties.stacksTo(1).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).alwaysEdible().build(), Consumables.defaultDrink().consumeSeconds(1F).build()).usingConvertsTo(Items.BUCKET));
	}

	@Override
	public ItemStackTemplate getCraftingRemainder(ItemInstance itemInstance) {
		return new ItemStackTemplate(Items.BUCKET);
	}
}