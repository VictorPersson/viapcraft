package com.viap.viapcraft.tools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {
    public HoeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -1, -2.5f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}