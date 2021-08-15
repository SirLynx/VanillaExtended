package io.github.sirlynx.vanillaextended;

import io.github.sirlynx.vanillaextended.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class VanillaExtended implements ModInitializer {
    public static final String MOD_ID = "vanillaextended";

    public VanillaExtended() {
    }

    public void onInitialize() {
        ModItems.registerItems();
    }
}
