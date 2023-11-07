package net.viap.viapcraft;

import net.viap.viapcraft.utilities.BlockRenders;
import net.viap.viapcraft.utilities.ItemRenders;
import net.fabricmc.api.ClientModInitializer;

// Calls BlockRender in Utilities, only loads client side, prevents crops from having texture glitch issues.
public class CropsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenders.defineRenders();
        ItemRenders.defineRenders();
    }
}
