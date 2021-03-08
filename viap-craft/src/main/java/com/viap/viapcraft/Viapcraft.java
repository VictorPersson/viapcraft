package com.viap.viapcraft;

import com.viap.viapcraft.registry.ModBlocks;
import com.viap.viapcraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

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
                stacks.add(new ItemStack(ModBlocks.DARK_RUBY_BLOCK));
                stacks.add(new ItemStack(ModBlocks.DARK_RUBY_ORE));
                stacks.add(new ItemStack(Items.EMERALD));
                stacks.add(new ItemStack(Blocks.EMERALD_BLOCK));
                stacks.add(new ItemStack(Items.REDSTONE));
                stacks.add(new ItemStack(Blocks.REDSTONE_BLOCK));
                stacks.add(new ItemStack(Items.DIAMOND));
                stacks.add(new ItemStack(Items.DIAMOND_BLOCK));
            }).build();

    private static final ConfiguredFeature<?, ?> DARK_RUBY_ORE_OVERWORLD = Feature.ORE.configure(
            // Setting how many of the ore will be spawned in one cluster
            new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.DARK_RUBY_ORE.getDefaultState(), 9))
            // Setting minimum/max Y level of ore generation, ex only top of mountains would be (0, 120, 0). Everywhere = 0.
            // .spreadHorizontally() makes it generate in clusters and not in one straight line/pilar.
            // .repeat() how many of the blocks should generate in a chunk (16x16 area). Rare would be 1-2.
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 120 ))).spreadHorizontally().repeat(20);

    @Override
    public void onInitialize() {
        // Calling method from ModItems to register it into the game.
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        RegistryKey<ConfiguredFeature<?,?>> darkRubyOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("viapcraft", "dark_ruby_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, darkRubyOreOverworld.getValue(), DARK_RUBY_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, darkRubyOreOverworld);
    }
}
