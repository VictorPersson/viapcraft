package net.viap.vpc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.viap.vpc.block.custom.ModBlocks;
import net.viap.vpc.item.ModItems;

/**
 * Instead of using JSON data files, loot tables
 */
public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    // If we pass in the block here, it's simply going to drop itself, if something else add oreDrops()
    @Override
    public void generate() {
        addDrop(ModBlocks.FOSSILIZED_AMMOLITE_ORE, oreDrops(ModBlocks.FOSSILIZED_AMMOLITE_ORE, ModItems.FOSSILIZED_AMMOLITE));;
        addDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE, oreDrops(ModBlocks.DEEPSLATE_MITHRIL_ORE, ModItems.RAW_MITHRIL));;
        addDrop(ModBlocks.MITHRIL_ORE, oreDrops(ModBlocks.MITHRIL_ORE, ModItems.RAW_MITHRIL));;
    }
}
