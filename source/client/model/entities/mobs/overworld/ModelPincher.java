package net.tslat.aoa3.client.model.entities.mobs.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelPincher extends ModelBase {
	private ModelRenderer head;
	private ModelRenderer body;
	private ModelRenderer leg1;
	private ModelRenderer leg2;
	private ModelRenderer leg3;
	private ModelRenderer leg4;
	private ModelRenderer leg5;
	private ModelRenderer leg6;
	private ModelRenderer body2;
	private ModelRenderer body3;
	private ModelRenderer body4;
	private ModelRenderer body5;
	private ModelRenderer body6;
	private ModelRenderer body7;
	private ModelRenderer body8;
	private ModelRenderer body9;
	private ModelRenderer body10;
	private ModelRenderer body11;
	private ModelRenderer body12;
	private ModelRenderer body13;
	private ModelRenderer body14;
	private ModelRenderer body15;
	private ModelRenderer body16;
	private ModelRenderer body17;
	private ModelRenderer body18;
	private ModelRenderer body19;
	private ModelRenderer body20;
	private ModelRenderer body21;
	private ModelRenderer body22;
	private ModelRenderer body23;
	private ModelRenderer body24;
	private ModelRenderer body25;
	private ModelRenderer body26;
	private ModelRenderer body27;
	private ModelRenderer body28;
	private ModelRenderer head2;
	private ModelRenderer head3;
	private ModelRenderer body29;
	private ModelRenderer body30;
	private ModelRenderer body31;
	private ModelRenderer body32;

	public ModelPincher() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(2.0f, 0.0f, -6.0f, 1, 2, 1);
		head.setRotationPoint(0.0f, 16.0f, -1.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 12, 59)).addBox(-4.0f, -3.5f, 14.0f, 1, 1, 1);
		body.setRotationPoint(0.0f, 22.0f, 10.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2);
		leg1.setRotationPoint(-7.0f, 19.0f, 16.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2);
		leg2.setRotationPoint(7.0f, 19.0f, 16.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2);
		leg3.setRotationPoint(-7.0f, 19.0f, 10.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2);
		leg4.setRotationPoint(7.0f, 19.0f, 10.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(leg5 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 2, 5, 2);
		leg5.setRotationPoint(-7.0f, 19.0f, 4.0f);
		leg5.setTextureSize(64, 64);
		leg5.mirror = true;
		setRotation(leg5, 0.0f, 0.0f, 0.0f);
		(leg6 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 2, 5, 2);
		leg6.setRotationPoint(7.0f, 19.0f, 4.0f);
		leg6.setTextureSize(64, 64);
		leg6.mirror = true;
		setRotation(leg6, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 41, 51)).addBox(11.0f, -6.0f, -8.0f, 4, 1, 6);
		body2.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 3, 54)).addBox(2.0f, -2.0f, 18.0f, 1, 3, 2);
		body3.setRotationPoint(0.0f, 22.0f, 10.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 12, 59)).addBox(3.0f, -3.5f, 14.0f, 1, 1, 1);
		body4.setRotationPoint(0.0f, 22.0f, 10.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 29, 52)).addBox(2.0f, -3.5f, 7.0f, 1, 1, 8);
		body5.setRotationPoint(0.0f, 22.0f, 10.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 29, 52)).addBox(-3.0f, -3.5f, 7.0f, 1, 1, 8);
		body6.setRotationPoint(0.0f, 22.0f, 10.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 12, 61)).addBox(-5.0f, -3.5f, 8.0f, 2, 1, 1);
		body7.setRotationPoint(0.0f, 22.0f, 10.0f);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 12, 61)).addBox(3.0f, -3.5f, 8.0f, 2, 1, 1);
		body8.setRotationPoint(0.0f, 22.0f, 10.0f);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 12, 61)).addBox(-5.0f, -3.5f, 10.0f, 2, 1, 1);
		body9.setRotationPoint(0.0f, 22.0f, 10.0f);
		body9.setTextureSize(64, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 12, 61)).addBox(3.0f, -3.5f, 10.0f, 2, 1, 1);
		body10.setRotationPoint(0.0f, 22.0f, 10.0f);
		body10.setTextureSize(64, 64);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(body11 = new ModelRenderer(this, 12, 59)).addBox(-4.0f, -3.5f, 12.0f, 1, 1, 1);
		body11.setRotationPoint(0.0f, 22.0f, 10.0f);
		body11.setTextureSize(64, 64);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, 0.0f);
		(body12 = new ModelRenderer(this, 12, 59)).addBox(3.0f, -3.5f, 12.0f, 1, 1, 1);
		body12.setRotationPoint(0.0f, 22.0f, 10.0f);
		body12.setTextureSize(64, 64);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, 0.0f);
		(body13 = new ModelRenderer(this, 12, 48)).addBox(-2.0f, -4.0f, 7.0f, 4, 2, 8);
		body13.setRotationPoint(0.0f, 22.0f, 10.0f);
		body13.setTextureSize(64, 64);
		body13.mirror = true;
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 2, 34)).addBox(-2.0f, -4.0f, 15.0f, 4, 1, 5);
		body14.setRotationPoint(0.0f, 22.0f, 10.0f);
		body14.setTextureSize(64, 64);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, 0.0f);
		(body15 = new ModelRenderer(this, 3, 54)).addBox(-3.0f, -2.0f, 18.0f, 1, 3, 2);
		body15.setRotationPoint(0.0f, 22.0f, 10.0f);
		body15.setTextureSize(64, 64);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, 0.0f);
		(body16 = new ModelRenderer(this, 1, 44)).addBox(2.0f, -7.0f, 17.0f, 1, 5, 3);
		body16.setRotationPoint(0.0f, 22.0f, 10.0f);
		body16.setTextureSize(64, 64);
		body16.mirror = true;
		setRotation(body16, 0.0f, 0.0f, 0.0f);
		(body17 = new ModelRenderer(this, 1, 44)).addBox(-3.0f, -7.0f, 17.0f, 1, 5, 3);
		body17.setRotationPoint(0.0f, 22.0f, 10.0f);
		body17.setTextureSize(64, 64);
		body17.mirror = true;
		setRotation(body17, 0.0f, 0.0f, 0.0f);
		(body18 = new ModelRenderer(this, 12, 27)).addBox(-6.0f, -6.0f, -7.0f, 12, 6, 14);
		body18.setRotationPoint(0.0f, 22.0f, 10.0f);
		body18.setTextureSize(64, 64);
		body18.mirror = true;
		setRotation(body18, 0.0f, 0.0f, 0.0f);
		(body19 = new ModelRenderer(this, 8, 14)).addBox(-6.0f, -6.0f, -7.0f, 16, 5, 6);
		body19.setRotationPoint(-2.0f, 19.0f, 6.0f);
		body19.setTextureSize(64, 64);
		body19.mirror = true;
		setRotation(body19, 0.0f, 0.0f, 0.0f);
		(body20 = new ModelRenderer(this, 41, 51)).addBox(-7.0f, -6.0f, -8.0f, 4, 1, 6);
		body20.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body20.setTextureSize(64, 64);
		body20.mirror = true;
		setRotation(body20, 0.0f, 0.0f, 0.0f);
		(body21 = new ModelRenderer(this, 29, 2)).addBox(12.0f, -1.0f, -7.0f, 2, 2, 8);
		body21.setRotationPoint(-4.0f, 17.0f, 3.0f);
		body21.setTextureSize(64, 64);
		body21.mirror = true;
		setRotation(body21, 0.0f, 0.0f, 0.0f);
		(body22 = new ModelRenderer(this, 29, 2)).addBox(-6.0f, -1.0f, -7.0f, 2, 2, 8);
		body22.setRotationPoint(-4.0f, 17.0f, 3.0f);
		body22.setTextureSize(64, 64);
		body22.mirror = true;
		setRotation(body22, 0.0f, 0.0f, 0.0f);
		(body23 = new ModelRenderer(this, 48, 12)).addBox(11.0f, -2.0f, -10.0f, 4, 4, 4);
		body23.setRotationPoint(-4.0f, 17.0f, 3.0f);
		body23.setTextureSize(64, 64);
		body23.mirror = true;
		setRotation(body23, 0.0f, 0.0f, 0.0f);
		(body24 = new ModelRenderer(this, 48, 12)).addBox(-7.0f, -2.0f, -10.0f, 4, 4, 4);
		body24.setRotationPoint(-4.0f, 17.0f, 3.0f);
		body24.setTextureSize(64, 64);
		body24.mirror = true;
		setRotation(body24, 0.0f, 0.0f, 0.0f);
		(body25 = new ModelRenderer(this, 51, 25)).addBox(15.0f, -3.0f, -10.0f, 0, 1, 6);
		body25.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body25.setTextureSize(64, 64);
		body25.mirror = true;
		setRotation(body25, 0.0f, 0.0f, 0.0f);
		(body26 = new ModelRenderer(this, 51, 25)).addBox(-3.0f, -3.0f, -10.0f, 0, 1, 6);
		body26.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body26.setTextureSize(64, 64);
		body26.mirror = true;
		setRotation(body26, 0.0f, 0.0f, 0.0f);
		(body27 = new ModelRenderer(this, 1, 25)).addBox(11.0f, -5.0f, -10.0f, 4, 2, 6);
		body27.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body27.setTextureSize(64, 64);
		body27.mirror = true;
		setRotation(body27, 0.0f, 0.0f, 0.0f);
		(body28 = new ModelRenderer(this, 1, 25)).addBox(-7.0f, -5.0f, -10.0f, 4, 2, 6);
		body28.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body28.setTextureSize(64, 64);
		body28.mirror = true;
		setRotation(body28, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -6.0f, 8, 4, 6);
		head2.setRotationPoint(0.0f, 16.0f, -1.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, 0.0f, -6.0f, 1, 2, 1);
		head3.setRotationPoint(0.0f, 16.0f, -1.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(body29 = new ModelRenderer(this, 43, 1)).addBox(-7.0f, -2.0f, -10.0f, 4, 1, 6);
		body29.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body29.setTextureSize(64, 64);
		body29.mirror = true;
		setRotation(body29, 0.0f, 0.0f, 0.0f);
		(body30 = new ModelRenderer(this, 43, 1)).addBox(11.0f, -2.0f, -10.0f, 4, 1, 6);
		body30.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body30.setTextureSize(64, 64);
		body30.mirror = true;
		setRotation(body30, 0.0f, 0.0f, 0.0f);
		(body31 = new ModelRenderer(this, 51, 25)).addBox(-7.0f, -3.0f, -10.0f, 0, 1, 6);
		body31.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body31.setTextureSize(64, 64);
		body31.mirror = true;
		setRotation(body31, 0.0f, 0.0f, 0.0f);
		(body32 = new ModelRenderer(this, 51, 25)).addBox(11.0f, -3.0f, -10.0f, 0, 1, 6);
		body32.setRotationPoint(-4.0f, 20.0f, -3.0f);
		body32.setTextureSize(64, 64);
		body32.mirror = true;
		setRotation(body32, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		leg5.render(par7);
		leg6.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
		body10.render(par7);
		body11.render(par7);
		body12.render(par7);
		body13.render(par7);
		body14.render(par7);
		body15.render(par7);
		body16.render(par7);
		body17.render(par7);
		body18.render(par7);
		body19.render(par7);
		body20.render(par7);
		body21.render(par7);
		body22.render(par7);
		body23.render(par7);
		body24.render(par7);
		body25.render(par7);
		body26.render(par7);
		body27.render(par7);
		body28.render(par7);
		head2.render(par7);
		head3.render(par7);
		body29.render(par7);
		body30.render(par7);
		body31.render(par7);
		body32.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg5.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg5.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg6.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
