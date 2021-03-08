package com.viap.viapcraft.registry;

import com.viap.viapcraft.Viapcraft;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialFabric implements ToolMaterial {
    @Override
    // Wood 59, Stone 131, Iron 250, Diamond 1561
    public int getDurability() {
        return 200;
    }

    @Override
    // Wood 2.0f, Stone 4.0f, Iron 6.0f, Diamond 8.Of, Gold 12.Of.
    public float getMiningSpeedMultiplier() {
        return 7.0f;
    }

    @Override
    public float getAttackDamage() {
        // Wood/Gold 0.0f, Stone 1.0f, Iron 2.0f, Diamond 3.0f
        return 0.5f;
    }

    @Override
    // What lvl blocks can it break:
    // Wood/Gold 0, Stone 1, Iron 2, Diamond 3
    public int getMiningLevel() {
        return 2;
    }

    @Override
    // How easy to get high random high lvl/multi enchants:
    // Stone 5, Diamond 10, Iron 14, Wood 15, Gold 22
    public int getEnchantability() {
        return 25;
    }

    @Override
    // Anvil repair items
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DARK_RUBY);
    }
}
