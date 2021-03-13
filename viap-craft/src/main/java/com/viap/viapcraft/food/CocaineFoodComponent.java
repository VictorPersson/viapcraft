package com.viap.viapcraft.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class CocaineFoodComponent {

    public static final FoodComponent COCAINE = (new FoodComponent.Builder())
            .hunger(0)
            .saturationModifier(.3f)
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1000, 1), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 500, 5), 1)
            .build();
}
