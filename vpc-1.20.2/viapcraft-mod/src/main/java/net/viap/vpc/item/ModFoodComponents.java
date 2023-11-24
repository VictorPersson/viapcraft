package net.viap.vpc.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent FESTIS_KAKTUS =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).snack().statusEffect(
                    new StatusEffectInstance(StatusEffects.HEALTH_BOOST), 0.5f
            ).build();
}