
package net.mcreator.mcfantastica.item;

@MCFantasticaElements.ModElement.Tag
public class MagicStickItem extends MCFantasticaElements.ModElement {

	@ObjectHolder("mcfantastica:magicstick")
	public static final Item block = null;

	public MagicStickItem(MCFantasticaElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(16));
			setRegistryName("magicstick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
