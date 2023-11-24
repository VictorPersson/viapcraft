package net.viap.vpc.util;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.viap.vpc.mixin.BrewingRecipeRegistryMixin;
import net.viap.vpc.potion.ModPotions;

public class ModRegistries {
    public static void registerModStuff() {
    }

    // Registering the new potion brew recipe, saying what we need and what effect it will produce: awkward potion + sapphire
    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.STRONG_REGENERATION, Items.CACTUS, ModPotions.FESTIS_KAKTUS);
    }

}
