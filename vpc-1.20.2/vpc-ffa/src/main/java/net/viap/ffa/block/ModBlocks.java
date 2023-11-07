package net.viap.ffa.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.viap.ffa.FFA;

public class ModBlocks {

    /**
     * Helper method which we call in order to register and create a new block in MC.
     *
     * @param param1 name of the block, will only accept 1 word names, underscore separated
     * @param param2 An instance of the actual block
     * @return Instance of the registration which has the sapphire.json, mod ID and name.
     */
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FFA.MOD_ID, name), block);
    }

    /**
     * Helper method which we call in order to register and create a new item that is a block in MC.
     *
     * @param param1 name of the block, will only accept 1 word names, underscore separated
     * @param param2 An instance of the actual block
     * @return Instance of the registration which has the sapphire.json, mod ID and name.
     */
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FFA.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        FFA.LOGGER.info("Registering ModBlocks for " + FFA.MOD_ID);
    }
}
