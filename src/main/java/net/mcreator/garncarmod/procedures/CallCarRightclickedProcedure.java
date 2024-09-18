package net.mcreator.garncarmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CallCarRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y + 10, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("garn_car_mod:callcar")), SoundSource.NEUTRAL, (float) 0.1, 1);
			} else {
				_level.playLocalSound(x, (y + 10), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("garn_car_mod:callcar")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
			}
		}
	}
}
