package net.viap.ffa.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class LightningStrikerEnchantment extends Enchantment {
    public LightningStrikerEnchantment(Rarity rarity, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(rarity, target, slotTypes);
    }

    // This is called each time you damage a target, if this enchantment is on the weapon
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) user.getWorld();
            BlockPos pos = target.getBlockPos();

            // IF enchantment level is one, spawn 1 lightning bolt
            if (level == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, pos, SpawnReason.TRIGGERED);
            }
            // Otherwise spawn 2
            if (level == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, pos, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, pos, SpawnReason.TRIGGERED);

            }
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
