
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.garncarmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.garncarmod.GarnCarModMod;

public class GarnCarModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GarnCarModMod.MODID);
	public static final RegistryObject<SoundEvent> CARNORMAL = REGISTRY.register("carnormal", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("garn_car_mod", "carnormal")));
	public static final RegistryObject<SoundEvent> CARDEAD = REGISTRY.register("cardead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("garn_car_mod", "cardead")));
	public static final RegistryObject<SoundEvent> CALLCAR = REGISTRY.register("callcar", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("garn_car_mod", "callcar")));
}
