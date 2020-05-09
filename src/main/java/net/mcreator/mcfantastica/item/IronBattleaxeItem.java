
package net.mcreator.mcfantastica.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.mcfantastica.MCFantasticaElements;

@MCFantasticaElements.ModElement.Tag
public class IronBattleaxeItem extends MCFantasticaElements.ModElement {
	@ObjectHolder("mcfantastica:ironbattleaxe")
	public static final Item block = null;
	public IronBattleaxeItem(MCFantasticaElements instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.COMBAT).maxDamage(5));
			setRegistryName("ironbattleaxe");
		}

		@Override
		public int getItemEnchantability() {
			return 17;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 255;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1.5F;
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return true;
		}
	}
}
