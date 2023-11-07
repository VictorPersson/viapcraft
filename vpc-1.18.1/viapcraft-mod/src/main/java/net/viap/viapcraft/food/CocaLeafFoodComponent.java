package net.viap.viapcraft.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class CocaLeafFoodComponent {
    public static final FoodComponent COCA_LEAF = (new FoodComponent.Builder())
            .saturationModifier(.1f)
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 1), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 3), 1)
            .build();
}
