package com.viap.viapcraft.registry;

import com.viap.viapcraft.Viapcraft;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
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

public class OreGeneration {

    private static final ConfiguredFeature<?, ?> DARK_RUBY_ORE_OVERWORLD = Feature.ORE.configure(
            // Setting how many of the ore will be spawned in one cluster
            new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.DARK_RUBY_ORE.getDefaultState(), 9))
            // Setting minimum/max Y level of ore generation, ex only top of mountains would be (0, 120, 0). Everywhere = 0.
            // .spreadHorizontally() makes it generate in clusters and not in one straight line/pilar.
            // .repeat() how many of the blocks should generate in a chunk (16x16 area). Rare would be 1-2.
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 120 ))).spreadHorizontally().repeat(20);

    // Register the feature
    public static void RegisterItems() {
        RegistryKey<ConfiguredFeature<?,?>> darkRubyOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("viapcraft", "dark_ruby_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, darkRubyOreOverworld.getValue(), DARK_RUBY_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, darkRubyOreOverworld);
    }
}


