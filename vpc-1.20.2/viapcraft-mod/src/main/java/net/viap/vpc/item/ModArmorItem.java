package net.viap.vpc.item;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

// How to add custom armor effect on full armor set: This will only work for custom armor items
public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>().put(ModArmorMaterials.TURTLE_SKIN,
                        new StatusEffectInstance(StatusEffects.RESISTANCE, 20, 2))
                    .build();
    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    // Method called every tick (if item X is in our inventory) so that we know if we are wearing the armor every tick
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        // We don't want to do this on the client, and we only want to do this for players, not Zombies etc.
        if (!world.isClient && entity instanceof PlayerEntity player) {
            if (hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    // Loop over the Map of Armor materials and effects, check if it's the correct material we are wearing
    private void evaluateArmorEffects(PlayerEntity player) {
        for(Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();
            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapStatusEffect);
                break; // Break out as soon as we have applied the effect
            }
        }
    }

    // Only apply the effect, if the player does not already have it applied.
    private void addStatusEffectForMaterial(PlayerEntity player, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffectAlready = player.hasStatusEffect(mapStatusEffect.getEffectType());
        if(!hasPlayerEffectAlready) {
            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
    }

    // Check if the player is wearing the correct type of armor, EI: Not mixed armor etc.
    private boolean hasCorrectArmorOn(ArmorMaterial mapArmorMaterial, PlayerEntity player) {
        for (ItemStack armorStack : player.getArmorItems()) {

            // Check if the item in an armor slot is a real armor item, if not just return early
            if (!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = (ArmorItem) player.getInventory().getArmorStack(0).getItem();
        ArmorItem leggings = (ArmorItem) player.getInventory().getArmorStack(1).getItem();
        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmorStack(2).getItem();

        return chestplate.getMaterial() == mapArmorMaterial &&
                leggings.getMaterial() == mapArmorMaterial &&
                boots.getMaterial() == mapArmorMaterial;
    }

    // If any of the entities does not exist on the player instance, return false
    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        return !boots.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty();
    }
}
