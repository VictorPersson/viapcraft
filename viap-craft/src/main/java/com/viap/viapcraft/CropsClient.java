package com.viap.viapcraft;

import com.viap.viapcraft.utilities.BlockRenders;
import com.viap.viapcraft.utilities.ItemRenders;
import net.fabricmc.api.ClientModInitializer;

// Calls BlockRender in Utilities, only loads client side, prevents crops from having texture glitch issues.
public class CropsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenders.defineRenders();
        ItemRenders.defineRenders();
    }
}
