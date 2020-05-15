
package net.mcreator.mcfantastica.block;

@MCFantasticaElements.ModElement.Tag
public class BlackSandBlock extends MCFantasticaElements.ModElement {

	@ObjectHolder("mcfantastica:blacksand")
	public static final Block block = null;

	public BlackSandBlock(MCFantasticaElements instance) {
		super(instance, 76);

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

					Block.Properties.create(Material.SAND).sound(SoundType.SAND).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("blacksand");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
