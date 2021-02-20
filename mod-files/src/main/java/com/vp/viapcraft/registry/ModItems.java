package com.vp.viapcraft.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import java.rmi.registry.Registry;

public class ModItems {
    public static final Item DARK_RUBY = new Item(new Item.settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, path: "dark_ruby"), DARK_RUBY);
    }
}
