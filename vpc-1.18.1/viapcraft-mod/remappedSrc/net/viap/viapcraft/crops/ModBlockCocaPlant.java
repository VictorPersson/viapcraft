package net.viap.viapcraft.crops;

import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ModBlockCocaPlant extends CropBlock {
    public ModBlockCocaPlant(Settings builder) {
        super(builder);
    }

    public void appendToolTip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(new TranslatableText("blocks.crops.coca_plant").formatted(Formatting.GREEN));
    }
}
