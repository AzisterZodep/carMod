
package net.mcreator.garncarmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.garncarmod.entity.CarEntity;
import net.mcreator.garncarmod.client.model.Modelcargarn47;

public class CarRenderer extends MobRenderer<CarEntity, Modelcargarn47<CarEntity>> {
	public CarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcargarn47(context.bakeLayer(Modelcargarn47.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(CarEntity entity) {
		return new ResourceLocation("garn_car_mod:textures/entities/car.png");
	}
}
