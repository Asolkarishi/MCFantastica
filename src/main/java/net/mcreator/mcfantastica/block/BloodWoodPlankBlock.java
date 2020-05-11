
package net.mcreator.mcfantastica.block;

@MCFantasticaElements.ModElement.Tag
public class BloodWoodPlankBlock extends MCFantasticaElements.ModElement {

	@ObjectHolder("mcfantastica:bloodwoodplank")
	public static final Block block = null;

	public BloodWoodPlankBlock(MCFantasticaElements instance) {
		super(instance, 65);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1f, 10f).lightValue(0).harvestLevel(2)
							.harvestTool(ToolType.AXE));

			setRegistryName("bloodwoodplank");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {

			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;

					if (dimensionType == DimensionType.OVERWORLD)
						dimensionCriteria = true;

					if (!dimensionCriteria)
						return false;

					return super.place(world, generator, rand, pos, config);
				}
			}, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bloodwoodplank", "bloodwoodplank", blockAt -> {
				boolean blockCriteria = false;
				return blockCriteria;
			}), block.getDefaultState(), 1), Placement.COUNT_RANGE, new CountRangeConfig(1, 0, 0, 0)));
		}
	}

}
