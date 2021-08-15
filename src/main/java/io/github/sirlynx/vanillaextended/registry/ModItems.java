
package io.github.sirlynx.vanillaextended.registry;

import io.github.sirlynx.vanillaextended.items.CopperAxe;
import io.github.sirlynx.vanillaextended.items.CopperHoe;
import io.github.sirlynx.vanillaextended.items.CopperPickaxe;
import io.github.sirlynx.vanillaextended.items.EmeraldAxe;
import io.github.sirlynx.vanillaextended.items.EmeraldHoe;
import io.github.sirlynx.vanillaextended.items.EmeraldPickaxe;
import io.github.sirlynx.vanillaextended.materials.CopperArmourMaterial;
import io.github.sirlynx.vanillaextended.materials.CopperToolMaterial;
import io.github.sirlynx.vanillaextended.materials.EmeraldArmourMaterial;
import io.github.sirlynx.vanillaextended.materials.EmeraldToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static ToolItem COPPER_SWORD;
    public static ToolItem COPPER_PICKAXE;
    public static ToolItem COPPER_AXE;
    public static ToolItem COPPER_HOE;
    public static ToolItem COPPER_SHOVEL;

    public static ToolItem EMERALD_SWORD;
    public static ToolItem EMERALD_PICKAXE;
    public static ToolItem EMERALD_AXE;
    public static ToolItem EMERALD_HOE;
    public static ToolItem EMERALD_SHOVEL;

    public static final ArmorMaterial CopperArmourMaterial;
    public static final Item copper_armour_helmet;
    public static final Item copper_armour_chestplate;
    public static final Item copper_armour_leggings;
    public static final Item copper_armour_boots;

    public static final ArmorMaterial EmeraldArmourMaterial;
    public static final Item emerald_armour_helmet;
    public static final Item emerald_armour_chestplate;
    public static final Item emerald_armour_leggings;
    public static final Item emerald_armour_boots;

    public static final Item COPPER_NUGGET;

    public ModItems() {
    }

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_nugget"), COPPER_NUGGET);

        // Copper Tools
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_hoe"), COPPER_HOE);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_shovel"), COPPER_SHOVEL);

        // Emerald Tools
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_sword"), EMERALD_SWORD);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_pickaxe"), EMERALD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_axe"), EMERALD_AXE);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_hoe"), EMERALD_HOE);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_shovel"), EMERALD_SHOVEL);

        // Copper Armour
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_armour_helmet"), copper_armour_helmet);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_armour_chestplate"), copper_armour_chestplate);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_armour_leggings"), copper_armour_leggings);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "copper_armour_boots"), copper_armour_boots);

        // Emerald Armour
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_armour_helmet"), emerald_armour_helmet);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_armour_chestplate"), emerald_armour_chestplate);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_armour_leggings"), emerald_armour_leggings);
        Registry.register(Registry.ITEM, new Identifier("vanillaextended", "emerald_armour_boots"), emerald_armour_boots);
    }

    static {
        // Copper Tools
        COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 2, -2.2F, (new Settings()).group(ItemGroup.COMBAT));
        COPPER_PICKAXE = new CopperPickaxe(CopperToolMaterial.INSTANCE, 2, -2.8F, (new Settings()).group(ItemGroup.TOOLS));
        COPPER_AXE = new CopperAxe(CopperToolMaterial.INSTANCE, 6, -3.2F, (new Settings()).group(ItemGroup.TOOLS));
        COPPER_HOE = new CopperHoe(CopperToolMaterial.INSTANCE, -1, -1.2F, (new Settings()).group(ItemGroup.TOOLS));
        COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 1.0F, -2.9F, (new Settings()).group(ItemGroup.TOOLS));

        // Emerald Tools
        EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 6, -2.4F, (new Settings()).group(ItemGroup.COMBAT));
        EMERALD_PICKAXE = new EmeraldPickaxe(EmeraldToolMaterial.INSTANCE, 4, -2.8F, (new Settings()).group(ItemGroup.TOOLS));
        EMERALD_AXE = new EmeraldAxe(EmeraldToolMaterial.INSTANCE, 8, -3.0F, (new Settings()).group(ItemGroup.TOOLS));
        EMERALD_HOE = new EmeraldHoe(EmeraldToolMaterial.INSTANCE, -1, -0.0F, (new Settings()).group(ItemGroup.TOOLS));
        EMERALD_SHOVEL = new ShovelItem(EmeraldToolMaterial.INSTANCE, 4.0F, -3.0F, (new Settings()).group(ItemGroup.TOOLS));

        // Copper Armour
        CopperArmourMaterial = new CopperArmourMaterial();
        copper_armour_helmet = new ArmorItem(CopperArmourMaterial, EquipmentSlot.HEAD, (new Settings()).group(ItemGroup.COMBAT));
        copper_armour_chestplate = new ArmorItem(CopperArmourMaterial, EquipmentSlot.CHEST, (new Settings()).group(ItemGroup.COMBAT));
        copper_armour_leggings = new ArmorItem(CopperArmourMaterial, EquipmentSlot.LEGS, (new Settings()).group(ItemGroup.COMBAT));
        copper_armour_boots = new ArmorItem(CopperArmourMaterial, EquipmentSlot.FEET, (new Settings()).group(ItemGroup.COMBAT));

        // Emerald Armour
        EmeraldArmourMaterial = new EmeraldArmourMaterial();
        emerald_armour_helmet = new ArmorItem(EmeraldArmourMaterial, EquipmentSlot.HEAD, (new Settings()).group(ItemGroup.COMBAT));
        emerald_armour_chestplate = new ArmorItem(EmeraldArmourMaterial, EquipmentSlot.CHEST, (new Settings()).group(ItemGroup.COMBAT));
        emerald_armour_leggings = new ArmorItem(EmeraldArmourMaterial, EquipmentSlot.LEGS, (new Settings()).group(ItemGroup.COMBAT));
        emerald_armour_boots = new ArmorItem(EmeraldArmourMaterial, EquipmentSlot.FEET, (new Settings()).group(ItemGroup.COMBAT));

        // Test copper ingot.
        COPPER_NUGGET = new Item((new Settings()).group(ItemGroup.MATERIALS));
    }
}
