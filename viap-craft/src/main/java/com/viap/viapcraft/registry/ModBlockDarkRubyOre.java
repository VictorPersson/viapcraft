package com.viap.viapcraft.registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;



public class ModBlockDarkRubyOre extends Block {

    public ModBlockDarkRubyOre(Settings settings) {
        super(settings);
    }

    protected int getExperienceWhenMined(Random random) {
        return MathHelper.nextInt(random, 2, 6);
    }
 /*
    public void onStacksDropped(BlockState state, ServerWorld word, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        // If the user has the silk Touch Enchantment
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            // Sets the XP dropped when mining, random number, 2-6
            int i = this.getExperienceWhenMined(world.random);
            // If greater than 0 (must be otherwise, crash. Drop XP)
            if (i > 0) {
                this.dropExperience(world, pos, i);
            }
        }
    }


  */
}
