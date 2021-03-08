package com.viap.viapcraft;

import com.viap.viapcraft.registry.ModBlocks;
import com.viap.viapcraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Viapcraft implements ModInitializer {

    public static final String MOD_ID = "viapcraft";

    // "Simple" way of making a item group for your mod. Can be made more advanced.
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            // Setting the path to the new tab, where it gets its name. Below, which icon tab should have
            new Identifier(MOD_ID, "general_item_group_name"),
            () -> new ItemStack(ModItems.DARK_RUBY)
    );

    // More advanced way of making an item group, custom icon vanilla/mod items.
    public static final ItemGroup ADVANCED_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "advanced_item_group_name"))
            .icon(() -> new ItemStack(Blocks.ENCHANTING_TABLE))
            .appendItems(stacks -> {
                // This way items will come in the order you list them.
                stacks.add(new ItemStack(ModItems.DARK_RUBY));
                stacks.add(new ItemStack(ModBlocks.DARK_RUBY_BLOCK));
                stacks.add(new ItemStack(Items.EMERALD));
                stacks.add(new ItemStack(Blocks.EMERALD_BLOCK));
                stacks.add(new ItemStack(Items.REDSTONE));
                stacks.add(new ItemStack(Blocks.REDSTONE_BLOCK));
                stacks.add(new ItemStack(Items.DIAMOND));
                stacks.add(new ItemStack(Items.DIAMOND_BLOCK));
            }).build();

    @Override
    public void onInitialize() {
        // Calling method from ModItems to register it into the game.
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
