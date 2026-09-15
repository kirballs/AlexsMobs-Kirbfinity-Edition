package com.github.alexthe666.alexsmobs.client.model;
import com.github.alexthe666.alexsmobs.entity.EntityGorilla;
import com.github.alexthe666.alexsmobs.entity.util.Maths;
import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.github.alexthe666.citadel.client.model.ModelAnimator;
import com.github.alexthe666.citadel.client.model.basic.BasicModelPart;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;

public class ModelGorilla extends AdvancedEntityModel<EntityGorilla> {
	public final AdvancedModelBox root;
	public final AdvancedModelBox body;
	public final AdvancedModelBox chest;
	public final AdvancedModelBox head;
	public final AdvancedModelBox foreheadDK_r1;
	public final AdvancedModelBox mouth;
	public final AdvancedModelBox leftArm;
	public final AdvancedModelBox rightArm;
	public final AdvancedModelBox leftLeg;
	public final AdvancedModelBox rightLeg;
	public final AdvancedModelBox body_geo;
	public final AdvancedModelBox chest_geo;
	public final AdvancedModelBox head_geo;
	public final AdvancedModelBox leftArm_geo;
	public final AdvancedModelBox leftLeg_geo;
	public final AdvancedModelBox rightArm_geo;
	public final AdvancedModelBox rightLeg_geo;
	public final AdvancedModelBox body_geo_body_c0;
	public final AdvancedModelBox chest_geo_chest_c0;
	public final AdvancedModelBox chest_geo_chest_c1;
	public final AdvancedModelBox body_sb;
	public final AdvancedModelBox chest_sb;
	public final AdvancedModelBox head_sb;
	public final AdvancedModelBox leftArm_sb;
	public final AdvancedModelBox leftLeg_sb;
	public final AdvancedModelBox rightArm_sb;
	public final AdvancedModelBox rightLeg_sb;
	public final AdvancedModelBox body_sb_body_c0;
	public final AdvancedModelBox body_sb_body1_c0;
	public final AdvancedModelBox chest_sb_chest_c0;
	public final AdvancedModelBox chest_sb_chest_c1;
	public final ModelAnimator animator;
	
	public ModelGorilla() {
		texWidth = 128;
		texHeight = 128;

		root = new AdvancedModelBox(this, "root");
		root.setRotationPoint(0F, 24F, 0F);

		body = new AdvancedModelBox(this, "body");
		body.setRotationPoint(0F, -14F, 3F);
		root.addChild(body);

		chest = new AdvancedModelBox(this, "chest");
		chest.setRotationPoint(0F, 4F, -3F);
		body.addChild(chest);

		head = new AdvancedModelBox(this, "head");
		head.setRotationPoint(0F, -8F, -11F);
		chest.addChild(head);

		foreheadDK_r1 = new AdvancedModelBox(this, "foreheadDK_r1");
		foreheadDK_r1.setRotationPoint(0F, -6F, -2F);
		head.addChild(foreheadDK_r1);
		setRotationAngle(foreheadDK_r1, 0F, 0.2182F, 0F);

		mouth = new AdvancedModelBox(this, "mouth");
		mouth.setRotationPoint(0F, 0F, -1F);
		head.addChild(mouth);

		leftArm = new AdvancedModelBox(this, "leftArm");
		leftArm.setRotationPoint(6F, -6.5F, -9.5F);
		chest.addChild(leftArm);

		rightArm = new AdvancedModelBox(this, "rightArm");
		rightArm.setRotationPoint(-6F, -6.5F, -9.5F);
		chest.addChild(rightArm);

		leftLeg = new AdvancedModelBox(this, "leftLeg");
		leftLeg.setRotationPoint(3F, 4.5F, 2.5F);
		body.addChild(leftLeg);

		rightLeg = new AdvancedModelBox(this, "rightLeg");
		rightLeg.setRotationPoint(-3F, 4.5F, 2.5F);
		body.addChild(rightLeg);

		body_geo = new AdvancedModelBox(this, "body_geo");
		body_geo.setRotationPoint(-0F, -10F, -3F);
		body.addChild(body_geo);

		chest_geo = new AdvancedModelBox(this, "chest_geo");
		chest_geo.setRotationPoint(-0F, -14F, -0F);
		chest.addChild(chest_geo);
		chest_geo.setTextureOffset(50, 47).addBox(-9.5F, 8.5F, -3.5F, 3F, 8F, 8F, 0F, true);
		chest_geo.setTextureOffset(50, 47).addBox(6.5F, 8.5F, -3.5F, 3F, 8F, 8F, 0F, false);

		head_geo = new AdvancedModelBox(this, "head_geo");
		head_geo.setRotationPoint(-0F, -6F, 11F);
		head.addChild(head_geo);
		head_geo.setTextureOffset(0, 30).addBox(-4.5F, -3F, -14F, 9F, 10F, 8F, 0F, false);
		head_geo.setTextureOffset(0, 0).addBox(-2.5F, 3F, -16F, 5F, 4F, 2F, 0F, false);

		leftArm_geo = new AdvancedModelBox(this, "leftArm_geo");
		leftArm_geo.setRotationPoint(-6F, -7.5F, 9.5F);
		leftArm.addChild(leftArm_geo);
		leftArm_geo.setTextureOffset(34, 30).addBox(3F, 5F, -12F, 6F, 19F, 6.5F, 0F, true);

		leftLeg_geo = new AdvancedModelBox(this, "leftLeg_geo");
		leftLeg_geo.setRotationPoint(-3F, -14.5F, -5.5F);
		leftLeg.addChild(leftLeg_geo);
		leftLeg_geo.setTextureOffset(0, 48).addBox(3F, 10F, 4F, 6F, 14F, 6F, 0F, false);

		rightArm_geo = new AdvancedModelBox(this, "rightArm_geo");
		rightArm_geo.setRotationPoint(6F, -7.5F, 9.5F);
		rightArm.addChild(rightArm_geo);
		rightArm_geo.setTextureOffset(34, 30).addBox(-9F, 5F, -12F, 6F, 19F, 6.5F, 0F, false);

		rightLeg_geo = new AdvancedModelBox(this, "rightLeg_geo");
		rightLeg_geo.setRotationPoint(3F, -14.5F, -5.5F);
		rightLeg.addChild(rightLeg_geo);
		rightLeg_geo.setTextureOffset(0, 48).addBox(-9F, 10F, 4F, 6F, 14F, 6F, 0F, true);

		body_geo_body_c0 = new AdvancedModelBox(this, "body_geo_body_c0");
		body_geo_body_c0.setRotationPoint(0F, 13.5F, 1F);
		body_geo.addChild(body_geo_body_c0);
		setRotationAngle(body_geo_body_c0, 0.2618F, 0F, 0F);
		body_geo_body_c0.setTextureOffset(1, 0).addBox(-7F, -8.5F, -12F, 14F, 10F, 20F, 0F, false);

		chest_geo_chest_c0 = new AdvancedModelBox(this, "chest_geo_chest_c0");
		chest_geo_chest_c0.setRotationPoint(0F, 15F, 0F);
		chest_geo.addChild(chest_geo_chest_c0);
		setRotationAngle(chest_geo_chest_c0, 0.4363F, 0F, 0F);
		chest_geo_chest_c0.setTextureOffset(49, 0).addBox(-7F, -9.3F, -3.25F, 14F, 10F, 2F, 0.1F, false);

		chest_geo_chest_c1 = new AdvancedModelBox(this, "chest_geo_chest_c1");
		chest_geo_chest_c1.setRotationPoint(0F, 15F, 0F);
		chest_geo.addChild(chest_geo_chest_c1);
		setRotationAngle(chest_geo_chest_c1, 0.0436F, 0F, 0F);
		chest_geo_chest_c1.setTextureOffset(58, 30).addBox(-6F, -7.5F, 0.5F, 12F, 8F, 2F, 0.1F, false);

		body_sb = new AdvancedModelBox(this, "body_sb");
		body_sb.setRotationPoint(-0F, -10F, -3F);
		body.addChild(body_sb);

		chest_sb = new AdvancedModelBox(this, "chest_sb");
		chest_sb.setRotationPoint(-0F, -14F, -0F);
		chest.addChild(chest_sb);
		chest_sb.setTextureOffset(70, 28).addBox(-9.5F, 8.5F, -3.5F, 3F, 8F, 8F, 0F, true);
		chest_sb.setTextureOffset(70, 28).addBox(6.5F, 8.5F, -3.5F, 3F, 8F, 8F, 0F, false);

		head_sb = new AdvancedModelBox(this, "head_sb");
		head_sb.setRotationPoint(-0F, -6F, 11F);
		head.addChild(head_sb);
		head_sb.setTextureOffset(44, 37).addBox(-4.5F, -4F, -15F, 9F, 11F, 8F, 0F, false);
		head_sb.setTextureOffset(0, 23).addBox(-2.5F, 3F, -17F, 5F, 4F, 2F, 0F, false);

		leftArm_sb = new AdvancedModelBox(this, "leftArm_sb");
		leftArm_sb.setRotationPoint(-6F, -7.5F, 9.5F);
		leftArm.addChild(leftArm_sb);
		leftArm_sb.setTextureOffset(0, 45).addBox(4F, 5F, -12F, 6F, 19F, 7F, 0F, true);

		leftLeg_sb = new AdvancedModelBox(this, "leftLeg_sb");
		leftLeg_sb.setRotationPoint(-3F, -14.5F, -5.5F);
		leftLeg.addChild(leftLeg_sb);
		leftLeg_sb.setTextureOffset(56, 68).addBox(3F, 11F, 5F, 6F, 13F, 6F, 0F, false);

		rightArm_sb = new AdvancedModelBox(this, "rightArm_sb");
		rightArm_sb.setRotationPoint(6F, -7.5F, 9.5F);
		rightArm.addChild(rightArm_sb);
		rightArm_sb.setTextureOffset(0, 45).addBox(-10F, 5F, -12F, 6F, 19F, 7F, 0F, false);

		rightLeg_sb = new AdvancedModelBox(this, "rightLeg_sb");
		rightLeg_sb.setRotationPoint(3F, -14.5F, -5.5F);
		rightLeg.addChild(rightLeg_sb);
		rightLeg_sb.setTextureOffset(56, 68).addBox(-9F, 11F, 5F, 6F, 13F, 6F, 0F, true);

		body_sb_body_c0 = new AdvancedModelBox(this, "body_sb_body_c0");
		body_sb_body_c0.setRotationPoint(0F, 15F, -1F);
		body_sb.addChild(body_sb_body_c0);
		setRotationAngle(body_sb_body_c0, 0.0436F, 0F, 0F);
		body_sb_body_c0.setTextureOffset(0, 23).addBox(-6F, -7.5F, -1F, 12F, 8F, 14F, 0F, false);

		body_sb_body1_c0 = new AdvancedModelBox(this, "body_sb_body1_c0");
		body_sb_body1_c0.setRotationPoint(0F, 15F, -1F);
		body_sb.addChild(body_sb_body1_c0);
		setRotationAngle(body_sb_body1_c0, 0.6109F, 0F, 0F);
		body_sb_body1_c0.setTextureOffset(0, 0).addBox(-7F, -8.5F, -13F, 14F, 10F, 13F, 0F, false);

		chest_sb_chest_c0 = new AdvancedModelBox(this, "chest_sb_chest_c0");
		chest_sb_chest_c0.setRotationPoint(0F, 15F, -1F);
		chest_sb.addChild(chest_sb_chest_c0);
		setRotationAngle(chest_sb_chest_c0, 0.6109F, 0F, 0F);
		chest_sb_chest_c0.setTextureOffset(62, 56).addBox(-7F, -8.5F, -3.25F, 14F, 10F, 2F, 0.1F, false);

		chest_sb_chest_c1 = new AdvancedModelBox(this, "chest_sb_chest_c1");
		chest_sb_chest_c1.setRotationPoint(0F, 15F, -1F);
		chest_sb.addChild(chest_sb_chest_c1);
		setRotationAngle(chest_sb_chest_c1, 0.0436F, 0F, 0F);
		chest_sb_chest_c1.setTextureOffset(24, 70).addBox(-6F, -7.5F, 0.5F, 12F, 8F, 2F, 0.1F, false);
		this.collectVariantParts();
		this.updateDefaultPose();
		animator = ModelAnimator.create();
	}

	public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4) {
		this.resetToDefaultPose();
		animator.update(entity);
		animator.setAnimation(EntityGorilla.ANIMATION_BREAKBLOCK_R);
		animator.startKeyframe(7);
		animator.rotate(chest, 0, Maths.rad(-10F), 0);
		animator.rotate(head, 0, 0, Maths.rad(-10F));
		animator.rotate(rightArm, Maths.rad(65F), Maths.rad(-20F), 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.rotate(chest, 0, Maths.rad(20F), 0);
		animator.rotate(head, 0, 0, Maths.rad(0));
		animator.rotate(rightArm, Maths.rad(-80F),  Maths.rad(-30F),0);
		animator.endKeyframe();
		animator.resetKeyframe(6);
		animator.setAnimation(EntityGorilla.ANIMATION_BREAKBLOCK_L);
		animator.startKeyframe(7);
		animator.rotate(chest, 0, Maths.rad(10F), 0);
		animator.rotate(head, 0, 0, Maths.rad(10F));
		animator.rotate(leftArm, Maths.rad(65F), Maths.rad(20F), 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.rotate(chest, 0, Maths.rad(-20F), 0);
		animator.rotate(head, 0, 0, Maths.rad(0));
		animator.rotate(leftArm, Maths.rad(-80F),  Maths.rad(30F),0);
		animator.endKeyframe();
		animator.resetKeyframe(6);
		animator.setAnimation(EntityGorilla.ANIMATION_POUNDCHEST);
		animator.startKeyframe(5);
		animator.rotate(rightArm, Maths.rad(-60F), 0, Maths.rad(20F));
		animator.rotate(leftArm, Maths.rad(-60F), 0, Maths.rad(-20F));
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.move(rightArm, 0, 5, 0);
		animator.rotate(head, Maths.rad(-0),  Maths.rad(10F), 0);
		animator.rotate(chest, 0, 0,  Maths.rad(10F));
		animator.rotate(rightArm, Maths.rad(-60F), 0, Maths.rad(-80F));
		animator.rotate(leftArm, Maths.rad(-60F), 0, Maths.rad(-40F));
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.move(leftArm, 0, 5, 0);
		animator.rotate(head, Maths.rad(0),  Maths.rad(-10F), 0);
		animator.rotate(chest, 0, 0,  Maths.rad(-10F));
		animator.rotate(rightArm, Maths.rad(-60F), 0, Maths.rad(20F));
		animator.rotate(leftArm, Maths.rad(-60F), 0, Maths.rad(60F));
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.move(rightArm, 0, 5, 0);
		animator.rotate(head, Maths.rad(-0),  Maths.rad(10F), 0);
		animator.rotate(rightArm, Maths.rad(-60F), 0, Maths.rad(-80F));
		animator.rotate(leftArm, Maths.rad(-60F), 0, Maths.rad(-40F));
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.move(leftArm, 0, 5, 0);
		animator.rotate(head, Maths.rad(0),  Maths.rad(-10F), 0);
		animator.rotate(chest, 0, 0,  Maths.rad(-10F));
		animator.rotate(rightArm, Maths.rad(-60F), 0, Maths.rad(20F));
		animator.rotate(leftArm, Maths.rad(-60F), 0, Maths.rad(60F));
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.move(rightArm, 0, 5, 0);
		animator.rotate(chest, 0, 0,  Maths.rad(10F));
		animator.rotate(head, Maths.rad(-0),  Maths.rad(10F), 0);
		animator.rotate(rightArm, Maths.rad(-60F), 0, Maths.rad(-80F));
		animator.rotate(leftArm, Maths.rad(-60F), 0, Maths.rad(-40F));
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.move(leftArm, 0, 5, 0);
		animator.rotate(chest, 0, 0,  Maths.rad(-10F));
		animator.rotate(head, Maths.rad(0),  Maths.rad(-10F), 0);
		animator.rotate(rightArm, Maths.rad(-60F), 0, Maths.rad(20F));
		animator.rotate(leftArm, Maths.rad(-60F), 0, Maths.rad(60F));
		animator.endKeyframe();
		animator.resetKeyframe(5);
		animator.setAnimation(EntityGorilla.ANIMATION_ATTACK);
		animator.startKeyframe(7);
		animator.rotate(leftArm, Maths.rad(65F), Maths.rad(10F), 0);
		animator.rotate(rightArm, Maths.rad(65F), Maths.rad(-10F), 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		animator.rotate(leftArm, Maths.rad(-90F),  Maths.rad(30F),0);
		animator.rotate(rightArm, Maths.rad(-90F),  Maths.rad(-30F),0);
		animator.endKeyframe();
		animator.resetKeyframe(6);
	}

	public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		if (this.young) {
			float f = 1.35F;
			head.setScale(f, f, f);
			head.setShouldScaleChildren(true);
			matrixStackIn.pushPose();
			parts().forEach((p_228292_8_) -> {
				p_228292_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
			});
			matrixStackIn.popPose();
			head.setScale(1, 1, 1);
		} else {
			matrixStackIn.pushPose();
			parts().forEach((p_228290_8_) -> {
				p_228290_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
			});
			matrixStackIn.popPose();
		}
	}

	@Override
	public void setupAnim(EntityGorilla entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.setVariant(entityIn.isSilverback());
		this.resetToDefaultPose();
		animate(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		float walkSpeed = 0.7F;
		float walkDegree = 0.5F;
		float eatSpeed = 0.8F;
		float eatDegree = 0.3F;
		float partialTick = Minecraft.getInstance().getFrameTime();
		float sitProgress = entityIn.prevSitProgress + (entityIn.sitProgress - entityIn.prevSitProgress) * partialTick;
		float standProgress = entityIn.prevStandProgress + (entityIn.standProgress - entityIn.prevStandProgress) * partialTick;
		float rideProgress = entityIn.isPassenger() && entityIn.isBaby() ? 5F : 0;
		this.faceTarget(netHeadYaw, headPitch, 1, head);
		progressRotationPrev(leftArm, rideProgress, Maths.rad(-20), Maths.rad(-20), Maths.rad(-40), 5F);
		progressRotationPrev(rightArm, rideProgress, Maths.rad(-20), Maths.rad(20), Maths.rad(40), 5F);
		progressRotationPrev(leftLeg, rideProgress, Maths.rad(-20), 0, Maths.rad(-80), 5F);
		progressRotationPrev(rightLeg, rideProgress, Maths.rad(-20), 0, Maths.rad(80), 5F);
		progressRotationPrev(head, rideProgress, Maths.rad(15), 0, 0, 5F);
		progressRotationPrev(body, rideProgress, Maths.rad(-10), 0, 0, 5F);
		progressPositionPrev(body, rideProgress, 0, 5, 3, 5F);

		progressRotationPrev(body, sitProgress, Maths.rad(-80), 0, 0, 10F);
		progressRotationPrev(rightLeg, sitProgress, Maths.rad(-10), Maths.rad(-30), Maths.rad(30), 10F);
		progressRotationPrev(leftLeg, sitProgress, Maths.rad(-10), Maths.rad(30), Maths.rad(-30), 10F);
		progressRotationPrev(head, sitProgress, Maths.rad(80), 0, 0, 10F);
		progressRotationPrev(leftArm, sitProgress, Maths.rad(20), 0, 0, 10F);
		progressRotationPrev(rightArm, sitProgress, Maths.rad(20), 0, 0, 10F);
		progressPositionPrev(body, sitProgress, 0, 8, 0, 10F);
		progressPositionPrev(chest, sitProgress, 0, -0.5F, 1.5F, 10F);
		progressPositionPrev(head, sitProgress, 0, 4, -2, 10F);
		progressPositionPrev(leftArm, sitProgress, 0, 0, 2, 10F);
		progressPositionPrev(rightArm, sitProgress, 0, 0, 2, 10F);
		progressRotationPrev(body, standProgress, Maths.rad(-80), 0, 0, 10F);
		progressRotationPrev(rightLeg, standProgress, Maths.rad(80), 0, 0, 10F);
		progressRotationPrev(leftLeg, standProgress, Maths.rad(80), 0, 0, 10F);
		progressRotationPrev(head, standProgress, Maths.rad(80), 0, 0, 10F);
		progressRotationPrev(leftArm, standProgress, Maths.rad(80), 0, 0, 10F);
		progressRotationPrev(rightArm, standProgress, Maths.rad(80), 0, 0, 10F);
		progressPositionPrev(body, standProgress, 0, 1, 0, 10F);
		progressPositionPrev(rightLeg, standProgress, -1, -3, 1.2F, 10F);
		progressPositionPrev(leftLeg, standProgress, 1, -3, 1.2F, 10F);
		progressPositionPrev(leftArm, standProgress, 2, 1, 0, 10F);
		progressPositionPrev(rightArm, standProgress, -2, 1, 0, 10F);
		progressPositionPrev(head, standProgress, 0, 4, -2, 10F);

		this.walk(leftLeg, walkSpeed, walkDegree * 1.2F, true, 0F, 0F, limbSwing, limbSwingAmount);
		this.walk(rightLeg, walkSpeed, walkDegree * 1.2F, false, 0F, 0F, limbSwing, limbSwingAmount);
		this.walk(leftArm, walkSpeed, walkDegree * 1.2F, false, 0F, 0F, limbSwing, limbSwingAmount);
		this.walk(rightArm, walkSpeed, walkDegree * 1.2F, true, 0F, 0F, limbSwing, limbSwingAmount);
		this.flap(body, walkSpeed, walkDegree * 0.2F, true, 1F, 0F, limbSwing, limbSwingAmount);
		if(entityIn.isEating()){
			this.walk(rightArm, eatSpeed, eatDegree, false, 1F, -0.3F, ageInTicks, 1);
			this.walk(leftArm, eatSpeed, eatDegree, false, 1F, -0.3F, ageInTicks, 1);
			this.walk(chest, eatSpeed, eatDegree * 0.1F, false, 2F, 0.3F, ageInTicks, 1);
			this.walk(head, eatSpeed, eatDegree * 0.3F, true, 1F, 0.3F, ageInTicks, 1);
		}
	}



	private final java.util.List<AdvancedModelBox> normalParts = new java.util.ArrayList<>();
	private final java.util.List<AdvancedModelBox> silverbackParts = new java.util.ArrayList<>();
	private boolean variantSilverback = false;

	private void collectVariantParts() {
		for (AdvancedModelBox b : getAllParts()) {
			if (b.boxName != null && b.boxName.endsWith("_geo")) normalParts.add(b);
			if (b.boxName != null && b.boxName.endsWith("_sb")) silverbackParts.add(b);
		}
	}

	public void setVariant(boolean silverback) {
		if (this.variantSilverback == silverback) return;
		this.variantSilverback = silverback;
		normalParts.forEach(p -> p.showModel = !silverback);
		silverbackParts.forEach(p -> p.showModel = silverback);
	}

	public void setRotationAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
		AdvancedModelBox.rotateAngleX = x;
		AdvancedModelBox.rotateAngleY = y;
		AdvancedModelBox.rotateAngleZ = z;
	}

	@Override
	public Iterable<BasicModelPart> parts() {
		return ImmutableList.of(root);
	}

	@Override
	public Iterable<AdvancedModelBox> getAllParts() {
		return ImmutableList.of(root, body, chest, head, foreheadDK_r1, mouth, leftArm, rightArm, leftLeg, rightLeg, body_geo, chest_geo, head_geo, leftArm_geo, leftLeg_geo, rightArm_geo, rightLeg_geo, body_geo_body_c0, chest_geo_chest_c0, chest_geo_chest_c1, body_sb, chest_sb, head_sb, leftArm_sb, leftLeg_sb, rightArm_sb, rightLeg_sb, body_sb_body_c0, body_sb_body1_c0, chest_sb_chest_c0, chest_sb_chest_c1);
	}

}