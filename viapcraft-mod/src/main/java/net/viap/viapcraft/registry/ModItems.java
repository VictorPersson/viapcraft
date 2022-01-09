package net.viap.viapcraft.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.viap.viapcraft.Viapcraft;
import net.viap.viapcraft.armour.*;
import net.viap.viapcraft.blocks.NavigatorBlock;
import net.viap.viapcraft.crops.ItemCocaSeed;
import net.viap.viapcraft.food.CocaLeafFoodComponent;
import net.viap.viapcraft.food.CocaineFoodComponent;
import net.viap.viapcraft.food.LSDFoodComponent;
import net.viap.viapcraft.food.MarijuanaFoodComponent;
import net.viap.viapcraft.stairs.ModStairsBlock;
import net.viap.viapcraft.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// Here we add all items we want in the game
public class ModItems {

    // ITEMS:
    // Where in the create menu to add the item, in this case - our own made general item group
    public static final Item DARK_RUBY = registerItem("dark_ruby", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item CRYSTALIZED_DARK_RUBY = registerItem("crystalized_dark_ruby", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item THORIUM_INGOT = registerItem("thorium_ingot", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item LIQUID_IRON = registerItem("liquid_iron", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item JADE = registerItem("jade", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item REFINED_URANIUM = registerItem("refined_uranium", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings().group(ItemGroup.MISC)));

    // FOODS:
    public static final Item LSD = registerItem("lsd", new Item(new Item.Settings().group(ItemGroup.FOOD).food(LSDFoodComponent.LSD)));
    public static final Item MARIJUANA = registerItem("marijuana", new Item(new Item.Settings().group(ItemGroup.FOOD).food(MarijuanaFoodComponent.MARIJUANA)));
    public static final Item COCAINE = registerItem("cocaine", new Item(new Item.Settings().group(ItemGroup.FOOD).food(CocaineFoodComponent.COCAINE)));
    public static final Item COCA_LEAF = registerItem("coca_leaf", new Item(new Item.Settings().group(ItemGroup.FOOD).food(CocaLeafFoodComponent.COCA_LEAF)));

    // Crops
    public static final Item COCA_SEED = registerItem("coca_seed", new ItemCocaSeed(ModBlocks.COCA_PLANT, (new Item.Settings().group(ItemGroup.FOOD))));

    // TOOLS:
    public static final Item DARK_RUBY_PICKAXE = registerItem("dark_ruby_pickaxe", new PickaxeBase(new PickaxeToolMaterialDarkRuby()));
    public static final Item DARK_RUBY_AXE = registerItem("dark_ruby_axe", new AxeBase(new AxeToolMaterialDarkRuby()));
    public static final Item DARK_RUBY_SHOVEL = registerItem("dark_ruby_shovel", new ShovelBase(new ShovelToolMaterialDarkRuby()));
    public static final Item DARK_RUBY_SWORD = registerItem("dark_ruby_sword", new WeaponBase(new SwordToolMaterialDarkRuby()));
    public static final Item DARK_RUBY_HOE = registerItem("dark_ruby_hoe", new HoeBase(new HoeToolMaterialDarkRuby()));

    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterial.STEEL, 2, 1f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterial.STEEL, 1, 1.4f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new ModPickaxeItem(ModToolMaterial.STEEL, 1, 1.5f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item STEEL_AXE = registerItem("steel_axe", new ModAxeItem(ModToolMaterial.STEEL, 1, 1.1f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new ModHoeItem(ModToolMaterial.STEEL, 0, 1f, new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item THORIUM_SWORD = registerItem("thorium_sword", new SwordItem(ModToolMaterial.THORIUM, 3, .8f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item THORIUM_SHOVEL = registerItem("thorium_shovel", new ShovelItem(ModToolMaterial.THORIUM, 1, 1.4f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item THORIUM_PICKAXE = registerItem("thorium_pickaxe", new ModPickaxeItem(ModToolMaterial.THORIUM, 2, 1.6f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item THORIUM_AXE = registerItem("thorium_axe",new ModAxeItem(ModToolMaterial.THORIUM, 3, 1.2f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item THORIUM_HOE = registerItem("thorium_hoe", new ModHoeItem(ModToolMaterial.THORIUM, 1, 1f, new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item MITHRIL_SWORD = registerItem("mithril_sword", new SwordItem(ModToolMaterial.MITHRIL, 3, .8f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel", new ShovelItem(ModToolMaterial.MITHRIL, 1, 1.4f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new ModPickaxeItem(ModToolMaterial.MITHRIL, 2, 1.6f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe", new ModAxeItem(ModToolMaterial.MITHRIL, 3, 1.2f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe", new ModHoeItem(ModToolMaterial.MITHRIL, 1, 1f, new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item STAFF_OF_MINERALS = registerItem("staff_of_minerals", new StaffOfMinerals(new Item.Settings().group(ItemGroup.TOOLS)));

    //public static final Item STONE_DAGGER = new WeaponBase(new DaggerBase(3, 100, 100, Items.COBBLESTONE));
    public static Item STONE_DAGGER = registerItem("stone_dagger", new SwordItem(new DaggerBase(3, 100, 100, Items.COBBLESTONE), 3, 3.5f, new Item.Settings().group(ItemGroup.TOOLS)));

    // Armor
    public static final Item MITHRIL_HELMET = registerItem("mithril_armor_helmet", new ModArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_armor_chestplate", new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_armor_leggings", new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_armor_boots", new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item TURTLE_CHESTPLATE = registerItem("turtle_armor_chestplate", new ArmorItem(ModArmorMaterial.TURTLE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TURTLE_LEGGINGS = registerItem("turtle_armor_leggings", new ArmorItem(ModArmorMaterial.TURTLE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TURTLE_BOOTS = registerItem("turtle_armor_boots", new ArmorItem(ModArmorMaterial.TURTLE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item DARK_RUBY_HELMET = registerItem("dark_ruby_armor_helmet", new ModArmorItem(ModArmorMaterial.DARK_RUBY, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item DARK_RUBY_CHESTPLATE = registerItem("dark_ruby_armor_chestplate", new ArmorItem(ModArmorMaterial.DARK_RUBY, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item DARK_RUBY_LEGGINGS = registerItem("dark_ruby_armor_leggings", new ArmorItem(ModArmorMaterial.DARK_RUBY, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item DARK_RUBY_BOOTS = registerItem("dark_ruby_armor_boots", new ArmorItem(ModArmorMaterial.DARK_RUBY, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Register the item to the game, needs to be called in main class Viapcraft
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering mod items for " + Viapcraft.MOD_ID);
    };
}
