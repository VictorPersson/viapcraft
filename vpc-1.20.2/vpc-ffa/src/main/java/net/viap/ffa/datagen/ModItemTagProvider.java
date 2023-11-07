package net.viap.ffa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.viap.ffa.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Instead of using JSON data files, this will auto add tags for Items.
 */
public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    // This makes it so that we can place our new armor into the smithing table
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TURTLE_SKIN_CHESTPLATE,
                        ModItems.TURTLE_SKIN_LEGGINGS,
                        ModItems.TURTLE_SKIN_BOOTS);
    }
}
