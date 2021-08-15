package io.github.sirlynx.vanillaextended.materials;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial {
    public static final ToolMaterial INSTANCE = new EmeraldToolMaterial();

    public EmeraldToolMaterial() {
    }

    public int getDurability() {
        return 1800;
    }

    public float getMiningSpeedMultiplier() {
        return 8.5F;
    }

    public float getAttackDamage() {
        return 1.0F;
    }

    public int getMiningLevel() {
        return 4;
    }

    public int getEnchantability() {
        return 14;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }
}
