package net.viap.ffa.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SoundBlock extends Block {

    public SoundBlock(Settings settings) {
        super(settings);
    }

    // Method called when you right click a block
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {


        if (player.isSneaking()) {
            world.playSound(player, pos, SoundEvents.BLOCK_NOTE_BLOCK_BANJO.value(), SoundCategory.BLOCKS, 1f , 1f);
            return ActionResult.SUCCESS;
        } else {
            world.playSound(player, pos, SoundEvents.BLOCK_NOTE_BLOCK_COW_BELL.value(), SoundCategory.BLOCKS, 1f , 1f);
            return ActionResult.CONSUME;
        }

        // onUse is called 4 times per click, so you might want to specify what should happen on click
        /*
        if (world.isClient()) {
            if (hand == Hand.MAIN_HAND) {
                MCCourseMod.LOGGER.info("CLIENT: MAIN HAND (Right");
            } else {
                MCCourseMod.LOGGER.info("CLIENT OFF HAND (Left)");
            }
        } else {
            if (hand == Hand.MAIN_HAND) {
                MCCourseMod.LOGGER.info("SERVER MAIN HAND (Right)");
            } else {
                MCCourseMod.LOGGER.info("SERVER OFF HAND (Left)");
            }
        }

        // Returning this means that the hand will swing
        return ActionResult.SUCCESS;

         */
    }

    // IF an entity steps on a block
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        world.playSound(entity, pos, SoundEvents.BLOCK_NOTE_BLOCK_BIT.value(), SoundCategory.BLOCKS, 1f, 1f);
        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
    }
}
