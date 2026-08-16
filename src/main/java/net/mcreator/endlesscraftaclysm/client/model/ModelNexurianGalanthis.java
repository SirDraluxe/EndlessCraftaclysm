package net.mcreator.endlesscraftaclysm.client.model;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelNexurianGalanthis extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("endlesscraftaclysm", "model_nexurian_galanthis"), "main");
	public final ModelPart book;
	public final ModelPart book_spine;
	public final ModelPart spine_rotation;
	public final ModelPart right;
	public final ModelPart pages_right;
	public final ModelPart page_right_rotation;
	public final ModelPart cover_right;
	public final ModelPart cover_right_rotation;
	public final ModelPart left;
	public final ModelPart pages_left;
	public final ModelPart page_left_rotation;
	public final ModelPart cover_left;
	public final ModelPart cover_left_rotation;
	public final ModelPart cat;
	public final ModelPart tail1;
	public final ModelPart right_hind_leg;
	public final ModelPart body;
	public final ModelPart left_hind_leg;
	public final ModelPart right_front_leg;
	public final ModelPart left_front_leg;
	public final ModelPart head;

	public ModelNexurianGalanthis(ModelPart root) {
		super(root);
		this.book = root.getChild("book");
		this.book_spine = this.book.getChild("book_spine");
		this.spine_rotation = this.book_spine.getChild("spine_rotation");
		this.right = this.book.getChild("right");
		this.pages_right = this.right.getChild("pages_right");
		this.page_right_rotation = this.pages_right.getChild("page_right_rotation");
		this.cover_right = this.right.getChild("cover_right");
		this.cover_right_rotation = this.cover_right.getChild("cover_right_rotation");
		this.left = this.book.getChild("left");
		this.pages_left = this.left.getChild("pages_left");
		this.page_left_rotation = this.pages_left.getChild("page_left_rotation");
		this.cover_left = this.left.getChild("cover_left");
		this.cover_left_rotation = this.cover_left.getChild("cover_left_rotation");
		this.cat = root.getChild("cat");
		this.tail1 = this.cat.getChild("tail1");
		this.right_hind_leg = this.cat.getChild("right_hind_leg");
		this.body = this.cat.getChild("body");
		this.left_hind_leg = this.cat.getChild("left_hind_leg");
		this.right_front_leg = this.cat.getChild("right_front_leg");
		this.left_front_leg = this.cat.getChild("left_front_leg");
		this.head = this.cat.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition book = partdefinition.addOrReplaceChild("book", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0F, -6.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition book_spine = book.addOrReplaceChild("book_spine", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 1.0F));
		PartDefinition spine_rotation = book_spine.addOrReplaceChild("spine_rotation", CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, -4.0F, 1.3F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition right = book.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition pages_right = right.addOrReplaceChild("pages_right", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -0.125F));
		PartDefinition page_right_rotation = pages_right.addOrReplaceChild("page_right_rotation", CubeListBuilder.create().texOffs(12, 20).addBox(-2.5F, -4.0F, -0.3F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 0.0F, -0.475F, 0.0F, 3.1416F, -3.1416F));
		PartDefinition cover_right = right.addOrReplaceChild("cover_right", CubeListBuilder.create(), PartPose.offset(7.0F, -5.0F, 0.0F));
		PartDefinition cover_right_rotation = cover_right.addOrReplaceChild("cover_right_rotation", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition left = book.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition pages_left = left.addOrReplaceChild("pages_left", CubeListBuilder.create(), PartPose.offset(-5.0F, -5.0F, -1.075F));
		PartDefinition page_left_rotation = pages_left.addOrReplaceChild("page_left_rotation", CubeListBuilder.create().texOffs(22, 0).addBox(-2.5F, -4.0F, -0.7F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 0.0F, 0.475F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cover_left = left.addOrReplaceChild("cover_left", CubeListBuilder.create(), PartPose.offset(-7.0F, -5.0F, 0.0F));
		PartDefinition cover_left_rotation = cover_left.addOrReplaceChild("cover_left_rotation", CubeListBuilder.create().texOffs(18, 10).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cat = partdefinition.addOrReplaceChild("cat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition tail1 = cat.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, -0.107F, 0.0849F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.893F, 3.9151F, 0.5672F, 0.0F, 0.0F));
		PartDefinition right_hind_leg = cat.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(30, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -12.0F, 2.5F));
		PartDefinition body = cat.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.5F, -3.5F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.5F, 0.5F));
		PartDefinition left_hind_leg = cat.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(14, 29).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -12.0F, 2.5F));
		PartDefinition right_front_leg = cat.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -12.0F, -1.5F));
		PartDefinition left_front_leg = cat.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(28, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -12.0F, -1.5F));
		PartDefinition head = cat
				.addOrReplaceChild(
						"head", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, -3.0F, -2.875F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 13).addBox(-2.0F, -4.0F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(30, 16).addBox(1.0F, -4.0F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-1.5F, -1.0F, -3.875F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -14.0F, -3.125F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}