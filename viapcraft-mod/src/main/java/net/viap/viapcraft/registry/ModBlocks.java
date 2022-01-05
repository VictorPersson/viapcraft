package net.viap.viapcraft.registry;

import net.minecraft.block.*;
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
    public static final Block DARK_RUBY_BLOCK = new Block(FabricBlockSettings
            // Sound when you break the block
            .of(Material.METAL)
            // Will break faster with pickaxes, 1-4 (2 is iron pickaxe)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            // Must have a tool to mine
            .requiresTool()
            // Diamond has hardness strength of 5.0f, 2nd param is how hard it is to explode
            .strength(4.5f, 25.0f)
            // Sound of block when you walk over it.
            .sounds(BlockSoundGroup.METAL)
            // Makes the block glow
            .luminance(0));

    public static final Block NAVIGATOR_BLOCK = new NavigatorBlock(FabricBlockSettings
            .of(Material.PISTON)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(9.0f, 100.f)
            .luminance(1));

    public static final Block JADE_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            // How long to break the block
            .strength(4.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            // How long to break the block
            .strength(4.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block SAPPHIRE_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            // How long to break the block
            .strength(4.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block STEEL_STAIRS = new ModStairsBlock(ModBlocks.STEEL_BLOCK.getDefaultState(),
            FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block STEEL_SLAB = new SlabBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block STEEL_FENCE = new FenceBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block STEEL_FENCE_GATE = new FenceGateBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block STEEL_PRESSURE_PLATE = new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block STEEL_BUTTON = new ModStoneButtonBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

    public static final Block STEEL_TRAPDOOR = new ModTrapdoorBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .nonOpaque());

    public static final Block STEEL_DOOR = new ModDoorBlock(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .nonOpaque());

    // New block, can add many attributes
    public static final Block DARK_RUBY_ORE = new ModBlockDarkRubyOre(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(4.0f, 35.0f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(0));

    public static final Block THORIUM_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(5.0f, 40.f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(0));

    public static final Block MITHRIL_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(6.0f, 100.f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(0));


    public static final Block COCA_PLANT = new ModBlockCocaPlant(FabricBlockSettings
            .of(Material.PLANT)
            .noCollision()
            .ticksRandomly()
            .strength(0.5f, 0.3f)
            .sounds(BlockSoundGroup.CROP)
            .nonOpaque());

    // This  needs to be called in start of init in main class.
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "dark_ruby_block"), DARK_RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "dark_ruby_ore"), DARK_RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "thorium_ore"), THORIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "mithril_ore"), MITHRIL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "coca_plant"), COCA_PLANT);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "jade_ore"), JADE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_stairs"), STEEL_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_slab"), STEEL_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_block"), STEEL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_fence"), STEEL_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_fence_gate"), STEEL_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_pressure_plate"), STEEL_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_button"), STEEL_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_door"), STEEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "steel_trapdoor"), STEEL_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "navigator_block"), NAVIGATOR_BLOCK);
    }
}
