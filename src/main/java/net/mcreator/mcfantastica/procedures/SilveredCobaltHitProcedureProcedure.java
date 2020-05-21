package net.mcreator.mcfantastica.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.mcfantastica.MCFantasticaElements;

@MCFantasticaElements.ModElement.Tag
public class SilveredCobaltHitProcedureProcedure extends MCFantasticaElements.ModElement {
	public SilveredCobaltHitProcedureProcedure(MCFantasticaElements instance) {
		super(instance, 74);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SilveredCobaltHitProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SilveredCobaltHitProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SilveredCobaltHitProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SilveredCobaltHitProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SilveredCobaltHitProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 50, (int) 2));
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) z), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.VOID_AIR.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
						.getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.VOID_AIR
								.getDefaultState().getBlock()))
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR
								.getDefaultState().getBlock()))))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.VOID_AIR.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
						.getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.VOID_AIR
								.getDefaultState().getBlock()))
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR
								.getDefaultState().getBlock()))))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.VOID_AIR.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
						.getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.VOID_AIR
								.getDefaultState().getBlock()))
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR
								.getDefaultState().getBlock()))))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.VOID_AIR.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
						.getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.VOID_AIR
								.getDefaultState().getBlock()))
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR
								.getDefaultState().getBlock()))))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), Blocks.SNOW.getDefaultState(), 3);
		}
		if ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState().getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState().getBlock()))
				&& (!((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR.getDefaultState()
								.getBlock()))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SNOW.getDefaultState(), 3);
		}
	}
}
