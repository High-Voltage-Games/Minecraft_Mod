
package net.mcreator.appliedthinking.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.appliedthinking.itemgroup.AppliedThinkingItemGroup;
import net.mcreator.appliedthinking.AppliedThinkingModElements;

@AppliedThinkingModElements.ModElement.Tag
public class LithiumSwordItem extends AppliedThinkingModElements.ModElement {
	@ObjectHolder("applied_thinking:lithium_sword")
	public static final Item block = null;
	public LithiumSwordItem(AppliedThinkingModElements instance) {
		super(instance, 127);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 183;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 11;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LithiumIngotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(AppliedThinkingItemGroup.tab)) {
		}.setRegistryName("lithium_sword"));
	}
}
