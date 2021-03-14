package com.viap.viapcraft.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MarijuanaFoodComponent {
    public static final FoodComponent MARIJUANA = (new FoodComponent.Builder())
            .hunger(0)
            .saturationModifier(.5f)
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 2000), .5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3000, 1), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2000), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 2000, 4), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100), 1)
            .build();
}
