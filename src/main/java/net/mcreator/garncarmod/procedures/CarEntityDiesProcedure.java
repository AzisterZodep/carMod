package net.mcreator.garncarmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.garncarmod.network.GarnCarModModVariables;
import net.mcreator.garncarmod.init.GarnCarModModEntities;

public class CarEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = GarnCarModModEntities.CAR.get().spawn(_level,
					BlockPos.containing(GarnCarModModVariables.MapVariables.get(world).carsavepointX, GarnCarModModVariables.MapVariables.get(world).carsavepointY, GarnCarModModVariables.MapVariables.get(world).carsavepointZ),
					MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
	}
}
