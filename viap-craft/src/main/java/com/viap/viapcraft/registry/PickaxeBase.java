package com.viap.viapcraft.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial toolMaterial_1) {
        // toolMaterial_1 maybe should be material
        // Change in attack damage: -1 = no change. 0 = add 1 AD, etc.
        // Attack speed, always negative, closer to 0 = faster etc.
        super(toolMaterial_1, -1,  -2.2f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
