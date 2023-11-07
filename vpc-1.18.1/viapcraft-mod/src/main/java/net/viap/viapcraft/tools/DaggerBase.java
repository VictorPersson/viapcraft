package net.viap.viapcraft.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DaggerBase implements ToolMaterial {

    public DaggerBase(int attackDamage, int durability, int enchantability, Item repairIngredient) {

        this.durability = durability;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
        this.attackDamage = attackDamage;
    }

    private final int attackDamage;
    private final int durability;
    private final int enchantability;
    private final Item repairIngredient;

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }
    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(repairIngredient);
    }
}
