
package net.mcreator.appliedthinking.item;

@AppliedThinkingModElements.ModElement.Tag
public class SearedBrickItem extends AppliedThinkingModElements.ModElement {

	@ObjectHolder("applied_thinking:seared_brick")
	public static final Item block = null;

	public SearedBrickItem(AppliedThinkingModElements instance) {
		super(instance, 263);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("seared_brick");
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
