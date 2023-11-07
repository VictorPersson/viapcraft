package net.viap.ffa.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PinkSapphireLampBlock extends Block {
    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");
    public PinkSapphireLampBlock(Settings settings) {
        super(settings);
        // Make sure the default state of the bool is false, so lamp off
        this.setDefaultState(this.getDefaultState().with(CLICKED, false));
    }

    // Calling the onUse method, in this case to detect when we hit the block with our main hand
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        // This needs to happen on the server, not client
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            // Setting the block state to the opposite of what it was, so if it was false, cycle it to true
            world.setBlockState(pos, state.cycle(CLICKED));
        }
        // Make the hand animation happen;
        return ActionResult.SUCCESS;
    }

    // This must be added if we intend to add properties to a block, like our boolean
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CLICKED);
    }
}
