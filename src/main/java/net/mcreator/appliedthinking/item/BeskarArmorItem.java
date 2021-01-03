
package net.mcreator.appliedthinking.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.appliedthinking.itemgroup.AppliedThinkingItemGroup;
import net.mcreator.appliedthinking.AppliedThinkingModElements;

@AppliedThinkingModElements.ModElement.Tag
public class BeskarArmorItem extends AppliedThinkingModElements.ModElement {
	@ObjectHolder("applied_thinking:beskar_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("applied_thinking:beskar_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("applied_thinking:beskar_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("applied_thinking:beskar_armor_boots")
	public static final Item boots = null;
	public BeskarArmorItem(AppliedThinkingModElements instance) {
		super(instance, 165);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 99;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{6, 9, 10, 6}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 35;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BeskarIngotItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "beskar_armor";
			}

			public float getToughness() {
				return 5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(AppliedThinkingItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "applied_thinking:textures/models/armor/beskar_a_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("beskar_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(AppliedThinkingItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "applied_thinking:textures/models/armor/beskar_a_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("beskar_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(AppliedThinkingItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "applied_thinking:textures/models/armor/beskar_a_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("beskar_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(AppliedThinkingItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "applied_thinking:textures/models/armor/beskar_a_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("beskar_armor_boots"));
	}
}
