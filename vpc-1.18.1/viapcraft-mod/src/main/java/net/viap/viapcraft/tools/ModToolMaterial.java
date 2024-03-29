package net.viap.viapcraft.tools;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;
import net.viap.viapcraft.registry.ModItems;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    STEEL(MiningLevels.IRON, 500, 6.5F, 2.5F, 13, () -> {
        return Ingredient.ofItems(ModItems.STEEL_INGOT);
    }),

    THORIUM(MiningLevels.DIAMOND, 1000, 7.5F, 2.8F, 17, () -> {
        return Ingredient.ofItems(ModItems.THORIUM_INGOT);
    }),

    MITHRIL(MiningLevels.DIAMOND, 5000, 7.5F, 2.8F, 22, () -> {
        return Ingredient.ofItems(ModItems.MITHRIL_INGOT);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
