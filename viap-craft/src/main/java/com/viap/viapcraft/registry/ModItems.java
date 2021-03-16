package com.viap.viapcraft.registry;

import com.viap.viapcraft.Viapcraft;
import com.viap.viapcraft.armour.ArmorBase;
import com.viap.viapcraft.armour.DarkRubyArmorMaterial;
import com.viap.viapcraft.armour.TurtleArmorMaterial;
import com.viap.viapcraft.crops.ItemCocaSeed;
import com.viap.viapcraft.food.CocaLeafFoodComponent;
import com.viap.viapcraft.food.CocaineFoodComponent;
import com.viap.viapcraft.food.LSDFoodComponent;
import com.viap.viapcraft.food.MarijuanaFoodComponent;
import com.viap.viapcraft.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
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
    public static final Item MITHRIL_BAR = new Item(new Item.Settings().group(Viapcraft.ITEM_GROUP));

    // BLOCK ITEMS:
    public static final BlockItem DARK_RUBY_BLOCK = new BlockItem(ModBlocks.DARK_RUBY_BLOCK, new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final BlockItem DARK_RUBY_ORE = new BlockItem(ModBlocks.DARK_RUBY_ORE, new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final BlockItem THORIUM_ORE = new BlockItem(ModBlocks.THORIUM_ORE, new Item.Settings().group(Viapcraft.ITEM_GROUP));
    public static final BlockItem MITHRIL_ORE = new BlockItem(ModBlocks.MITHRIL_ORE, new Item.Settings().group(Viapcraft.ITEM_GROUP));

    // FOODS:
    public static final Item LSD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(LSDFoodComponent.LSD));
    public static final Item MARIJUANA = new Item(new Item.Settings().group(ItemGroup.FOOD).food(MarijuanaFoodComponent.MARIJUANA));
    public static final Item COCAINE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(CocaineFoodComponent.COCAINE));
    public static final Item COCA_LEAF = new Item(new Item.Settings().group(ItemGroup.FOOD).food(CocaLeafFoodComponent.COCA_LEAF));

    // Crops
    public static final Item COCA_SEED = new ItemCocaSeed(ModBlocks.COCA_PLANT, (new Item.Settings().group(Viapcraft.ITEM_GROUP)));

    // TOOLS:
    public static final Item DARK_RUBY_PICKAXE = new PickaxeBase(new PickaxeToolMaterialDarkRuby());
    public static final Item DARK_RUBY_AXE = new AxeBase(new AxeToolMaterialDarkRuby());
    public static final Item DARK_RUBY_SHOVEL = new ShovelBase(new ShovelToolMaterialDarkRuby());
    public static final Item DARK_RUBY_SWORD = new SwordBase(new SwordToolMaterialDarkRuby());
    public static final Item DARK_RUBY_HOE = new HoeBase(new HoeToolMaterialDarkRuby());

    // Armor
    public static final ArmorMaterial DARK_RUBY_ARMOR = new DarkRubyArmorMaterial();
    public static final ArmorMaterial TURTLE_ARMOR = new TurtleArmorMaterial();

    // Register the item to the game, needs to be called in main class Viapcraft
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby"), DARK_RUBY);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "crystalized_dark_ruby"), CRYSTALIZED_DARK_RUBY);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_block"), DARK_RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_ore"), DARK_RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_pickaxe"), DARK_RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_axe"), DARK_RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_shovel"), DARK_RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_sword"), DARK_RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_hoe"), DARK_RUBY_HOE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_ore"), THORIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_bar"), THORIUM_BAR);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_ore"), MITHRIL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_bar"), MITHRIL_BAR);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "lsd_food"), LSD);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "marijuana_food"), MARIJUANA);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "cocaine_food"), COCAINE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "coca_seed"), COCA_SEED);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "coca_leaf_food"), COCA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_helmet"), new ArmorBase(DARK_RUBY_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_chest"), new ArmorBase(DARK_RUBY_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_legs"), new ArmorBase(DARK_RUBY_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_feet"), new ArmorBase(DARK_RUBY_ARMOR, EquipmentSlot.FEET));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "turtle_armor_chest"), new ArmorBase(TURTLE_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "turtle_armor_legs"), new ArmorBase(TURTLE_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "turtle_armor_feet"), new ArmorBase(TURTLE_ARMOR, EquipmentSlot.FEET));
    }
}
