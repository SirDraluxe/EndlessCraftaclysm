// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNexurianBattlehog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nexurianbattlehog"), "main");
	private final ModelPart body;
	private final ModelPart mane;
	private final ModelPart front_left_leg;
	private final ModelPart front_right_leg;
	private final ModelPart back_left_leg;
	private final ModelPart back_right_leg;
	private final ModelPart head;
	private final ModelPart head_rotation;
	private final ModelPart right_ear;
	private final ModelPart right_ear_rotation;
	private final ModelPart right_ear_rotation2;
	private final ModelPart left_ear;
	private final ModelPart left_ear_rotation;
	private final ModelPart left_ear_rotation2;

	public ModelNexurianBattlehog(ModelPart root) {
		this.body = root.getChild("body");
		this.mane = this.body.getChild("mane");
		this.front_left_leg = this.body.getChild("front_left_leg");
		this.front_right_leg = this.body.getChild("front_right_leg");
		this.back_left_leg = this.body.getChild("back_left_leg");
		this.back_right_leg = this.body.getChild("back_right_leg");
		this.head = root.getChild("head");
		this.head_rotation = this.head.getChild("head_rotation");
		this.right_ear = this.head.getChild("right_ear");
		this.right_ear_rotation = this.right_ear.getChild("right_ear_rotation");
		this.right_ear_rotation2 = this.right_ear_rotation.getChild("right_ear_rotation2");
		this.left_ear = this.head.getChild("left_ear");
		this.left_ear_rotation = this.left_ear.getChild("left_ear_rotation");
		this.left_ear_rotation2 = this.left_ear_rotation.getChild("left_ear_rotation2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(1, 1)
				.addBox(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 4.5F));

		PartDefinition mane = body.addOrReplaceChild("mane", CubeListBuilder.create().texOffs(90, 33).addBox(0.0F, 0.0F,
				-9.0F, 0.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, -7.0F));

		PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create()
				.texOffs(41, 42).addBox(-3.0F, 0.0F, -2.75F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 3.0F, -9.25F));

		PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create()
				.texOffs(66, 42).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 3.0F, -9.0F));

		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 45)
				.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 6.0F, 9.5F));

		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create()
				.texOffs(21, 45).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 6.0F, 9.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, -8.5F));

		PartDefinition head_rotation = head.addOrReplaceChild("head_rotation",
				CubeListBuilder.create().texOffs(61, 1)
						.addBox(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(1, 13)
						.addBox(6.0F, -9.0F, -13.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(-8.0F, -9.0F, -13.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(),
				PartPose.offset(-6.0F, -2.0F, -3.0F));

		PartDefinition right_ear_rotation = right_ear.addOrReplaceChild("right_ear_rotation", CubeListBuilder.create(),
				PartPose.offsetAndRotation(6.5F, 1.75F, 3.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition right_ear_rotation2 = right_ear_rotation.addOrReplaceChild("right_ear_rotation2",
				CubeListBuilder.create().texOffs(1, 1).addBox(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -1.75F, -3.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(),
				PartPose.offset(6.0F, -2.0F, -3.0F));

		PartDefinition left_ear_rotation = left_ear.addOrReplaceChild("left_ear_rotation", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-6.5F, 1.75F, 3.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition left_ear_rotation2 = left_ear_rotation.addOrReplaceChild("left_ear_rotation2",
				CubeListBuilder.create().texOffs(1, 6).addBox(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -1.75F, -3.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}