package net.viap.viapcraft.armour;

import net.viap.viapcraft.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class DarkRubyArmorMaterial implements ArmorMaterial {

    // Base durability to match the vanillas from Minecraft
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};

    // How much protection each armor peace will do, boots at index 0 and up.
    private static final int[] PROTECTION_AMOUNTS = new int[] {2, 5, 6, 3};

    @Override
    public int getDurability(EquipmentSlot arg0) {
        // Calling the base durability from above, then multiplying it with a numb.
        return BASE_DURABILITY[arg0.getEntitySlotId()] * 25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return PROTECTION_AMOUNTS[arg0.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DARK_RUBY);
    }

    @Override
    public String getName() {
        return "dark_ruby_armor";
    }

    @Override
    public float getToughness() {
        return 1;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
