
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.garncarmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.garncarmod.item.CallCarItem;
import net.mcreator.garncarmod.GarnCarModMod;

public class GarnCarModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GarnCarModMod.MODID);
	public static final RegistryObject<Item> CAR_SPAWN_EGG = REGISTRY.register("car_spawn_egg", () -> new ForgeSpawnEggItem(GarnCarModModEntities.CAR, -26266, -13159, new Item.Properties()));
	public static final RegistryObject<Item> CALL_CAR = REGISTRY.register("call_car", () -> new CallCarItem());
	// Start of user code block custom items
	// End of user code block custom items
}
