package net.viap.viapcraft.utilities;

import net.viap.viapcraft.registry.ModItems;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class ItemRenders {
    public static void defineRenders() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xa0a5a9, ModItems.COCA_SEED);
    }
}
