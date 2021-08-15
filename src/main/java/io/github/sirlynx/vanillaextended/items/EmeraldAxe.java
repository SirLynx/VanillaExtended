package io.github.sirlynx.vanillaextended.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item.Settings;

public class EmeraldAxe extends AxeItem {
    public EmeraldAxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, (float)attackDamage, attackSpeed, settings);
    }
}
