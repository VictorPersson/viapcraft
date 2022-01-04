package net.viap.viapcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NavigatorBlock extends Block {
    public NavigatorBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        // This is called 4 times. 2 for client, and 2 for the server/world
        // If not called for client
        if(!world.isClient()) {
            if (hand == Hand.MAIN_HAND) {
                BlockPos playerBlockPos = player.getBlockPos();
                String posMsg = String.format("Current location of §e%s§r is: (X: §b%d§r Y: §b%d§r Z: §b%d§r)", player.getDisplayName().getString(), player.getBlockPos().getX(), player.getBlockPos().getY(), player.getBlockPos().getZ());
                player.sendMessage(new LiteralText(posMsg), false);
            }
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }
}
