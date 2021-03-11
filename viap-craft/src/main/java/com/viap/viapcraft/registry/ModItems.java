package com.viap.viapcraft.registry;

import com.viap.viapcraft.Viapcraft;
import com.viap.viapcraft.food.LSDFoodComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// Here we add all items we want in the game
public class ModItems {

    // ITEMS:
    // Where in the create menu to add the item, in this case - our own made general item group
    public static final Item DARK_RUBY = new Item(new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final Item CRYSTALIZED_DARK_RUBY = new Item(new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final Item THORIUM_BAR = new Item(new Item.Settings().group(Viapcraft.ITEM_GROUP));

    // BLOCK ITEMS:
    public static final BlockItem DARK_RUBY_BLOCK = new BlockItem(ModBlocks.DARK_RUBY_BLOCK, new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final BlockItem DARK_RUBY_ORE = new BlockItem(ModBlocks.DARK_RUBY_ORE, new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final BlockItem THORIUM_ORE = new BlockItem(ModBlocks.THORIUM_ORE, new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final BlockItem MITHRIL_ORE = new BlockItem(ModBlocks.MITHRIL_ORE, new Item.Settings().group(Viapcraft.ITEM_GROUP));

    // FOODS:
    public static final Item LSD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(LSDFoodComponent.LSD));

    // TOOLS:
    public static final Item DARK_RUBY_PICKAXE = new PickaxeBase(new ToolMaterialFabric());

    // Register the item to the game, needs to be called in main class Viapcraft
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby"), DARK_RUBY);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "crystalized_dark_ruby"), CRYSTALIZED_DARK_RUBY);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_block"), DARK_RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_ore"), DARK_RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_pickaxe"), DARK_RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_ore"), THORIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_bar"), THORIUM_BAR);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_ore"), MITHRIL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "lsd_food"), LSD);
    }
}
