/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.Sheets;

import net.mcreator.endlesscraftaclysm.block.*;
import net.mcreator.endlesscraftaclysm.EndlesscraftaclysmMod;

import java.util.function.Function;

@EventBusSubscriber
public class EndlesscraftaclysmModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EndlesscraftaclysmMod.MODID);
	public static final DeferredBlock<Block> NEXURIAN_LOG;
	public static final DeferredBlock<Block> NEXURIAN_WOOD;
	public static final DeferredBlock<Block> STRIPPED_NEXURIAN_LOG;
	public static final DeferredBlock<Block> STRIPPED_NEXURIAN_WOOD;
	public static final DeferredBlock<Block> NEXURIAN_PLANKS;
	public static final DeferredBlock<Block> NEXURIAN_LEAVES;
	public static final DeferredBlock<Block> NEXURIAN_STAIRS;
	public static final DeferredBlock<Block> NEXURIAN_SLAB;
	public static final DeferredBlock<Block> NEXURIAN_FENCE;
	public static final DeferredBlock<Block> NEXURIAN_FENCE_GATE;
	public static final DeferredBlock<Block> NEXURIAN_DOOR;
	public static final DeferredBlock<Block> NEXURIAN_TRAPDOOR;
	public static final DeferredBlock<Block> NEXURIAN_PRESSURE_PLATE;
	public static final DeferredBlock<Block> NEXURIAN_BUTTON;
	public static final DeferredBlock<Block> NEXURIAN_SIGN;
	public static final DeferredBlock<Block> NEXURIAN_WALL_SIGN;
	public static final DeferredBlock<Block> NEXURIAN_HANGING_SIGN;
	public static final DeferredBlock<Block> NEXURIAN_WALL_HANGING_SIGN;
	public static final DeferredBlock<Block> NEXURIAN_SAPLING;
	public static final DeferredBlock<Block> NEXURIAN_BUG_HIVE;
	public static final DeferredBlock<Block> NEXURIAN_SOIL;
	public static final DeferredBlock<Block> NEXURIAN_SILT;
	public static final DeferredBlock<Block> NEXURIAN_STONE;
	public static final DeferredBlock<Block> NEXURIAN_COBBLESTONE;
	public static final DeferredBlock<Block> NEXURIAN_FERN;
	public static final DeferredBlock<Block> NEXURIAN_OLD_FERN;
	public static final DeferredBlock<Block> NEXURIAN_ROSE;
	public static final DeferredBlock<Block> NEXURIAN_DEADGRASS;
	public static final DeferredBlock<Block> NEXURIAN_STARGAZER;
	static {
		NEXURIAN_LOG = register("nexurian_log", NexurianLogBlock::new);
		NEXURIAN_WOOD = register("nexurian_wood", NexurianWoodBlock::new);
		STRIPPED_NEXURIAN_LOG = register("stripped_nexurian_log", StrippedNexurianLogBlock::new);
		STRIPPED_NEXURIAN_WOOD = register("stripped_nexurian_wood", StrippedNexurianWoodBlock::new);
		NEXURIAN_PLANKS = register("nexurian_planks", NexurianPlanksBlock::new);
		NEXURIAN_LEAVES = register("nexurian_leaves", NexurianLeavesBlock::new);
		NEXURIAN_STAIRS = register("nexurian_stairs", NexurianStairsBlock::new);
		NEXURIAN_SLAB = register("nexurian_slab", NexurianSlabBlock::new);
		NEXURIAN_FENCE = register("nexurian_fence", NexurianFenceBlock::new);
		NEXURIAN_FENCE_GATE = register("nexurian_fence_gate", NexurianFenceGateBlock::new);
		NEXURIAN_DOOR = register("nexurian_door", NexurianDoorBlock::new);
		NEXURIAN_TRAPDOOR = register("nexurian_trapdoor", NexurianTrapdoorBlock::new);
		NEXURIAN_PRESSURE_PLATE = register("nexurian_pressure_plate", NexurianPressurePlateBlock::new);
		NEXURIAN_BUTTON = register("nexurian_button", NexurianButtonBlock::new);
		NEXURIAN_SIGN = register("nexurian_sign", NexurianSignBlock::new);
		NEXURIAN_WALL_SIGN = register("nexurian_wall_sign", NexurianWallSignBlock::new);
		NEXURIAN_HANGING_SIGN = register("nexurian_hanging_sign", NexurianHangingSignBlock::new);
		NEXURIAN_WALL_HANGING_SIGN = register("nexurian_wall_hanging_sign", NexurianWallHangingSignBlock::new);
		NEXURIAN_SAPLING = register("nexurian_sapling", NexurianSaplingBlock::new);
		NEXURIAN_BUG_HIVE = register("nexurian_bug_hive", NexurianBugHiveBlock::new);
		NEXURIAN_SOIL = register("nexurian_soil", NexurianSoilBlock::new);
		NEXURIAN_SILT = register("nexurian_silt", NexurianSiltBlock::new);
		NEXURIAN_STONE = register("nexurian_stone", NexurianStoneBlock::new);
		NEXURIAN_COBBLESTONE = register("nexurian_cobblestone", NexurianCobblestoneBlock::new);
		NEXURIAN_FERN = register("nexurian_fern", NexurianFernBlock::new);
		NEXURIAN_OLD_FERN = register("nexurian_old_fern", NexurianOldFernBlock::new);
		NEXURIAN_ROSE = register("nexurian_rose", NexurianRoseBlock::new);
		NEXURIAN_DEADGRASS = register("nexurian_deadgrass", NexurianDeadgrassBlock::new);
		NEXURIAN_STARGAZER = register("nexurian_stargazer", NexurianStargazerBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Sheets.addWoodType(EndlesscraftaclysmModWoodTypes.NEXURIAN_SIGN_WOOD_TYPE);
			Sheets.addWoodType(EndlesscraftaclysmModWoodTypes.NEXURIAN_HANGING_SIGN_WOOD_TYPE);
		}
	}

	@SubscribeEvent
	public static void registerSigns(BlockEntityTypeAddBlocksEvent event) {
		event.modify(BlockEntityType.SIGN, NEXURIAN_SIGN.get(), NEXURIAN_WALL_SIGN.get());
		event.modify(BlockEntityType.HANGING_SIGN, NEXURIAN_HANGING_SIGN.get(), NEXURIAN_WALL_HANGING_SIGN.get());
	}
}