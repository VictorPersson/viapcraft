package net.viap.vpc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.viap.vpc.block.custom.ModBlocks;
import net.viap.vpc.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    // This will create all the JSON files related to a new block
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FOSSILIZED_AMMOLITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MITHRIL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MITHRIL_ORE);
    }

    // This will create all the JSON files related to a new item
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_SKIN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_SKIN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_SKIN_BOOTS));
        itemModelGenerator.register(ModItems.TURTLE_SKIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NACRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MITHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_BAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.NACRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOSSILIZED_AMMOLITE, Models.GENERATED);
    }
}
