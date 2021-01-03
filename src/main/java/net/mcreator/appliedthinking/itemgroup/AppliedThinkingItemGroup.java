
package net.mcreator.appliedthinking.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.appliedthinking.item.TesseractItemItem;
import net.mcreator.appliedthinking.AppliedThinkingModElements;

@AppliedThinkingModElements.ModElement.Tag
public class AppliedThinkingItemGroup extends AppliedThinkingModElements.ModElement {
	public AppliedThinkingItemGroup(AppliedThinkingModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabapplied_thinking") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TesseractItemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
