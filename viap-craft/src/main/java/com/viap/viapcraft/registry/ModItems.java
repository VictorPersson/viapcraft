package com.viap.viapcraft.registry;

import com.viap.viapcraft.Viapcraft;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
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

// Here we add all items we want in the game
public class ModItems {

    // ITEMS:
    // Where in the create menu to add the item, in this case - our own made general item group
    public static final Item DARK_RUBY = new Item(new Item.Settings().group(Viapcraft.ITEM_GROUP));

    // BLOCK ITEMS:
    public static final BlockItem DARK_RUBY_BLOCK = new BlockItem(ModBlocks.DARK_RUBY_BLOCK, new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final BlockItem DARK_RUBY_ORE = new BlockItem(ModBlocks.DARK_RUBY_ORE, new Item.Settings().group(Viapcraft.ITEM_GROUP));

    // TOOLS:
    public static final Item DARK_RUBY_PICKAXE = new PickaxeBase(new ToolMaterialFabric());

    // Register the item to the game, needs to be called in main class Viapcraft
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby"), DARK_RUBY);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_block"), DARK_RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_ore"), DARK_RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_pickaxe"), DARK_RUBY_PICKAXE);

    }
}
