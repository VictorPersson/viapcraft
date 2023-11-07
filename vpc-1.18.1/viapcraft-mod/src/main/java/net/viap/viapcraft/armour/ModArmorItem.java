package net.viap.viapcraft.armour;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Random;

public class ModArmorItem extends ArmorItem {

    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    // Creates a Map (object), with key ArmorMaterial as Mithril and value StatusEffect as Glowing
    public static final Map<ArmorMaterial, StatusEffect> MATERIAL_TO_EFFECT_MAP = (
            new ImmutableMap.Builder<ArmorMaterial, StatusEffect>()).put(ModArmorMaterial.MITHRIL, StatusEffects.RESISTANCE).build();

    // Build in MC method. Called every tick if it's in the inventory of the player
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        // Make sure we are on the server
        if (!world.isClient()) {
            // Tick happens for all creatures holding the item, make sure it only happens for player
            if(entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;
                if(isWearingAllArmorSlots(player)) evaluateArmorEffects(player);
            }
        }
    }

    // Loops over MATERIAL_TO_EFFECT_MAP, gets values and keys and applies the status effect when called.
    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, StatusEffect> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffect mapStatusEffect = entry.getValue();

            if (isWearingCorrectArmor(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, ArmorMaterial mapArmorMaterial, StatusEffect mapStatusEffect) {

        // Makes mapStatusEffect into a bool (Does the player already have the status effect)
        boolean hasPlayerEffect = player.hasStatusEffect(mapStatusEffect);

        // Apply status effect for 1000 ms if player does not already have it and is wearing correct armor set.
        if(isWearingCorrectArmor(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect));

            // 25% risk of damaging all armor pieces each time you take them on and off.
            /*
            float breakChance = new Random().nextFloat();
            if(breakChance > 0.75) {
                player.getInventory().damageArmor(DamageSource.ANVIL, 1f, new int[]{0, 1, 2, 3});
            }
            **/
        }
    }

    // Return true if player has armour in all slots
    private boolean isWearingAllArmorSlots(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    };

    // Return true if player has the correct (same set of armor) in all slots
    private boolean isWearingCorrectArmor(ArmorMaterial material, PlayerEntity player) {
        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem chestplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && chestplate.getMaterial() == material && leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
