package net.viap.vpc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.viap.vpc.block.custom.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    /**
     * Instead of using JSON data files, this will auto add tags, such as tool requirements, which blocks can be mined.
     */
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.FOSSILIZED_AMMOLITE_ORE,
                        ModBlocks.FOSSILIZED_AMMOLITE_ORE);

        // The blocks that should have the needs diamond pickaxe requirement
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.FOSSILIZED_AMMOLITE_ORE,
                        ModBlocks.DEEPSLATE_MITHRIL_ORE,
                        ModBlocks.MITHRIL_ORE);

        // The blocks that should have the needs iron pickaxe requirement
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.FOSSILIZED_AMMOLITE_ORE,
                        ModBlocks.FOSSILIZED_AMMOLITE_ORE);
    }
}
