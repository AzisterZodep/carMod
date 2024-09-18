// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcargarn47<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cargarn47"), "main");
	private final ModelPart bb_main;

	public Modelcargarn47(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(40, 7)
						.addBox(2.0F, -4.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 7)
						.addBox(-4.0F, -4.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 7)
						.addBox(-4.0F, -4.0F, 4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 7)
						.addBox(2.0F, -4.0F, 4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -10.0F, -6.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.0F, -17.0F, -7.0F, 10.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-2.0F, -13.0F, -8.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 6)
						.addBox(5.0F, -14.0F, -5.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-7.0F, -14.0F, -5.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-6.0F, -22.0F, -5.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(46, 19).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -9.0F, 5.0F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}