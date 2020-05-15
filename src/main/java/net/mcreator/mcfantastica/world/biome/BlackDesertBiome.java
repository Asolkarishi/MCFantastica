
package net.mcreator.mcfantastica.world.biome;

@MCFantasticaElements.ModElement.Tag
public class BlackDesertBiome extends MCFantasticaElements.ModElement {

	@ObjectHolder("mcfantastica:blackdesert")
	public static final CustomBiome biome = null;

	public BlackDesertBiome(MCFantasticaElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 2));
	}

	static class CustomBiome extends Biome {

		public CustomBiome() {
			super(new Biome.Builder().downfall(0.5f).depth(0.1f).scale(0.2f).temperature(0.5f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.DESERT).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlackSandBlock.block.getDefaultState(),
							BlackSandBlock.block.getDefaultState(), BlackSandBlock.block.getDefaultState())));

			setRegistryName("blackdesert");

			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);

			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.DEAD_BUSH,
					IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(3)));

			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.CACTUS, IFeatureConfig.NO_FEATURE_CONFIG,
					Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(4)));

		}

	}

}
