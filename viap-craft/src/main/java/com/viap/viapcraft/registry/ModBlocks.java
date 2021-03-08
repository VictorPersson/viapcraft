package com.viap.viapcraft.registry;

import com.viap.viapcraft.Viapcraft;
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
            // Diamond has hadness streight of 5.0f, 2nd param is how hard it is to explode
            .strength(4.5f, 25.0f)
            // Sound of block when you walk over it.
            .sounds(BlockSoundGroup.METAL)
            // Makes the block glow
            .luminance(1));

    // New block, can add many attributes
    public static final Block DARK_RUBY_ORE = new Block(FabricBlockSettings
            // Sound when you break the block
            .of(Material.STONE)
            // Will break faster with pickaxes, 1-4 (2 is iron pickaxe)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            // Must have a tool to mine
            .requiresTool()
            // Diamond has hadness streight of 5.0f, 2nd param is how hard it is to explode
            .strength(4.5f, 35.0f)
            // Sound of block when you walk over it.
            .sounds(BlockSoundGroup.STONE)
            // Makes the block glow
            .luminance(5));

    // This  needs to be called in start of init in main class.
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "dark_ruby_block"), DARK_RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Viapcraft.MOD_ID, "dark_ruby_ore"), DARK_RUBY_ORE);
    }
}
