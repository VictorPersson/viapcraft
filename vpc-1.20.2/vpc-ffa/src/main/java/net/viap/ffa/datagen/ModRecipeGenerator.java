package net.viap.ffa.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.viap.ffa.item.ModItems;

import java.util.List;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TURTLE_SKIN_CHESTPLATE)
                .pattern("S S")
                .pattern("TST")
                .pattern("TST")
                .input('S', Items.SCUTE)
                .input('T', ModItems.TURTLE_SKIN)
                .criterion(hasItem(Items.SCUTE), conditionsFromItem(Items.SCUTE))
                .criterion(hasItem(ModItems.TURTLE_SKIN), conditionsFromItem(ModItems.TURTLE_SKIN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TURTLE_SKIN) + "_"));
        /*
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TURTLE_SKIN_LEGGINGS)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TURTLE_SKIN)
                .criterion(hasItem(ModItems.TURTLE_SKIN), conditionsFromItem(ModItems.TURTLE_SKIN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TURTLE_SKIN) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TURTLE_SKIN_BOOTS)
                .pattern("   ")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TURTLE_SKIN)
                .criterion(hasItem(ModItems.TURTLE_SKIN), conditionsFromItem(ModItems.TURTLE_SKIN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TURTLE_SKIN) + "_"));
        */
    }
}