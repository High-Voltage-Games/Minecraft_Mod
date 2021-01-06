
package net.mcreator.appliedthinking.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.appliedthinking.itemgroup.AppliedThinkingItemGroup;
import net.mcreator.appliedthinking.AppliedThinkingModElements;

import java.util.List;
import java.util.Collections;

@AppliedThinkingModElements.ModElement.Tag
public class BlueConcreteStairsBlock extends AppliedThinkingModElements.ModElement {
	@ObjectHolder("applied_thinking:blue_concrete_stairs")
	public static final Block block = null;
	public BlueConcreteStairsBlock(AppliedThinkingModElements instance) {
		super(instance, 202);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AppliedThinkingItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1f, 10f)).getDefaultState(),
					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("blue_concrete_stairs");
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
