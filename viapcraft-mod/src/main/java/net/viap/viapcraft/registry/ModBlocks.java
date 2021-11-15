package net.viap.viapcraft.registry;

import net.viap.viapcraft.Viapcraft;
import net.viap.viapcraft.crops.ModBlockCocaPlant;
import net.viap.viapcraft.ores.ModBlockDarkRubyOre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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

    public static final Block JADE_ORE =  new Block(FabricBlockSettings
            .of(Material.STONE)
            // How long to break the block
            .strength(4.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool());

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
    }
}
