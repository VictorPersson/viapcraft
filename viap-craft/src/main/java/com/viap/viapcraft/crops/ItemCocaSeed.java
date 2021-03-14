package com.viap.viapcraft.crops;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemCocaSeed extends BlockItem {
    public ItemCocaSeed(Block crop, Settings builder) {
        super(crop, builder);
    }

    public void appendToolTip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(new TranslatableText("item.crops.coca_seed").formatted(Formatting.GREEN));
    }

}
