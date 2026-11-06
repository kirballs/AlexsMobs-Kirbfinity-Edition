package com.github.alexthe666.alexsmobs.client.model;

import com.github.alexthe666.alexsmobs.entity.EntityTiger;
import com.github.alexthe666.alexsmobs.entity.util.Maths;
import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.github.alexthe666.citadel.client.model.ModelAnimator;
import com.github.alexthe666.citadel.client.model.basic.BasicModelPart;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

public class ModelTiger extends AdvancedEntityModel<EntityTiger> {
    private final AdvancedModelBox root;
    private final AdvancedModelBox body;
    private final AdvancedModelBox tail;
    private final AdvancedModelBox tail2;
    private final AdvancedModelBox head;
    private final AdvancedModelBox snout;
    private final AdvancedModelBox earleft;
    private final AdvancedModelBox earright;
    private final AdvancedModelBox armleft;
    private final AdvancedModelBox armright;
    private final AdvancedModelBox legleft;
    private final AdvancedModelBox legright;
    private final AdvancedModelBox body_geo;
    private final AdvancedModelBox tail_geo;
    private final AdvancedModelBox tail2_geo;
    private final AdvancedModelBox head_geo;
    private final AdvancedModelBox snout_geo;
    private final AdvancedModelBox earleft_geo;
    private final AdvancedModelBox earright_geo;
    private final AdvancedModelBox armleft_geo;
    private final AdvancedModelBox armright_geo;
    private final AdvancedModelBox legleft_geo;
    private final AdvancedModelBox legright_geo;
    private final ModelAnimator animator;

    public ModelTiger() {
        // Generated from customs/big_cat1.geo.json (128x128 texture).
        // Bedrock -> Java: X/Z identical, Y flipped about the ground plane (24 - y).
        // Each animated bone sits at the geometry bone's real pivot, so the upstream
        // animations rotate around the correct centres. Saddle/rein/chest tack bones
        // from the source geometry are intentionally not imported.
        texWidth = 128;
        texHeight = 128;

        root = new AdvancedModelBox(this, "root");
        root.setRotationPoint(0F, 24F, 0F);

        body = new AdvancedModelBox(this, "body");
        body.setRotationPoint(0F, -13.5F, 8F);
        root.addChild(body);

        tail = new AdvancedModelBox(this, "tail");
        tail.setRotationPoint(0F, -3.5F, 3F);
        body.addChild(tail);
        setRotationAngle(tail, 0.9599F, 0F, 0F);

        tail2 = new AdvancedModelBox(this, "tail2");
        tail2.setRotationPoint(0F, 2F, 11F);
        tail.addChild(tail2);
        setRotationAngle(tail2, -0.5672F, 0F, 0F);

        head = new AdvancedModelBox(this, "head");
        head.setRotationPoint(0F, -2F, -19F);
        body.addChild(head);

        snout = new AdvancedModelBox(this, "snout");
        snout.setRotationPoint(0F, 0F, 0F);
        head.addChild(snout);

        earleft = new AdvancedModelBox(this, "earleft");
        earleft.setRotationPoint(1.75F, 2.1719F, -2.5361F);
        head.addChild(earleft);
        setRotationAngle(earleft, -0.3491F, -0.4363F, -0.2618F);

        earright = new AdvancedModelBox(this, "earright");
        earright.setRotationPoint(-1.75F, 2.1719F, -2.5361F);
        head.addChild(earright);
        setRotationAngle(earright, -0.3491F, 0.4363F, 0.2618F);

        armleft = new AdvancedModelBox(this, "armleft");
        armleft.setRotationPoint(4F, -1F, -15F);
        body.addChild(armleft);

        armright = new AdvancedModelBox(this, "armright");
        armright.setRotationPoint(-4F, -1F, -15F);
        body.addChild(armright);

        legleft = new AdvancedModelBox(this, "legleft");
        legleft.setRotationPoint(3F, 1F, 0F);
        body.addChild(legleft);

        legright = new AdvancedModelBox(this, "legright");
        legright.setRotationPoint(-3F, 1F, 0F);
        body.addChild(legright);

        body_geo = new AdvancedModelBox(this, "body_geo");
        body_geo.setRotationPoint(0F, 0F, 0F);
        body.addChild(body_geo);
        body_geo.setTextureOffset(0, 21).addBox(-5F, -4.5F, -19F, 10F, 9F, 10F, 0F, false);
        body_geo.setTextureOffset(0, 0).addBox(-4.5F, -4.5F, -9F, 9F, 9F, 12F, 0F, false);

        tail_geo = new AdvancedModelBox(this, "tail_geo");
        tail_geo.setRotationPoint(0F, 0F, 0F);
        tail.addChild(tail_geo);
        tail_geo.setTextureOffset(31, 10).addBox(-1F, 0F, 0F, 2F, 2F, 11F, 0F, false);

        tail2_geo = new AdvancedModelBox(this, "tail2_geo");
        tail2_geo.setRotationPoint(0F, 0F, 0F);
        tail2.addChild(tail2_geo);
        tail2_geo.setTextureOffset(40, 23).addBox(-1F, -2F, 0F, 2F, 2F, 8F, 0.1F, false);

        head_geo = new AdvancedModelBox(this, "head_geo");
        head_geo.setRotationPoint(0F, 0F, 0F);
        head.addChild(head_geo);
        head_geo.setTextureOffset(33, 33).addBox(-4F, -3.5F, -7F, 8F, 7F, 7F, 0F, false);

        snout_geo = new AdvancedModelBox(this, "snout_geo");
        snout_geo.setRotationPoint(0F, 0F, 0F);
        snout.addChild(snout_geo);
        snout_geo.setTextureOffset(30, 23).addBox(-2.5F, -0.5F, -10F, 5F, 4F, 3F, 0F, false);

        earleft_geo = new AdvancedModelBox(this, "earleft_geo");
        earleft_geo.setRotationPoint(0F, 0F, 0F);
        earleft.addChild(earleft_geo);
        earleft_geo.setTextureOffset(0, 4).addBox(-1F, -7.25F, 1F, 2F, 2F, 1F, 0F, false);

        earright_geo = new AdvancedModelBox(this, "earright_geo");
        earright_geo.setRotationPoint(0F, 0F, 0F);
        earright.addChild(earright_geo);
        earright_geo.setTextureOffset(0, 4).addBox(-1F, -7.25F, 1F, 2F, 2F, 1F, 0F, true);

        armleft_geo = new AdvancedModelBox(this, "armleft_geo");
        armleft_geo.setRotationPoint(0F, 0F, 0F);
        armleft.addChild(armleft_geo);
        armleft_geo.setTextureOffset(44, 47).addBox(-2F, -0.5F, -2F, 4F, 15F, 4F, 0F, false);

        armright_geo = new AdvancedModelBox(this, "armright_geo");
        armright_geo.setRotationPoint(0F, 0F, 0F);
        armright.addChild(armright_geo);
        armright_geo.setTextureOffset(44, 47).addBox(-2F, -0.5F, -2F, 4F, 15F, 4F, 0F, true);

        legleft_geo = new AdvancedModelBox(this, "legleft_geo");
        legleft_geo.setRotationPoint(0F, 0F, 0F);
        legleft.addChild(legleft_geo);
        legleft_geo.setTextureOffset(0, 56).addBox(-2F, -0.5F, -2F, 4F, 13F, 4F, 0F, false);

        legright_geo = new AdvancedModelBox(this, "legright_geo");
        legright_geo.setRotationPoint(0F, 0F, 0F);
        legright.addChild(legright_geo);
        legright_geo.setTextureOffset(0, 56).addBox(-2F, -0.5F, -2F, 4F, 13F, 4F, 0F, true);

        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4) {
        this.resetToDefaultPose();
        animator.update(entity);
        animator.setAnimation(EntityTiger.ANIMATION_PAW_R);
        animator.startKeyframe(5);
        animator.rotate(head, Maths.rad(10F), 0, 0);
        animator.rotate(tail, Maths.rad(10F), 0, 0);
        animator.rotate(armleft, Maths.rad(-20F), 0, 0);
        animator.rotate(armright, Maths.rad(-20F), 0, 0);
        animator.move(body, 0, 0, 3F);
        animator.move(armright, 0, 1, 0);
        animator.move(armleft, 0, 1, 0);
        animator.endKeyframe();
        animator.startKeyframe(3);
        animator.rotate(head, Maths.rad(35F), 0, 0);
        animator.rotate(armleft, Maths.rad(-30F), 0, 0);
        animator.rotate(armright, Maths.rad(-70F), 0, Maths.rad(20F));
        animator.rotate(tail, Maths.rad(50F), 0, 0);
        animator.rotate(tail2, Maths.rad(10F), 0, 0);
        animator.move(body, 0, -3, -3);
        animator.rotate(body, Maths.rad(-30F), 0, 0);
        animator.rotate(legleft, Maths.rad(30F), 0, 0);
        animator.rotate(legright, Maths.rad(30F), 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(head, Maths.rad(35F), 0, 0);
        animator.rotate(armleft, Maths.rad(10F), 0, Maths.rad(-10F));
        animator.rotate(armright, Maths.rad(-40F), 0, Maths.rad(-20F));
        animator.rotate(tail, Maths.rad(50F), 0, 0);
        animator.rotate(tail2, Maths.rad(10F), 0, 0);
        animator.move(body, 0, -3, -3);
        animator.move(armright, -1, 0, 0);
        animator.rotate(body, Maths.rad(-30F), 0, 0);
        animator.rotate(legleft, Maths.rad(30F), 0, 0);
        animator.rotate(legright, Maths.rad(30F), 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityTiger.ANIMATION_PAW_L);
        animator.startKeyframe(5);
        animator.rotate(head, Maths.rad(10F), 0, 0);
        animator.rotate(tail, Maths.rad(10F), 0, 0);
        animator.rotate(armleft, Maths.rad(-20F), 0, 0);
        animator.rotate(armright, Maths.rad(-20F), 0, 0);
        animator.move(body, 0, 0, 3F);
        animator.move(armright, 0, 1, 0);
        animator.move(armleft, 0, 1, 0);
        animator.endKeyframe();
        animator.startKeyframe(3);
        animator.rotate(head, Maths.rad(35F), 0, 0);
        animator.rotate(armleft, Maths.rad(-70F), 0, Maths.rad(-20F));
        animator.rotate(armright, Maths.rad(-30F), 0, 0);
        animator.rotate(tail, Maths.rad(50F), 0, 0);
        animator.rotate(tail2, Maths.rad(10F), 0, 0);
        animator.move(body, 0, -3, -3);
        animator.rotate(body, Maths.rad(-30F), 0, 0);
        animator.rotate(legleft, Maths.rad(30F), 0, 0);
        animator.rotate(legright, Maths.rad(30F), 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(head, Maths.rad(35F), 0, 0);
        animator.rotate(armleft, Maths.rad(-40F), 0, Maths.rad(10F));
        animator.rotate(armright, Maths.rad(10F), 0, Maths.rad(20F));
        animator.rotate(tail, Maths.rad(50F), 0, 0);
        animator.rotate(tail2, Maths.rad(10F), 0, 0);
        animator.move(body, 0, -3, -3);
        animator.move(armleft, 1, 0, 0);
        animator.rotate(body, Maths.rad(-30F), 0, 0);
        animator.rotate(legleft, Maths.rad(30F), 0, 0);
        animator.rotate(legright, Maths.rad(30F), 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityTiger.ANIMATION_TAIL_FLICK);
        animator.startKeyframe(5);
        animator.rotate(tail, Maths.rad(10F), 0, Maths.rad(30F));
        animator.rotate(tail2, Maths.rad(10F), 0, Maths.rad(20F));
        animator.endKeyframe();
        animator.startKeyframe(10);
        animator.rotate(tail, Maths.rad(10F), 0, Maths.rad(-30F));
        animator.rotate(tail2, Maths.rad(10F), 0, Maths.rad(-20F));
        animator.endKeyframe();
        animator.startKeyframe(10);
        animator.rotate(tail, Maths.rad(10F), 0, Maths.rad(30F));
        animator.rotate(tail2, Maths.rad(10F), 0, Maths.rad(20F));
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityTiger.ANIMATION_LEAP);
        animator.startKeyframe(5);
        animator.move(body, 0, 1, 3F);
        animator.move(head, 0, 2, 0);
        animator.move(armright, 0, 1, 2);
        animator.move(armleft, 0, 1, 2);
        animator.rotate(head, Maths.rad(-15F), 0, 0);
        animator.rotate(tail, Maths.rad(10F), 0, 0);
        animator.rotate(body, Maths.rad(10F), 0, 0);
        animator.rotate(armleft, Maths.rad(-50F), 0, 0);
        animator.rotate(armright, Maths.rad(-50F), 0, 0);
        animator.rotate(legright, Maths.rad(-20F), 0, 0);
        animator.rotate(legleft, Maths.rad(-20F), 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        animator.rotate(tail, Maths.rad(90F), 0, 0);
        animator.rotate(tail2, Maths.rad(-10F), 0, 0);
        animator.rotate(legleft, Maths.rad(30F), 0, Maths.rad(-10F));
        animator.rotate(legright, Maths.rad(30F), 0, Maths.rad(10F));
        animator.rotate(armright, Maths.rad(-60F), 0, Maths.rad(30F));
        animator.rotate(armleft, Maths.rad(-60F), 0, Maths.rad(-30F));
        animator.move(armright, -1, -1, 1);
        animator.move(armleft, 1, -1, 1);
        animator.move(legright, 0, -4, -1);
        animator.move(legleft, 0, -4, -1);
        animator.move(body, 0, -5, 4);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);


    }

public void setupAnim(EntityTiger entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        animate(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        float walkSpeed = 0.7F;
        float walkDegree = 0.8F;
        float runSpeed = 1.0F;
        float runDegree = 0.8F;
        float idleSpeed = 0.1F;
        float idleDegree = 0.1F;
        float moveProgress = 5F * limbSwingAmount;
        float partialTick = ageInTicks - entity.tickCount;
        float sitProgress = entity.prevSitProgress + (entity.sitProgress - entity.prevSitProgress) * partialTick;
        float holdProgress = entity.prevHoldProgress + (entity.holdProgress - entity.prevHoldProgress) * partialTick;
        float sleepProgress = entity.prevSleepProgress + (entity.sleepProgress - entity.prevSleepProgress) * partialTick;
        boolean leftSleep = entity.getId() % 2 == 0;
        this.walk(tail, idleSpeed, idleDegree * 1F, false, -2F, 0.1F, ageInTicks, 1);
        this.flap(tail, idleSpeed, idleDegree * 1.2F, false, 2F, 0F, ageInTicks, 1);
        this.flap(tail2, idleSpeed, idleDegree * 2F, false, 2F, 0F, ageInTicks, 1);
        AdvancedModelBox[] tailBoxes = new AdvancedModelBox[]{tail, tail2};
        progressRotationPrev(tail, moveProgress, Maths.rad(40), 0, 0, 5F);
        progressPositionPrev(head, Math.min(moveProgress * 2F, 5F), 0, 2, 0, 5F);
        progressPositionPrev(tail, moveProgress, 0, 1, 0, 5F);
        progressPositionPrev(body, moveProgress, 0, 1, 0, 5F);
        progressPositionPrev(armleft, moveProgress, 0, -1, 0, 5F);
        progressPositionPrev(armright, moveProgress, 0, -1, 0, 5F);
        progressPositionPrev(legleft, moveProgress, 0, -1, 0, 5F);
        progressPositionPrev(legright, moveProgress, 0, -1, 0, 5F);
        if (entity.isRunning()) {
            this.chainFlap(tailBoxes, runSpeed, runDegree * 0.5F, -1, limbSwing, limbSwingAmount);
            this.bob(body, runSpeed, runDegree * 2, false, limbSwing, limbSwingAmount);
            this.bob(head, runSpeed, runDegree * -1, false, limbSwing, limbSwingAmount);
            this.walk(armleft, runSpeed, runDegree * 0.75F, true, 0F, 0F, limbSwing, limbSwingAmount);
            this.walk(armright, runSpeed, runDegree * 0.75F, true, 0F, 0F, limbSwing, limbSwingAmount);
            this.walk(legright, runSpeed, runDegree * 1F, false, 0.5F, 0F, limbSwing, limbSwingAmount);
            this.walk(legleft, runSpeed, runDegree * 1F, false, 0.5F, 0F, limbSwing, limbSwingAmount);
        } else {
            this.chainFlap(tailBoxes, walkSpeed, walkDegree * 1F, -1, limbSwing, limbSwingAmount);
            this.flap(body, walkSpeed, walkDegree * 0.3F, false, 0F, 0F, limbSwing, limbSwingAmount);
            this.flap(head, walkSpeed, -walkDegree * 0.3F, false, 0F, 0F, limbSwing, limbSwingAmount);
            this.flap(armleft, walkSpeed, -walkDegree * 0.1F, false, 0F, 0F, limbSwing, limbSwingAmount);
            this.flap(armright, walkSpeed, -walkDegree * 0.1F, false, 0F, 0F, limbSwing, limbSwingAmount);
            this.flap(legleft, walkSpeed, -walkDegree * 0.3F, false, 0F, 0F, limbSwing, limbSwingAmount);
            this.flap(legright, walkSpeed, -walkDegree * 0.3F, false, 0F, 0F, limbSwing, limbSwingAmount);
            this.walk(armright, walkSpeed, walkDegree * 0.5F, true, 0F, 0F, limbSwing, limbSwingAmount);
            this.bob(armright, walkSpeed, -walkDegree, false, limbSwing, limbSwingAmount);
            this.walk(armleft, walkSpeed, walkDegree * 0.5F, false, 0F, 0F, limbSwing, limbSwingAmount);
            this.bob(armleft, walkSpeed, -walkDegree, false, limbSwing, limbSwingAmount);
            this.walk(legright, walkSpeed, walkDegree * 0.8F, false, 0F, 0F, limbSwing, limbSwingAmount);
            this.bob(legright, walkSpeed, -walkDegree, false, limbSwing, limbSwingAmount);
            this.walk(legleft, walkSpeed, walkDegree * 0.8F, true, 0F, 0F, limbSwing, limbSwingAmount);
            this.bob(legleft, walkSpeed, -walkDegree, false, limbSwing, limbSwingAmount);
            this.bob(body, walkSpeed, walkDegree, false, limbSwing, limbSwingAmount);
        }
        progressRotationPrev(legleft, sitProgress, Maths.rad(-90), Maths.rad(-20), 0, 5F);
        progressRotationPrev(legright, sitProgress, Maths.rad(-90), Maths.rad(20), 0, 5F);
        progressRotationPrev(armleft, sitProgress, Maths.rad(-50), 0, 0, 5F);
        progressRotationPrev(armright, sitProgress, Maths.rad(-50), 0, 0, 5F);
        float tailAngle = entity.getId() % 2 == 0 ? 1 : -1;
        progressRotationPrev(tail, sitProgress, Maths.rad(20), Maths.rad(tailAngle * -15), Maths.rad(tailAngle * 15), 5F);
        progressRotationPrev(tail2, sitProgress, Maths.rad(20), Maths.rad(tailAngle * -30), Maths.rad(tailAngle * 30), 5F);
        progressPositionPrev(body, sitProgress, 0, 5F, 0, 5F);
        progressPositionPrev(tail, sitProgress, 0, 2F, 0, 5F);
        progressPositionPrev(tail2, sitProgress, tailAngle, 0, 0, 5F);
        progressPositionPrev(armright, sitProgress, 0, -1F, 4, 5F);
        progressPositionPrev(armleft, sitProgress, 0, -1F, 4, 5F);
        progressPositionPrev(legright, sitProgress, 0, 2.8F, -0.5F, 5F);
        progressPositionPrev(legleft, sitProgress, 0, 2.8F, -0.5F, 5F);
        if(leftSleep){
			progressRotationPrev(body, sleepProgress, 0, 0, Maths.rad(-90), 5F);
			progressRotationPrev(head, sleepProgress, 0, 0, Maths.rad(73), 5F);
			progressRotationPrev(tail, sleepProgress, 0, 0, Maths.rad(20), 5F);
			progressRotationPrev(tail2, sleepProgress, 0, 0, Maths.rad(-20), 5F);
			progressRotationPrev(armleft, sleepProgress, Maths.rad(-10), 0, Maths.rad(10), 5F);
			progressRotationPrev(armright, sleepProgress, Maths.rad(-20), 0, 0, 5F);
			progressRotationPrev(legright, sleepProgress, Maths.rad(-20), 0, 0, 5F);
			progressRotationPrev(legleft, sleepProgress, Maths.rad(10), 0, Maths.rad(20), 5F);
			progressPositionPrev(armleft, sleepProgress, 1F, -1F, 0, 5F);
			progressPositionPrev(armright, sleepProgress, 0.5F, -1, 1, 5F);
			progressPositionPrev(body, sleepProgress, 0, 9, 0, 5F);
			progressPositionPrev(head, sleepProgress, 0, 1, 0, 5F);
		}else{
			progressRotationPrev(body, sleepProgress, 0, 0, Maths.rad(90), 5F);
			progressRotationPrev(head, sleepProgress, 0, 0, Maths.rad(-73), 5F);
			progressRotationPrev(tail, sleepProgress, 0, 0, Maths.rad(-20), 5F);
			progressRotationPrev(tail2, sleepProgress, 0, 0, Maths.rad(20), 5F);
			progressRotationPrev(armright, sleepProgress, Maths.rad(-10), 0, Maths.rad(-10), 5F);
			progressRotationPrev(armleft, sleepProgress, Maths.rad(-20), 0, 0, 5F);
			progressRotationPrev(legleft, sleepProgress, Maths.rad(-20), 0, 0, 5F);
			progressRotationPrev(legright, sleepProgress, Maths.rad(10), 0, Maths.rad(-20), 5F);
			progressPositionPrev(armright, sleepProgress, -1, -1F, 0, 5F);
			progressPositionPrev(armleft, sleepProgress, -0.5F, -1, 1, 5F);
			progressPositionPrev(body, sleepProgress, 0, 9, 0, 5F);
			progressPositionPrev(head, sleepProgress, 0, 1, 0, 5F);
		}
        progressRotationPrev(body, holdProgress, Maths.rad(20), 0, 0, 5F);
        progressRotationPrev(tail, holdProgress, Maths.rad(10), 0, 0, 5F);
        progressRotationPrev(legleft, holdProgress, Maths.rad(-20), 0, 0, 5F);
        progressRotationPrev(legright, holdProgress, Maths.rad(-20), 0, 0, 5F);
        progressRotationPrev(armright, holdProgress, Maths.rad(-60), Maths.rad(-5), 0, 5F);
        progressRotationPrev(armleft, holdProgress, Maths.rad(-60), Maths.rad(5), 0, 5F);
        progressPositionPrev(body, holdProgress, 0, 3, 0, 5F);
        progressPositionPrev(head, holdProgress, 0, -1, 1, 5F);
        progressPositionPrev(armleft, holdProgress, 2, -2, -1, 5F);
        progressPositionPrev(armright, holdProgress, -2, -2, -1, 5F);
        this.flap(head, 0.85F, 0.3F, false, 0F, 0F, ageInTicks, holdProgress * 0.2F);
        this.flap(tail, 0.85F, 0.3F, false, 0F, 0F, ageInTicks, holdProgress * 0.2F);
        this.flap(tail2, 0.85F, 0.3F, false, 0F, 0F, ageInTicks, holdProgress * 0.2F);
        this.flap(earleft, 0.85F, 0.3F, false, -1, 0F, ageInTicks, holdProgress * 0.2F);
        this.flap(earright, 0.85F, 0.3F, false, -1, 0F, ageInTicks, holdProgress * 0.2F);
		if(sleepProgress == 0){
			this.faceTarget(netHeadYaw, headPitch, 1.2F, head);
		}
    }

    @Override
    public Iterable<BasicModelPart> parts() {
        return ImmutableList.of(root);
    }

    @Override
    public Iterable<AdvancedModelBox> getAllParts() {
        return ImmutableList.of(root, body, tail, tail2, head, snout, earleft, earright, armleft, armright, legleft, legright, body_geo, tail_geo, tail2_geo, head_geo, snout_geo, earleft_geo, earright_geo, armleft_geo, armright_geo, legleft_geo, legright_geo);
    }

public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        if (this.young) {
            float f = 1.5F;
            head.setScale(f, f, f);
            head.setShouldScaleChildren(true);
            matrixStackIn.pushPose();
            matrixStackIn.scale(0.5F, 0.5F, 0.5F);
            matrixStackIn.translate(0.0D, 1.5D, 0D);
            parts().forEach((p_228292_8_) -> {
                p_228292_8_.render(matrixStackIn, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            });
            matrixStackIn.popPose();
            head.setScale(1, 1, 1);
        } else {
            matrixStackIn.pushPose();
            parts().forEach((p_228290_8_) -> {
                p_228290_8_.render(matrixStackIn, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
