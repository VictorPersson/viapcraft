package net.viap.ffa;

import net.fabricmc.api.ClientModInitializer;
import net.viap.ffa.util.ModModelPredicateProvider;
public class FFAClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
