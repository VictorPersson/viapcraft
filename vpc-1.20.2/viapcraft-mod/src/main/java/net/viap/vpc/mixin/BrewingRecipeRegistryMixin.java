package net.viap.vpc.mixin;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

// This allows us to invoke the new recipe so that the potion can be brewed
@Mixin(BrewingRecipeRegistry.class)
public interface BrewingRecipeRegistryMixin {
    @Invoker("registerPotionRecipe")
    static void invokeRegisterPotionRecipe(Potion input, Item item, Potion output) {
        throw new AssertionError();
    }
}