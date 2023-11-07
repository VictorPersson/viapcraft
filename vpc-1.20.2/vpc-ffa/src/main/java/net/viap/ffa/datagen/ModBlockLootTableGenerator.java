package net.viap.ffa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

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

    }
}
