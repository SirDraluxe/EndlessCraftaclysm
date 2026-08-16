package net.mcreator.endlesscraftaclysm.client.renderer;

import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.util.context.ContextKey;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;

import net.mcreator.endlesscraftaclysm.entity.NexurianGalanthisEntity;
import net.mcreator.endlesscraftaclysm.client.model.animations.NexurianGalanthisAnimation;
import net.mcreator.endlesscraftaclysm.client.model.ModelNexurianGalanthis;

import java.util.Map;

public class NexurianGalanthisRenderer extends MobRenderer<NexurianGalanthisEntity, LivingEntityRenderState, ModelNexurianGalanthis> {
	private final Identifier entityTexture = Identifier.parse("endlesscraftaclysm:textures/entities/nexurian_galanthis.png");

	public NexurianGalanthisRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelNexurianGalanthis.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NexurianGalanthisEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelNexurianGalanthis {
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(NexurianGalanthisAnimation.idle);
		}

		private KeyframeAnimation safeBake(AnimationDefinition source) {
			try {
				return source.bake(root);
			} catch (IllegalArgumentException e) {
				return new AnimationDefinition(0, false, Map.of()).bake(root);
			}
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			NexurianGalanthisEntity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<NexurianGalanthisEntity> ENTITY_KEY = new ContextKey<>(Identifier.parse("endlesscraftaclysm:nexurian_galanthis_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(NexurianGalanthisRenderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}