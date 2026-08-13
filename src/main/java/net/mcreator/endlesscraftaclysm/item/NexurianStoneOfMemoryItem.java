package net.mcreator.endlesscraftaclysm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NexurianStoneOfMemoryItem extends Item {
	public NexurianStoneOfMemoryItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1));
	}
}