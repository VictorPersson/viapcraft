package com.viap.viapcraft.utilities;

import com.viap.viapcraft.registry.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders {
    public static void defineRenders() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COCA_PLANT, RenderLayer.getCutoutMipped());
        // Dynamically change color of the coca plant texture.
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> 0xa0a5a9, ModBlocks.COCA_PLANT);
    }
}
