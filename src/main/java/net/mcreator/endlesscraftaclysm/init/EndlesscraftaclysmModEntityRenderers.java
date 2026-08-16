/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesscraftaclysm.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.entity.BoatRenderer;

import net.mcreator.endlesscraftaclysm.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class EndlesscraftaclysmModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_BOAT.get(), context -> new BoatRenderer(context, EndlesscraftaclysmModModels.NEXURIAN_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_CHEST_BOAT.get(), context -> new BoatRenderer(context, EndlesscraftaclysmModModels.NEXURIAN_CHEST_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_BUG.get(), NexurianBugRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_CORPSE.get(), NexurianCorpseRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_ALCHEMIST.get(), NexurianAlchemistRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.SCRATCH_POTION_PROJECTILE_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_CALLER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_CALLER.get(), NexurianCallerRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_BEAMER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_BEAMER.get(), NexurianBeamerRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_BATTLEHOG.get(), NexurianBattlehogRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_JAVANICUS.get(), NexurianJavanicusRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_PROIOXIS.get(), NexurianProioxisRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_ARMORED_BUG_RAIDER.get(), NexurianArmoredBugRaiderRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_CORPSE_RAIDER.get(), NexurianCorpseRaiderRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_ALCHEMIST_RAIDER.get(), NexurianAlchemistRaiderRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_CALLER_RAIDER.get(), NexurianCallerRaiderRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_BEAMER_RAIDER.get(), NexurianBeamerRaiderRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_BATTLEHOG_RAIDER.get(), NexurianBattlehogRaiderRenderer::new);
		event.registerEntityRenderer(EndlesscraftaclysmModEntities.NEXURIAN_GALANTHIS.get(), NexurianGalanthisRenderer::new);
	}
}