package net.viap.viapcraft.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.viap.viapcraft.Viapcraft;

public class MainItemGroup {
    public static final ItemGroup VIAPCRAFT_MAIN_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(Viapcraft.MOD_ID, "viapcraft_main_item_group"), () -> new ItemStack(ModItems.LSD));
}
