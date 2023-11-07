package net.viap.ffa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.viap.ffa.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    // This will create all the JSON files related to a new block
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    // This will create all the JSON files related to a new item
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_SKIN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_SKIN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_SKIN_BOOTS));
        itemModelGenerator.register(ModItems.TURTLE_SKIN, Models.GENERATED);
    }
}
