
package net.mcreator.appliedthinking.block;

import net.minecraft.block.material.Material;

@AppliedThinkingModElements.ModElement.Tag
public class GroutBlock extends AppliedThinkingModElements.ModElement {

	@ObjectHolder("applied_thinking:grout")
	public static final Block block = null;

	public GroutBlock(AppliedThinkingModElements instance) {
		super(instance, 261);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AppliedThinkingItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.SAND).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("grout");
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
