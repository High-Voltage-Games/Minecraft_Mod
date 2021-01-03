
package net.mcreator.appliedthinking.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.appliedthinking.itemgroup.AppliedThinkingItemGroup;
import net.mcreator.appliedthinking.AppliedThinkingModElements;

@AppliedThinkingModElements.ModElement.Tag
public class NetherIteAxeItem extends AppliedThinkingModElements.ModElement {
	@ObjectHolder("applied_thinking:netherite_axe")
	public static final Item block = null;
	public NetherIteAxeItem(AppliedThinkingModElements instance) {
		super(instance, 235);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NetheriteIngotItem.block, (int) (1)));
			}
		}, 1, -3.3f, new Item.Properties().group(AppliedThinkingItemGroup.tab)) {
		}.setRegistryName("netherite_axe"));
	}
}
