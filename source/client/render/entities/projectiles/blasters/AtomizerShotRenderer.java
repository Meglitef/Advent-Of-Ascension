package net.tslat.aoa3.client.render.entities.projectiles.blasters;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.client.fx.FXFluffyTrail;
import net.tslat.aoa3.entity.projectiles.blaster.EntityAtomizerShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class AtomizerShotRenderer extends Render<EntityAtomizerShot> {
	private final ResourceLocation texture;

	public AtomizerShotRenderer(final RenderManager manager, final ResourceLocation textureResource) {
		super(manager);
		texture = textureResource;
	}

	@Override
	public void doRender(EntityAtomizerShot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		for (int i = 0; i < 3; i++) {
			new FXFluffyTrail(entity.world, entity.posX, entity.posY, entity.posZ, 0, 0, 0, Enums.RGBIntegers.BLUE, 8, 1).create();
		}
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityAtomizerShot entity) {
		return texture;
	}
}
