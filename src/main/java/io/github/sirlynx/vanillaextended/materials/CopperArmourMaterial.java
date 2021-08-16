package io.github.sirlynx.vanillaextended.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CopperArmourMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{1, 4, 4, 1};

    public CopperArmourMaterial() {
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 12;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return 11;
    }

    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }

    public String getName() {
        return "copper";
    }

    public float getToughness() {
        return 0.0F;
    }

    public float getKnockbackResistance() {
        return 0.0F;
    }
}
