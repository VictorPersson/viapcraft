package net.viap.vpc.potion;

import net.minecraft.client.render.model.json.ItemModelGenerator;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.viap.vpc.Viapcraft;

public class ModPotions {

    public static final Potion FESTIS_KAKTUS = registerPotion("festis_kaktus",
            new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 2)));

    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(Viapcraft.MOD_ID, name), potion);
    }
    public static void registerPotions() {
        Viapcraft.LOGGER.info("Registering Potions for " + Viapcraft.MOD_ID);
    }

    public static Identifier getCustomPotionTexture() {
        return new Identifier(Viapcraft.MOD_ID, "item/festis_kaktus"); // Path to your custom potion texture
    }

}