package net.mcreator.garncarmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.garncarmod.network.GarnCarModModVariables;

public class CarOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.REDSTONE_BLOCK) {
			GarnCarModModVariables.MapVariables.get(world).carsavepointX = entity.getX();
			GarnCarModModVariables.MapVariables.get(world).syncData(world);
			GarnCarModModVariables.MapVariables.get(world).carsavepointY = entity.getY();
			GarnCarModModVariables.MapVariables.get(world).syncData(world);
			GarnCarModModVariables.MapVariables.get(world).carsavepointZ = entity.getZ();
			GarnCarModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
