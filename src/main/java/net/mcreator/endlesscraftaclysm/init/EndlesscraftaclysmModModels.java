/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;

import net.mcreator.endlesscraftaclysm.client.model.ModelNexurianJavanicus;
import net.mcreator.endlesscraftaclysm.client.model.ModelNexurianGalanthis;
import net.mcreator.endlesscraftaclysm.client.model.ModelNexurianBattlehog;

@EventBusSubscriber(Dist.CLIENT)
public class EndlesscraftaclysmModModels {
	public static final ModelLayerLocation NEXURIAN_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("endlesscraftaclysm:boat/nexurian_boat"), "main");
	public static final ModelLayerLocation NEXURIAN_CHEST_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("endlesscraftaclysm:chest_boat/nexurian_chest_boat"), "main");

	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelNexurianJavanicus.LAYER_LOCATION, ModelNexurianJavanicus::createBodyLayer);
		event.registerLayerDefinition(ModelNexurianBattlehog.LAYER_LOCATION, ModelNexurianBattlehog::createBodyLayer);
		event.registerLayerDefinition(ModelNexurianGalanthis.LAYER_LOCATION, ModelNexurianGalanthis::createBodyLayer);
		event.registerLayerDefinition(NEXURIAN_BOAT_LAYER_LOCATION, BoatModel::createBoatModel);
		event.registerLayerDefinition(NEXURIAN_CHEST_BOAT_LAYER_LOCATION, BoatModel::createChestBoatModel);
	}
}