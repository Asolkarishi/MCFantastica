
package net.mcreator.mcfantastica.item;

@MCFantasticaElements.ModElement.Tag
public class IronBattleAxeToolItem extends MCFantasticaElements.ModElement {

	@ObjectHolder("mcfantastica:ironbattleaxetool")
	public static final Item block = null;

	public IronBattleAxeToolItem(MCFantasticaElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 305;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT, (int) (1)));
			}
		}, 3, -3.4f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("ironbattleaxetool"));
	}

}
