/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.*;

import net.mcreator.endlesscraftaclysm.item.*;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

import java.util.function.Function;

public class EndlesscraftaclysmModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EndlesscraftaclysmMod.MODID);
	public static final DeferredItem<Item> NEXURIAN_LOG;
	public static final DeferredItem<Item> NEXURIAN_WOOD;
	public static final DeferredItem<Item> STRIPPED_NEXURIAN_LOG;
	public static final DeferredItem<Item> STRIPPED_NEXURIAN_WOOD;
	public static final DeferredItem<Item> NEXURIAN_PLANKS;
	public static final DeferredItem<Item> NEXURIAN_LEAVES;
	public static final DeferredItem<Item> NEXURIAN_STAIRS;
	public static final DeferredItem<Item> NEXURIAN_SLAB;
	public static final DeferredItem<Item> NEXURIAN_FENCE;
	public static final DeferredItem<Item> NEXURIAN_FENCE_GATE;
	public static final DeferredItem<Item> NEXURIAN_DOOR;
	public static final DeferredItem<Item> NEXURIAN_TRAPDOOR;
	public static final DeferredItem<Item> NEXURIAN_PRESSURE_PLATE;
	public static final DeferredItem<Item> NEXURIAN_BUTTON;
	public static final DeferredItem<Item> NEXURIAN_SIGN;
	public static final DeferredItem<Item> NEXURIAN_HANGING_SIGN;
	public static final DeferredItem<Item> NEXURIAN_BOAT;
	public static final DeferredItem<Item> NEXURIAN_CHEST_BOAT;
	public static final DeferredItem<Item> NEXURIAN_APPLE;
	public static final DeferredItem<Item> NEXURIAN_DUST;
	public static final DeferredItem<Item> NEXURIAN_BUG_HUSK;
	public static final DeferredItem<Item> NEXURIAN_SAPLING;
	public static final DeferredItem<Item> NEXURIAN_BUG_HIVE;
	public static final DeferredItem<Item> NEXURIAN_SOIL;
	public static final DeferredItem<Item> NEXURIAN_SILT;
	public static final DeferredItem<Item> NEXURIAN_STONE;
	public static final DeferredItem<Item> NEXURIAN_COBBLESTONE;
	public static final DeferredItem<Item> NEXURIAN_FERN;
	public static final DeferredItem<Item> NEXURIAN_OLD_FERN;
	public static final DeferredItem<Item> NEXURIAN_ROSE;
	public static final DeferredItem<Item> NEXURIAN_FIBER;
	public static final DeferredItem<Item> NEXURIAN_DEADGRASS;
	public static final DeferredItem<Item> NEXURIAN_BUG_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_CORPSE_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_ALCHEMIST_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_CALLER_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_BEAMER_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_BATTLEHOG_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_JAVANICUS_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_MILK;
	public static final DeferredItem<Item> NEXURIAN_PURIFIED_MILK;
	public static final DeferredItem<Item> NEXURIAN_WHEAT;
	public static final DeferredItem<Item> NEXURIAN_BATTLEHOG_MANE;
	public static final DeferredItem<Item> NEXURIAN_ENERGY_FRAGMENT;
	public static final DeferredItem<Item> NEXURIAN_FLESH;
	public static final DeferredItem<Item> NEXURIAN_ROTTEN_BRAIN;
	public static final DeferredItem<Item> NEXURIAN_STARSHARD;
	public static final DeferredItem<Item> NEXURIAN_ENCHANTED_DUST;
	public static final DeferredItem<Item> ALCHEMIST_FLARE;
	public static final DeferredItem<Item> NEXURIAN_LEATHER;
	public static final DeferredItem<Item> NEXURIAN_ENERGY_SHARD;
	public static final DeferredItem<Item> BATTLEHOG_PORKCHOP;
	public static final DeferredItem<Item> COOKED_BATTLEHOG_PORKCHOP;
	public static final DeferredItem<Item> NEXURIAN_SOUL;
	public static final DeferredItem<Item> NEXURIAN_SOULSTONE;
	public static final DeferredItem<Item> JAVANICUS_HORN;
	public static final DeferredItem<Item> NEXURIAN_STARGAZER;
	public static final DeferredItem<Item> NEXURIAN_STONE_OF_MEMORY;
	public static final DeferredItem<Item> NEXURIAN_PROIOXIS_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_GALANTHIS_SPAWN_EGG;
	public static final DeferredItem<Item> NEXURIAN_ENERGIZED_STRING;
	public static final DeferredItem<Item> ALCHEMIST_SCORCH;
	public static final DeferredItem<Item> NEXURIAN_ALMA_SWORD;
	static {
		NEXURIAN_LOG = block(EndlesscraftaclysmModBlocks.NEXURIAN_LOG);
		NEXURIAN_WOOD = block(EndlesscraftaclysmModBlocks.NEXURIAN_WOOD);
		STRIPPED_NEXURIAN_LOG = block(EndlesscraftaclysmModBlocks.STRIPPED_NEXURIAN_LOG);
		STRIPPED_NEXURIAN_WOOD = block(EndlesscraftaclysmModBlocks.STRIPPED_NEXURIAN_WOOD);
		NEXURIAN_PLANKS = block(EndlesscraftaclysmModBlocks.NEXURIAN_PLANKS);
		NEXURIAN_LEAVES = block(EndlesscraftaclysmModBlocks.NEXURIAN_LEAVES);
		NEXURIAN_STAIRS = block(EndlesscraftaclysmModBlocks.NEXURIAN_STAIRS);
		NEXURIAN_SLAB = block(EndlesscraftaclysmModBlocks.NEXURIAN_SLAB);
		NEXURIAN_FENCE = block(EndlesscraftaclysmModBlocks.NEXURIAN_FENCE);
		NEXURIAN_FENCE_GATE = block(EndlesscraftaclysmModBlocks.NEXURIAN_FENCE_GATE);
		NEXURIAN_DOOR = doubleBlock(EndlesscraftaclysmModBlocks.NEXURIAN_DOOR);
		NEXURIAN_TRAPDOOR = block(EndlesscraftaclysmModBlocks.NEXURIAN_TRAPDOOR);
		NEXURIAN_PRESSURE_PLATE = block(EndlesscraftaclysmModBlocks.NEXURIAN_PRESSURE_PLATE);
		NEXURIAN_BUTTON = block(EndlesscraftaclysmModBlocks.NEXURIAN_BUTTON);
		NEXURIAN_SIGN = signBlock(EndlesscraftaclysmModBlocks.NEXURIAN_SIGN, EndlesscraftaclysmModBlocks.NEXURIAN_WALL_SIGN, new Item.Properties().stacksTo(16));
		NEXURIAN_HANGING_SIGN = hangingSignBlock(EndlesscraftaclysmModBlocks.NEXURIAN_HANGING_SIGN, EndlesscraftaclysmModBlocks.NEXURIAN_WALL_HANGING_SIGN, new Item.Properties().stacksTo(16));
		NEXURIAN_BOAT = register("nexurian_boat", properties -> new BoatItem(EndlesscraftaclysmModEntities.NEXURIAN_BOAT.get(), properties.stacksTo(1)));
		NEXURIAN_CHEST_BOAT = register("nexurian_chest_boat", properties -> new BoatItem(EndlesscraftaclysmModEntities.NEXURIAN_CHEST_BOAT.get(), properties.stacksTo(1)));
		NEXURIAN_APPLE = register("nexurian_apple", NexurianAppleItem::new);
		NEXURIAN_DUST = register("nexurian_dust", NexurianDustItem::new);
		NEXURIAN_BUG_HUSK = register("nexurian_bug_husk", NexurianBugHuskItem::new);
		NEXURIAN_SAPLING = block(EndlesscraftaclysmModBlocks.NEXURIAN_SAPLING);
		NEXURIAN_BUG_HIVE = block(EndlesscraftaclysmModBlocks.NEXURIAN_BUG_HIVE);
		NEXURIAN_SOIL = block(EndlesscraftaclysmModBlocks.NEXURIAN_SOIL);
		NEXURIAN_SILT = block(EndlesscraftaclysmModBlocks.NEXURIAN_SILT);
		NEXURIAN_STONE = block(EndlesscraftaclysmModBlocks.NEXURIAN_STONE);
		NEXURIAN_COBBLESTONE = block(EndlesscraftaclysmModBlocks.NEXURIAN_COBBLESTONE);
		NEXURIAN_FERN = block(EndlesscraftaclysmModBlocks.NEXURIAN_FERN);
		NEXURIAN_OLD_FERN = doubleBlock(EndlesscraftaclysmModBlocks.NEXURIAN_OLD_FERN);
		NEXURIAN_ROSE = block(EndlesscraftaclysmModBlocks.NEXURIAN_ROSE);
		NEXURIAN_FIBER = register("nexurian_fiber", NexurianFiberItem::new);
		NEXURIAN_DEADGRASS = block(EndlesscraftaclysmModBlocks.NEXURIAN_DEADGRASS);
		NEXURIAN_BUG_SPAWN_EGG = register("nexurian_bug_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_BUG.get())));
		NEXURIAN_CORPSE_SPAWN_EGG = register("nexurian_corpse_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_CORPSE.get())));
		NEXURIAN_ALCHEMIST_SPAWN_EGG = register("nexurian_alchemist_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_ALCHEMIST.get())));
		NEXURIAN_CALLER_SPAWN_EGG = register("nexurian_caller_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_CALLER.get())));
		NEXURIAN_BEAMER_SPAWN_EGG = register("nexurian_beamer_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_BEAMER.get())));
		NEXURIAN_BATTLEHOG_SPAWN_EGG = register("nexurian_battlehog_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_BATTLEHOG.get())));
		NEXURIAN_JAVANICUS_SPAWN_EGG = register("nexurian_javanicus_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_JAVANICUS.get())));
		NEXURIAN_MILK = register("nexurian_milk", NexurianMilkItem::new);
		NEXURIAN_PURIFIED_MILK = register("nexurian_purified_milk", NexurianPurifiedMilkItem::new);
		NEXURIAN_WHEAT = register("nexurian_wheat", NexurianWheatItem::new);
		NEXURIAN_BATTLEHOG_MANE = register("nexurian_battlehog_mane", NexurianBattlehogManeItem::new);
		NEXURIAN_ENERGY_FRAGMENT = register("nexurian_energy_fragment", NexurianEnergyFragmentItem::new);
		NEXURIAN_FLESH = register("nexurian_flesh", NexurianFleshItem::new);
		NEXURIAN_ROTTEN_BRAIN = register("nexurian_rotten_brain", NexurianRottenBrainItem::new);
		NEXURIAN_STARSHARD = register("nexurian_starshard", NexurianStarshardItem::new);
		NEXURIAN_ENCHANTED_DUST = register("nexurian_enchanted_dust", NexurianEnchantedDustItem::new);
		ALCHEMIST_FLARE = register("alchemist_flare", AlchemistFlareItem::new);
		NEXURIAN_LEATHER = register("nexurian_leather", NexurianLeatherItem::new);
		NEXURIAN_ENERGY_SHARD = register("nexurian_energy_shard", NexurianEnergyShardItem::new);
		BATTLEHOG_PORKCHOP = register("battlehog_porkchop", BattlehogPorkchopItem::new);
		COOKED_BATTLEHOG_PORKCHOP = register("cooked_battlehog_porkchop", CookedBattlehogPorkchopItem::new);
		NEXURIAN_SOUL = register("nexurian_soul", NexurianSoulItem::new);
		NEXURIAN_SOULSTONE = register("nexurian_soulstone", NexurianSoulstoneItem::new);
		JAVANICUS_HORN = register("javanicus_horn", JavanicusHornItem::new);
		NEXURIAN_STARGAZER = block(EndlesscraftaclysmModBlocks.NEXURIAN_STARGAZER, new Item.Properties().fireResistant());
		NEXURIAN_STONE_OF_MEMORY = register("nexurian_stone_of_memory", NexurianStoneOfMemoryItem::new);
		NEXURIAN_PROIOXIS_SPAWN_EGG = register("nexurian_proioxis_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_PROIOXIS.get())));
		NEXURIAN_GALANTHIS_SPAWN_EGG = register("nexurian_galanthis_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(EndlesscraftaclysmModEntities.NEXURIAN_GALANTHIS.get())));
		NEXURIAN_ENERGIZED_STRING = register("nexurian_energized_string", NexurianEnergizedStringItem::new);
		ALCHEMIST_SCORCH = register("alchemist_scorch", AlchemistScorchItem::new);
		NEXURIAN_ALMA_SWORD = register("nexurian_alma_sword", NexurianAlmaSwordItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), () -> properties);
	}

	private static DeferredItem<Item> signBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock) {
		return signBlock(block, wallBlock, new Item.Properties());
	}

	private static DeferredItem<Item> signBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new SignItem(block.get(), wallBlock.get(), prop), () -> properties);
	}

	private static DeferredItem<Item> hangingSignBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock) {
		return hangingSignBlock(block, wallBlock, new Item.Properties());
	}

	private static DeferredItem<Item> hangingSignBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new HangingSignItem(block.get(), wallBlock.get(), prop), () -> properties);
	}
}