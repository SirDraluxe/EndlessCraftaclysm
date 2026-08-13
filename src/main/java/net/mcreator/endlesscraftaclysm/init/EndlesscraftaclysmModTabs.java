/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

@EventBusSubscriber
public class EndlesscraftaclysmModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndlesscraftaclysmMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_LOG.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_WOOD.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.STRIPPED_NEXURIAN_LOG.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.STRIPPED_NEXURIAN_WOOD.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_PLANKS.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_STAIRS.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_SLAB.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_FENCE.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_FENCE_GATE.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_DOOR.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_TRAPDOOR.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_PRESSURE_PLATE.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_BUTTON.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_BUG_HIVE.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_STARGAZER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_LEAVES.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_SAPLING.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_FERN.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_OLD_FERN.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_ROSE.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_DEADGRASS.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_SIGN.get().asItem());
			tabData.accept(EndlesscraftaclysmModBlocks.NEXURIAN_HANGING_SIGN.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_BOAT.get());
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_CHEST_BOAT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_BUG_SPAWN_EGG.get());
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_CORPSE_SPAWN_EGG.get());
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_ALCHEMIST_SPAWN_EGG.get());
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_CALLER_SPAWN_EGG.get());
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_BEAMER_SPAWN_EGG.get());
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_BATTLEHOG_SPAWN_EGG.get());
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_JAVANICUS_SPAWN_EGG.get());
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_PROIOXIS_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EndlesscraftaclysmModItems.NEXURIAN_STONE_OF_MEMORY.get());
		}
	}
}