package net.viap.viapcraft.tools;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.util.Objects;

public class StaffOfMinerals extends Item {

    public StaffOfMinerals(Settings settings) {
        super(settings);

    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        // Only checking the client, often not what we want to do, but since the server does not need to know about this.
        // Something that only concerns the player.
        if (context.getWorld().isClient()) {
            // Position which is clicked.
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = Objects.requireNonNull(context.getPlayer());
            boolean foundBlock = false;

            // getY is the position from bedrock to the player.
            for (int i = 0; i <= positionClicked.getY(); i++) {
                // Go down by the amount we have counted. Gets the block of the block which we have cliked on OR the
                // below that one which has not been checked yet.
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if (isValuableBLock(blockBelow)) {
                    // Run the method to print text. Sending
                    outPutCoordinates(blockBelow, positionClicked.add(0, -i, 0), player);
                    foundBlock = true;
                    break;
                }
            }

            if (!foundBlock) {
                player.sendMessage(new LiteralText("Found nothing here..."), false);
            }

        }

        // Damage the item in the active player mainhand by 1, then send this status so that if it breaks, play auto animaton
        context.getStack().damage(1, context.getPlayer(), (player -> player.sendToolBreakStatus(player.getActiveHand())));

        return super.useOnBlock(context);
    }

    // Check if the block found is a valuble block, return true
    private boolean isValuableBLock(Block block) {
        // Will refactor this using tags later
        return block == Blocks.COAL_ORE || block == Blocks.DEEPSLATE_COAL_ORE || block == Blocks.IRON_ORE || block == Blocks.DIAMOND_ORE;
    }

    // When block found, prints message to player with coordinates in the lower action bar (false)
    private void outPutCoordinates(Block blockFound, BlockPos pos, PlayerEntity player) {
        // Send message to player
        player.sendMessage(new LiteralText("Found " + blockFound.asItem().getName().getString() + "at ("
                + pos.getX() + ", " + (pos.getY() - player.getY() + 1) + ", " + pos.getZ() + ")" + "| You are at: " + player.getY()), false);
    }
}
