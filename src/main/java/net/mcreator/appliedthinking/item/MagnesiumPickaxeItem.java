
package net.mcreator.appliedthinking.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.appliedthinking.itemgroup.AppliedThinkingItemGroup;
import net.mcreator.appliedthinking.AppliedThinkingModElements;

@AppliedThinkingModElements.ModElement.Tag
public class MagnesiumPickaxeItem extends AppliedThinkingModElements.ModElement {
	@ObjectHolder("applied_thinking:magnesium_pickaxe")
	public static final Item block = null;
	public MagnesiumPickaxeItem(AppliedThinkingModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MagnesiumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(AppliedThinkingItemGroup.tab)) {
		}.setRegistryName("magnesium_pickaxe"));
	}
}
