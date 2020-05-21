
package net.mcreator.mcfantastica.item;

@MCFantasticaElements.ModElement.Tag
public class BloodWoodStickItem extends MCFantasticaElements.ModElement {

	@ObjectHolder("mcfantastica:bloodwoodstick")
	public static final Item block = null;

	public BloodWoodStickItem(MCFantasticaElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("bloodwoodstick");
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
