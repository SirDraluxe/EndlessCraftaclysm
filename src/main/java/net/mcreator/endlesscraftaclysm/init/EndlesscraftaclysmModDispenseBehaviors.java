/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.BoatDispenseItemBehavior;

@EventBusSubscriber
public class EndlesscraftaclysmModDispenseBehaviors {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DispenserBlock.registerBehavior(EndlesscraftaclysmModItems.NEXURIAN_BOAT.get(), new BoatDispenseItemBehavior(EndlesscraftaclysmModEntities.NEXURIAN_BOAT.get()));
			DispenserBlock.registerBehavior(EndlesscraftaclysmModItems.NEXURIAN_CHEST_BOAT.get(), new BoatDispenseItemBehavior(EndlesscraftaclysmModEntities.NEXURIAN_CHEST_BOAT.get()));
		});
	}
}