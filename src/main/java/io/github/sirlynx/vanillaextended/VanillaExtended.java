
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
