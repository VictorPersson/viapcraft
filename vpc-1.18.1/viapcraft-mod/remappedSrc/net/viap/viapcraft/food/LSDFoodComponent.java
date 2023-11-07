package net.viap.viapcraft.food;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class LSDFoodComponent {
    // Builds the Java file, hunger: how much food does it fills up, saturation, how long does it last.
    public static final FoodComponent LSD = (new FoodComponent.Builder())
            .hunger(0)
            .saturationModifier(.5f)
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 4000), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600), 1)
            .build();
}
