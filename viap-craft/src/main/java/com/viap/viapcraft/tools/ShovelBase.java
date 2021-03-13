package com.viap.viapcraft.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {
    public ShovelBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -1, -2.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
