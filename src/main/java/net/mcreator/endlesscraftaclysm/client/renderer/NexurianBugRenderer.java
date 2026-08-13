package net.mcreator.endlesscraftaclysm.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.monster.silverfish.SilverfishModel;
import net.minecraft.client.model.geom.ModelLayers;

import net.mcreator.endlesscraftaclysm.entity.NexurianBugEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class NexurianBugRenderer extends MobRenderer<NexurianBugEntity, LivingEntityRenderState, SilverfishModel> {
	private final Identifier entityTexture = Identifier.parse("endlesscraftaclysm:textures/entities/nexurian_armored_bug.png");

	public NexurianBugRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NexurianBugEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(2f, 2f, 2f);
	}
}