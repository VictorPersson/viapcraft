package com.viap.viapcraft.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {
    public SwordBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -1, -2.5f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
