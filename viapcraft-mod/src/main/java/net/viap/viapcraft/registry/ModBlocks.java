package net.viap.viapcraft.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.viap.viapcraft.Viapcraft;
import net.viap.viapcraft.blocks.*;
import net.viap.viapcraft.crops.ModBlockCocaPlant;
import net.viap.viapcraft.ores.ModBlockDarkRubyOre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.viap.viapcraft.stairs.ModStairsBlock;

public class ModBlocks {

    // New block, can add many attributes
    public static final Block DARK_RUBY_BLOCK = registerBlock("dark_ruby_block", new Block(FabricBlockSettings
            // Sound when you break the block
            .of(Material.METAL)
            // Must have a tool to mine
            .requiresTool()
            // Diamond has hardness strength of 5.0f, 2nd param is how hard it is to explode
            .strength(4.5f, 25.0f)
            // Sound of block when you walk over it.
            .sounds(BlockSoundGroup.STONE)
            // Makes the block glow
            .luminance(0)));

    // New block, can add many attributes
    public static final Block DARK_RUBY_ORE = registerBlock("dark_ruby_ore", new ModBlockDarkRubyOre(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(4.0f, 35.0f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(0)));

    public static final Block NAVIGATOR_BLOCK = registerBlock("navigator_block", new NavigatorBlock(FabricBlockSettings
            .of(Material.PISTON)
            .requiresTool()
            .strength(9.0f, 100.f)
            .luminance(1)));

    public static final Block JADE_ORE = registerBlock("jade_ore", new Block(FabricBlockSettings
            .of(Material.STONE)
            // How long to break the block
            .strength(4.0f)
            .requiresTool()));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore", new Block(FabricBlockSettings
            .of(Material.STONE)
            // How long to break the block
            .strength(4.0f)
            .requiresTool()));

    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings
            .of(Material.STONE)
            // How long to break the block
            .strength(4.0f)
            .requiresTool()));

    public static final Block STEEL_STAIRS = registerBlock("steel_stairs", new ModStairsBlock(ModBlocks.STEEL_BLOCK.getDefaultState(),
            FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .requiresTool()));

    public static final Block STEEL_SLAB = registerBlock("steel_slab", new SlabBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .requiresTool()));

    public static final Block STEEL_FENCE = registerBlock("steel_fence", new FenceBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .requiresTool()));

    public static final Block STEEL_FENCE_GATE = registerBlock("steel_fence_gate", new FenceGateBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .requiresTool()));

    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            //.requiresTool()
            ));

    public static final Block STEEL_BUTTON = registerBlock("steel_button", new ModStoneButtonBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(1.5f)
            .requiresTool()));

    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor", new ModTrapdoorBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(2.0f)
            .requiresTool()
            .nonOpaque()));

    public static final Block STEEL_DOOR = registerBlock("steel_door", new ModDoorBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .requiresTool()
            .nonOpaque()));

    public static final Block THORIUM_ORE = registerBlock("thorium_ore", new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(5.0f, 40.f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(0)));

    public static final Block MITHRIL_ORE = registerBlock("mithril_ore", new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(6.0f, 100.f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .luminance(0)));


    public static final Block COCA_PLANT = registerBlock("coca_plant", new ModBlockCocaPlant(FabricBlockSettings
            .of(Material.PLANT)
            .noCollision()
            .ticksRandomly()
            .strength(0.5f, 0.3f)
            .sounds(BlockSoundGroup.CROP)
            .nonOpaque()));

    // This  needs to be called in start of init in main class.
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(MainItemGroup.VIAPCRAFT_MAIN_ITEM_GROUP)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + Viapcraft.MOD_ID);
    }
}