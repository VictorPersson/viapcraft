package net.viap.vpc.datagen;

import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PaintingVariantTags;
import net.minecraft.util.Identifier;
import net.viap.vpc.Viapcraft;

import java.util.concurrent.CompletableFuture;

// For some reason there isn't great infrastructure for creating new Paintings as they are PLACEABLE and not BLOCKS.
// We must therefore make a new TagProvider for it.
public class ModPaintingVariantTagProvider extends TagProvider<PaintingVariant> {

    public ModPaintingVariantTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture) {
        super(output, RegistryKeys.PAINTING_VARIANT, registryLookupFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(PaintingVariantTags.PLACEABLE)
                .addOptional(new Identifier(Viapcraft.MOD_ID, "felix"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "jonte"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "victor"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "pidde"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "adam"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "catsmurf"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "summer"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "beer"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "poli"))
                .addOptional(new Identifier(Viapcraft.MOD_ID, "firedance"));
    }
}