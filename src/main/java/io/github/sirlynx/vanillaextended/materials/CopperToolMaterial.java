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
