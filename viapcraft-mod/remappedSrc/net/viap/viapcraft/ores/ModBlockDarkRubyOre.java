package net.viap.viapcraft.ores;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;


public class ModBlockDarkRubyOre extends Block {

    public ModBlockDarkRubyOre(Settings settings) {
        super(settings);
    }

    protected int getExperienceWhenMined(Random random) {
        return MathHelper.nextInt(random, 2, 6);
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {

        // If the user has the silk Touch Enchantment
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) != 0) return;

        // Sets the XP dropped when mining, random number, 2-6
        int i = this.getExperienceWhenMined(world.random);
        // If greater than 0 (must be otherwise, crash. Drop XP)
        if (i > 0) {
            this.dropExperience((ServerWorld) world, pos, i);
        }

        dropStacks(state, world, pos, blockEntity, player, stack);
        player.addExhaustion(0.005F);
        }
    }
