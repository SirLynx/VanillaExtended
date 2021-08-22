
//    Copyright (C) 2021  SirLynx
//
//            This program is free software: you can redistribute it and/or modify
//            it under the terms of the GNU Affero General Public License as
//            published by the Free Software Foundation, either version 3 of the
//            License, or (at your option) any later version.
//
//            This program is distributed in the hope that it will be useful,
//            but WITHOUT ANY WARRANTY; without even the implied warranty of
//            MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//            GNU Affero General Public License for more details.
//
//            You should have received a copy of the GNU Affero General Public License
//            along with this program.  If not, see <https://www.gnu.org/licenses/>.

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
