package io.github.sirlynx.vanillaextended.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class EmeraldArmourMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{11, 16, 15, 13};
    private static final int[] PROTECTION_VALUES = new int[]{3, 6, 8, 3};

    public EmeraldArmourMaterial() {
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 35;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return 13;
    }

    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_CHAIN;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }

    public String getName() {
        return "emerald";
    }

    public float getToughness() {
        return 1.5F;
    }

    public float getKnockbackResistance() {
        return 0.5F;
    }
}
