package net.mcreator.endlesscraftaclysm.client.renderer;

import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.WitchRenderState;
import net.minecraft.client.renderer.entity.state.HoldingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.monster.witch.WitchModel;
import net.minecraft.client.model.geom.ModelLayers;

import net.mcreator.endlesscraftaclysm.entity.NexurianAlchemistRaiderEntity;

public class NexurianAlchemistRaiderRenderer extends MobRenderer<NexurianAlchemistRaiderEntity, WitchRenderState, WitchModel> {
	private final Identifier entityTexture = Identifier.parse("endlesscraftaclysm:textures/entities/nexurian_alchemist.png");

	public NexurianAlchemistRaiderRenderer(EntityRendererProvider.Context context) {
		super(context, new WitchModel(context.bakeLayer(ModelLayers.WITCH)), 0.5f);
		this.addLayer(new CrossedArmsItemLayer<>(this));
	}

	@Override
	public WitchRenderState createRenderState() {
		return new WitchRenderState();
	}

	@Override
	public void extractRenderState(NexurianAlchemistRaiderEntity entity, WitchRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		if (state instanceof HoldingEntityRenderState holdingState) {
			this.itemModelResolver.updateForLiving(holdingState.heldItem, entity.getMainHandItem(), ItemDisplayContext.GROUND, entity);
		}
	}

	@Override
	public Identifier getTextureLocation(WitchRenderState state) {
		return entityTexture;
	}
}