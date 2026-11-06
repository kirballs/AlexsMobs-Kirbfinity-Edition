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
    private final AdvancedModelBox normalRoot;
    private final AdvancedModelBox silverbackRoot;
    private final AdvancedModelBox n_body;
    private final AdvancedModelBox n_chest;
    private final AdvancedModelBox n_head;
    private final AdvancedModelBox n_mouth;
    private final AdvancedModelBox n_foreheadDK_r1;
    private final AdvancedModelBox n_leftArm;
    private final AdvancedModelBox n_rightArm;
    private final AdvancedModelBox n_leftLeg;
    private final AdvancedModelBox n_rightLeg;
    private final AdvancedModelBox n_body_geo;
    private final AdvancedModelBox n_body_geo_c0;
    private final AdvancedModelBox n_chest_geo;
    private final AdvancedModelBox n_chest_geo_c0;
    private final AdvancedModelBox n_chest_geo_c1;
    private final AdvancedModelBox n_head_geo;
    private final AdvancedModelBox n_mouth_geo;
    private final AdvancedModelBox n_leftArm_geo;
    private final AdvancedModelBox n_rightArm_geo;
    private final AdvancedModelBox n_leftLeg_geo;
    private final AdvancedModelBox n_rightLeg_geo;
    private final AdvancedModelBox s_body;
    private final AdvancedModelBox s_chest;
    private final AdvancedModelBox s_head;
    private final AdvancedModelBox s_mouth;
    private final AdvancedModelBox s_foreheadDK_r1;
    private final AdvancedModelBox s_leftArm;
    private final AdvancedModelBox s_rightArm;
    private final AdvancedModelBox s_leftLeg;
    private final AdvancedModelBox s_rightLeg;
    private final AdvancedModelBox s_body_sb;
    private final AdvancedModelBox s_body_sb_c0;
    private final AdvancedModelBox s_body_sb_c1;
    private final AdvancedModelBox s_chest_sb;
    private final AdvancedModelBox s_chest_sb_c0;
    private final AdvancedModelBox s_chest_sb_c1;
    private final AdvancedModelBox s_head_sb;
    private final AdvancedModelBox s_mouth_sb;
    private final AdvancedModelBox s_leftArm_sb;
    private final AdvancedModelBox s_rightArm_sb;
    private final AdvancedModelBox s_leftLeg_sb;
    private final AdvancedModelBox s_rightLeg_sb;
    public AdvancedModelBox body;
    public AdvancedModelBox chest;
    public AdvancedModelBox head;
    public AdvancedModelBox foreheadDK_r1;
    public AdvancedModelBox mouth;
    public AdvancedModelBox leftArm;
    public AdvancedModelBox rightArm;
    public AdvancedModelBox leftLeg;
    public AdvancedModelBox rightLeg;
    private final ModelAnimator animator;
    private Boolean variantSilverback = null;

    public ModelGorilla() {
        // Generated from customs/gorilla.geo.json (normal) and customs/silverback.geo.json
        // (silverback), both 128x128. Bedrock -> Java: X/Z identical, Y flipped
        // about the ground plane (24 - y). Every animated bone sits at the real
        // geometry pivot of its own variant, so animations rotate correctly.
        // The silverback "saddle" tack bone from the source geometry is not imported.
        texWidth = 128;
        texHeight = 128;

        root = new AdvancedModelBox(this, "root");
        root.setRotationPoint(0F, 24F, 0F);

        normalRoot = new AdvancedModelBox(this, "normalRoot");
        normalRoot.setRotationPoint(0F, 0F, 0F);
        root.addChild(normalRoot);

        silverbackRoot = new AdvancedModelBox(this, "silverbackRoot");
        silverbackRoot.setRotationPoint(0F, 0F, 0F);
        root.addChild(silverbackRoot);

        n_body = new AdvancedModelBox(this, "n_body");
        n_body.setRotationPoint(0F, -11.5F, 9F);
        normalRoot.addChild(n_body);

        n_chest = new AdvancedModelBox(this, "n_chest");
        n_chest.setRotationPoint(0F, -3.5F, -7.5F);
        n_body.addChild(n_chest);

        n_head = new AdvancedModelBox(this, "n_head");
        n_head.setRotationPoint(0F, -4.75F, -10F);
        n_chest.addChild(n_head);

        n_mouth = new AdvancedModelBox(this, "n_mouth");
        n_mouth.setRotationPoint(0F, 0F, 0F);
        n_head.addChild(n_mouth);

        n_foreheadDK_r1 = new AdvancedModelBox(this, "n_foreheadDK_r1");
        n_foreheadDK_r1.setRotationPoint(0F, 0F, 0F);
        n_head.addChild(n_foreheadDK_r1);

        n_leftArm = new AdvancedModelBox(this, "n_leftArm");
        n_leftArm.setRotationPoint(6F, -1.5F, -9.25F);
        n_chest.addChild(n_leftArm);

        n_rightArm = new AdvancedModelBox(this, "n_rightArm");
        n_rightArm.setRotationPoint(-6F, -1.5F, -9.25F);
        n_chest.addChild(n_rightArm);

        n_leftLeg = new AdvancedModelBox(this, "n_leftLeg");
        n_leftLeg.setRotationPoint(6F, 0F, 0F);
        n_body.addChild(n_leftLeg);

        n_rightLeg = new AdvancedModelBox(this, "n_rightLeg");
        n_rightLeg.setRotationPoint(-6F, 0F, 0F);
        n_body.addChild(n_rightLeg);

        n_body_geo = new AdvancedModelBox(this, "n_body_geo");
        n_body_geo.setRotationPoint(0F, 0F, 0F);
        n_body.addChild(n_body_geo);
        n_body_geo_c0 = new AdvancedModelBox(this, "n_body_geo_c0");
        n_body_geo_c0.setRotationPoint(0F, 1F, -8F);
        n_body_geo.addChild(n_body_geo_c0);
        setRotationAngle(n_body_geo_c0, 0.2618F, 0F, 0F);
        n_body_geo_c0.setTextureOffset(1, 0).addBox(-7F, -8.5F, -12F, 14F, 10F, 20F, 0F, false);

        n_chest_geo = new AdvancedModelBox(this, "n_chest_geo");
        n_chest_geo.setRotationPoint(0F, 0F, 0F);
        n_chest.addChild(n_chest_geo);
        n_chest_geo_c0 = new AdvancedModelBox(this, "n_chest_geo_c0");
        n_chest_geo_c0.setRotationPoint(0F, 6F, -1.5F);
        n_chest_geo.addChild(n_chest_geo_c0);
        setRotationAngle(n_chest_geo_c0, 0.4363F, 0F, 0F);
        n_chest_geo_c0.setTextureOffset(49, 0).addBox(-7F, -9.3F, -3.25F, 14F, 10F, 2F, 0.1F, false);
        n_chest_geo_c1 = new AdvancedModelBox(this, "n_chest_geo_c1");
        n_chest_geo_c1.setRotationPoint(0F, 6F, -1.5F);
        n_chest_geo.addChild(n_chest_geo_c1);
        setRotationAngle(n_chest_geo_c1, 0.0436F, 0F, 0F);
        n_chest_geo_c1.setTextureOffset(58, 30).addBox(-6F, -7.5F, 0.5F, 12F, 8F, 2F, 0.1F, false);
        n_chest_geo.setTextureOffset(50, 47).addBox(-9.5F, -0.5F, -5F, 3F, 8F, 8F, 0F, true);
        n_chest_geo.setTextureOffset(50, 47).addBox(6.5F, -0.5F, -5F, 3F, 8F, 8F, 0F, false);

        n_head_geo = new AdvancedModelBox(this, "n_head_geo");
        n_head_geo.setRotationPoint(0F, 0F, 0F);
        n_head.addChild(n_head_geo);
        n_head_geo.setTextureOffset(0, 30).addBox(-4.5F, -7.25F, -5.5F, 9F, 10F, 8F, 0F, false);

        n_mouth_geo = new AdvancedModelBox(this, "n_mouth_geo");
        n_mouth_geo.setRotationPoint(0F, 0F, 0F);
        n_mouth.addChild(n_mouth_geo);
        n_mouth_geo.setTextureOffset(0, 0).addBox(-2.5F, -1.25F, -7.5F, 5F, 4F, 2F, 0F, false);

        n_leftArm_geo = new AdvancedModelBox(this, "n_leftArm_geo");
        n_leftArm_geo.setRotationPoint(0F, 0F, 0F);
        n_leftArm.addChild(n_leftArm_geo);
        n_leftArm_geo.setTextureOffset(34, 30).addBox(-3F, -2.5F, -4.25F, 6F, 19F, 6.5F, 0F, true);

        n_rightArm_geo = new AdvancedModelBox(this, "n_rightArm_geo");
        n_rightArm_geo.setRotationPoint(0F, 0F, 0F);
        n_rightArm.addChild(n_rightArm_geo);
        n_rightArm_geo.setTextureOffset(34, 30).addBox(-3F, -2.5F, -4.25F, 6F, 19F, 6.5F, 0F, false);

        n_leftLeg_geo = new AdvancedModelBox(this, "n_leftLeg_geo");
        n_leftLeg_geo.setRotationPoint(0F, 0F, 0F);
        n_leftLeg.addChild(n_leftLeg_geo);
        n_leftLeg_geo.setTextureOffset(0, 48).addBox(-3F, -2.5F, -5F, 6F, 14F, 6F, 0F, false);

        n_rightLeg_geo = new AdvancedModelBox(this, "n_rightLeg_geo");
        n_rightLeg_geo.setRotationPoint(0F, 0F, 0F);
        n_rightLeg.addChild(n_rightLeg_geo);
        n_rightLeg_geo.setTextureOffset(0, 48).addBox(-3F, -2.5F, -5F, 6F, 14F, 6F, 0F, true);

        // --- silverback geometry ---

        s_body = new AdvancedModelBox(this, "s_body");
        s_body.setRotationPoint(0F, -11.5F, 8F);
        silverbackRoot.addChild(s_body);

        s_chest = new AdvancedModelBox(this, "s_chest");
        s_chest.setRotationPoint(0F, -3.5F, -7.5F);
        s_body.addChild(s_chest);

        s_head = new AdvancedModelBox(this, "s_head");
        s_head.setRotationPoint(0F, -4.75F, -10F);
        s_chest.addChild(s_head);

        s_mouth = new AdvancedModelBox(this, "s_mouth");
        s_mouth.setRotationPoint(0F, 0F, 0F);
        s_head.addChild(s_mouth);

        s_foreheadDK_r1 = new AdvancedModelBox(this, "s_foreheadDK_r1");
        s_foreheadDK_r1.setRotationPoint(0F, 0F, 0F);
        s_head.addChild(s_foreheadDK_r1);

        s_leftArm = new AdvancedModelBox(this, "s_leftArm");
        s_leftArm.setRotationPoint(9F, -1.5F, -8F);
        s_chest.addChild(s_leftArm);

        s_rightArm = new AdvancedModelBox(this, "s_rightArm");
        s_rightArm.setRotationPoint(-9F, -1.5F, -8F);
        s_chest.addChild(s_rightArm);

        s_leftLeg = new AdvancedModelBox(this, "s_leftLeg");
        s_leftLeg.setRotationPoint(6F, 0F, 0F);
        s_body.addChild(s_leftLeg);

        s_rightLeg = new AdvancedModelBox(this, "s_rightLeg");
        s_rightLeg.setRotationPoint(-6F, 0F, 0F);
        s_body.addChild(s_rightLeg);

        s_body_sb = new AdvancedModelBox(this, "s_body_sb");
        s_body_sb.setRotationPoint(0F, 0F, 0F);
        s_body.addChild(s_body_sb);
        s_body_sb_c0 = new AdvancedModelBox(this, "s_body_sb_c0");
        s_body_sb_c0.setRotationPoint(0F, 2.5F, -9F);
        s_body_sb.addChild(s_body_sb_c0);
        setRotationAngle(s_body_sb_c0, 0.0436F, 0F, 0F);
        s_body_sb_c0.setTextureOffset(0, 23).addBox(-6F, -7.5F, -1F, 12F, 8F, 14F, 0F, false);
        s_body_sb_c1 = new AdvancedModelBox(this, "s_body_sb_c1");
        s_body_sb_c1.setRotationPoint(0F, 2.5F, -9F);
        s_body_sb.addChild(s_body_sb_c1);
        setRotationAngle(s_body_sb_c1, 0.6109F, 0F, 0F);
        s_body_sb_c1.setTextureOffset(0, 0).addBox(-7F, -8.5F, -13F, 14F, 10F, 13F, 0F, false);

        s_chest_sb = new AdvancedModelBox(this, "s_chest_sb");
        s_chest_sb.setRotationPoint(0F, 0F, 0F);
        s_chest.addChild(s_chest_sb);
        s_chest_sb_c0 = new AdvancedModelBox(this, "s_chest_sb_c0");
        s_chest_sb_c0.setRotationPoint(0F, 6F, -1.5F);
        s_chest_sb.addChild(s_chest_sb_c0);
        setRotationAngle(s_chest_sb_c0, 0.6109F, 0F, 0F);
        s_chest_sb_c0.setTextureOffset(62, 56).addBox(-7F, -8.5F, -3.25F, 14F, 10F, 2F, 0.1F, false);
        s_chest_sb_c1 = new AdvancedModelBox(this, "s_chest_sb_c1");
        s_chest_sb_c1.setRotationPoint(0F, 6F, -1.5F);
        s_chest_sb.addChild(s_chest_sb_c1);
        setRotationAngle(s_chest_sb_c1, 0.0436F, 0F, 0F);
        s_chest_sb_c1.setTextureOffset(24, 70).addBox(-6F, -7.5F, 0.5F, 12F, 8F, 2F, 0.1F, false);
        s_chest_sb.setTextureOffset(70, 28).addBox(-9.5F, -0.5F, -4F, 3F, 8F, 8F, 0F, true);
        s_chest_sb.setTextureOffset(70, 28).addBox(6.5F, -0.5F, -4F, 3F, 8F, 8F, 0F, false);

        s_head_sb = new AdvancedModelBox(this, "s_head_sb");
        s_head_sb.setRotationPoint(0F, 0F, 0F);
        s_head.addChild(s_head_sb);
        s_head_sb.setTextureOffset(44, 37).addBox(-4.5F, -8.25F, -5.5F, 9F, 11F, 8F, 0F, false);

        s_mouth_sb = new AdvancedModelBox(this, "s_mouth_sb");
        s_mouth_sb.setRotationPoint(0F, 0F, 0F);
        s_mouth.addChild(s_mouth_sb);
        s_mouth_sb.setTextureOffset(0, 23).addBox(-2.5F, -1.25F, -7.5F, 5F, 4F, 2F, 0F, false);

        s_leftArm_sb = new AdvancedModelBox(this, "s_leftArm_sb");
        s_leftArm_sb.setRotationPoint(0F, 0F, 0F);
        s_leftArm.addChild(s_leftArm_sb);
        s_leftArm_sb.setTextureOffset(0, 45).addBox(-5F, -2.5F, -4.5F, 6F, 19F, 7F, 0F, true);

        s_rightArm_sb = new AdvancedModelBox(this, "s_rightArm_sb");
        s_rightArm_sb.setRotationPoint(0F, 0F, 0F);
        s_rightArm.addChild(s_rightArm_sb);
        s_rightArm_sb.setTextureOffset(0, 45).addBox(-1F, -2.5F, -4.5F, 6F, 19F, 7F, 0F, false);

        s_leftLeg_sb = new AdvancedModelBox(this, "s_leftLeg_sb");
        s_leftLeg_sb.setRotationPoint(0F, 0F, 0F);
        s_leftLeg.addChild(s_leftLeg_sb);
        s_leftLeg_sb.setTextureOffset(56, 68).addBox(-3F, -1.5F, -3F, 6F, 13F, 6F, 0F, false);

        s_rightLeg_sb = new AdvancedModelBox(this, "s_rightLeg_sb");
        s_rightLeg_sb.setRotationPoint(0F, 0F, 0F);
        s_rightLeg.addChild(s_rightLeg_sb);
        s_rightLeg_sb.setTextureOffset(56, 68).addBox(-3F, -1.5F, -3F, 6F, 13F, 6F, 0F, true);

        this.updateDefaultPose();
        animator = ModelAnimator.create();
        // Force a defined initial state: hide the silverback and point the animated
        // fields at the normal hierarchy before the first render.
        this.setVariant(false);
    }

    /** Swaps both the visible geometry and the animated bone references. */
    public void setVariant(boolean silverback) {
        if (this.variantSilverback != null && this.variantSilverback == silverback) {
            return;
        }
        this.variantSilverback = silverback;
        normalRoot.showModel = !silverback;
        silverbackRoot.showModel = silverback;
        body = silverback ? s_body : n_body;
        chest = silverback ? s_chest : n_chest;
        head = silverback ? s_head : n_head;
        foreheadDK_r1 = silverback ? s_foreheadDK_r1 : n_foreheadDK_r1;
        mouth = silverback ? s_mouth : n_mouth;
        leftArm = silverback ? s_leftArm : n_leftArm;
        rightArm = silverback ? s_rightArm : n_rightArm;
        leftLeg = silverback ? s_leftLeg : n_leftLeg;
        rightLeg = silverback ? s_rightLeg : n_rightLeg;
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

    @Override
    public Iterable<BasicModelPart> parts() {
        return ImmutableList.of(root);
    }

    @Override
    public Iterable<AdvancedModelBox> getAllParts() {
        return ImmutableList.of(root, normalRoot, silverbackRoot, n_body, n_chest, n_head, n_mouth, n_foreheadDK_r1, n_leftArm, n_rightArm, n_leftLeg, n_rightLeg, n_body_geo, n_body_geo_c0, n_chest_geo, n_chest_geo_c0, n_chest_geo_c1, n_head_geo, n_mouth_geo, n_leftArm_geo, n_rightArm_geo, n_leftLeg_geo, n_rightLeg_geo, s_body, s_chest, s_head, s_mouth, s_foreheadDK_r1, s_leftArm, s_rightArm, s_leftLeg, s_rightLeg, s_body_sb, s_body_sb_c0, s_body_sb_c1, s_chest_sb, s_chest_sb_c0, s_chest_sb_c1, s_head_sb, s_mouth_sb, s_leftArm_sb, s_rightArm_sb, s_leftLeg_sb, s_rightLeg_sb);
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

    public void setRotationAngle(AdvancedModelBox box, float x, float y, float z) {
        box.rotateAngleX = x;
        box.rotateAngleY = y;
        box.rotateAngleZ = z;
    }
}
