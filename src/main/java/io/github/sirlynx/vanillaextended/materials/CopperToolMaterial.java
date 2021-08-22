
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

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {
    public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();

    public CopperToolMaterial() {
    }

    public int getDurability() {
        return 180;
    }

    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    public float getAttackDamage() {
        return 2.0F;
    }

    public int getMiningLevel() {
        return 2;
    }

    public int getEnchantability() {
        return 15;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }
}
