package net.mcreator.mcfantastica.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.mcfantastica.MCFantasticaElements;

@MCFantasticaElements.ModElement.Tag
public class PetrifiedSkeletonOnInitialEntitySpawnProcedure extends MCFantasticaElements.ModElement {
	public PetrifiedSkeletonOnInitialEntitySpawnProcedure(MCFantasticaElements instance) {
		super(instance, 60);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PetrifiedSkeletonOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PetrifiedSkeletonOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PetrifiedSkeletonOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PetrifiedSkeletonOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PetrifiedSkeletonOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.canBlockSeeSky(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
			if (((world.isDaytime()) && (!((world.isRaining()) || (world.isThundering()))))) {
				if ((!(((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BUBBLE_COLUMN.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) z))).getBlock() == Blocks.BUBBLE_COLUMN.getDefaultState()
								.getBlock()))
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.WATER.getDefaultState()
								.getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) z))).getBlock() == Blocks.WATER.getDefaultState()
										.getBlock())))
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.WATER.getDefaultState()
								.getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) z))).getBlock() == Blocks.WATER.getDefaultState()
										.getBlock()))))) {
					if ((!(entity.isBurning()))) {
						if ((!(world.isRemote))) {
							entity.setFire((int) 100);
						}
					}
				}
			}
		}
	}
}
