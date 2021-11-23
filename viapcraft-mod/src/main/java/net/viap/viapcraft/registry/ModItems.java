package net.viap.viapcraft.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.viap.viapcraft.Viapcraft;
import net.viap.viapcraft.armour.ArmorBase;
import net.viap.viapcraft.armour.DarkRubyArmorMaterial;
import net.viap.viapcraft.armour.TurtleArmorMaterial;
import net.viap.viapcraft.crops.ItemCocaSeed;
import net.viap.viapcraft.food.CocaLeafFoodComponent;
import net.viap.viapcraft.food.CocaineFoodComponent;
import net.viap.viapcraft.food.LSDFoodComponent;
import net.viap.viapcraft.food.MarijuanaFoodComponent;
import net.viap.viapcraft.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// Here we add all items we want in the game
public class ModItems {

    // ITEMS:
    // Where in the create menu to add the item, in this case - our own made general item group
    public static final Item DARK_RUBY = new Item(new Item.Settings());
    public static final Item CRYSTALIZED_DARK_RUBY = new Item(new Item.Settings());
    public static final Item THORIUM_INGOT = new Item(new Item.Settings());
    public static final Item MITHRIL_INGOT = new Item(new Item.Settings());
    public static final Item LIQUID_IRON = new Item(new Item.Settings());
    public static final Item STEEL_INGOT = new Item(new Item.Settings());
    public static final Item JADE = new Item(new Item.Settings());
    public static final Item STAFF_OF_MINERALS = new StaffOfMinerals(new Item.Settings());
    public static final Item REFINED_URANIUM = new Item(new Item.Settings());

    // BLOCK ITEMS:
    public static final BlockItem DARK_RUBY_BLOCK = new BlockItem(ModBlocks.DARK_RUBY_BLOCK, new Item.Settings());
    public static final BlockItem DARK_RUBY_ORE = new BlockItem(ModBlocks.DARK_RUBY_ORE, new Item.Settings());
    public static final BlockItem THORIUM_ORE = new BlockItem(ModBlocks.THORIUM_ORE, new Item.Settings());
    public static final BlockItem MITHRIL_ORE = new BlockItem(ModBlocks.MITHRIL_ORE, new Item.Settings());

    // FOODS:
    public static final Item LSD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(LSDFoodComponent.LSD));
    public static final Item MARIJUANA = new Item(new Item.Settings().group(ItemGroup.FOOD).food(MarijuanaFoodComponent.MARIJUANA));
    public static final Item COCAINE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(CocaineFoodComponent.COCAINE));
    public static final Item COCA_LEAF = new Item(new Item.Settings().group(ItemGroup.FOOD).food(CocaLeafFoodComponent.COCA_LEAF));

    // Crops
    public static final Item COCA_SEED = new ItemCocaSeed(ModBlocks.COCA_PLANT, (new Item.Settings()));

    // TOOLS:
    public static final Item DARK_RUBY_PICKAXE = new PickaxeBase(new PickaxeToolMaterialDarkRuby());
    public static final Item DARK_RUBY_AXE = new AxeBase(new AxeToolMaterialDarkRuby());
    public static final Item DARK_RUBY_SHOVEL = new ShovelBase(new ShovelToolMaterialDarkRuby());
    public static final Item DARK_RUBY_SWORD = new WeaponBase(new SwordToolMaterialDarkRuby());
    public static final Item DARK_RUBY_HOE = new HoeBase(new HoeToolMaterialDarkRuby());

    public static final Item STEEL_SWORD = new SwordItem(ModToolMaterial.STEEL, 2, 1f, new FabricItemSettings());
    public static final Item STEEL_SHOVEL = new ShovelItem(ModToolMaterial.STEEL, 1, 1.4f, new FabricItemSettings());
    public static final Item STEEL_PICKAXE = new ModPickaxeItem(ModToolMaterial.STEEL, 1, 1.5f, new FabricItemSettings());
    public static final Item STEEL_AXE = new ModAxeItem(ModToolMaterial.STEEL, 1, 1.1f, new FabricItemSettings());
    public static final Item STEEL_HOE = new ModHoeItem(ModToolMaterial.STEEL, 0, 1f, new FabricItemSettings());

    public static final Item THORIUM_SWORD = new SwordItem(ModToolMaterial.THORIUM, 3, .8f, new FabricItemSettings());
    public static final Item THORIUM_SHOVEL = new ShovelItem(ModToolMaterial.THORIUM, 1, 1.4f, new FabricItemSettings());
    public static final Item THORIUM_PICKAXE = new ModPickaxeItem(ModToolMaterial.THORIUM, 2, 1.6f, new FabricItemSettings());
    public static final Item THORIUM_AXE = new ModAxeItem(ModToolMaterial.THORIUM, 3, 1.2f, new FabricItemSettings());
    public static final Item THORIUM_HOE = new ModHoeItem(ModToolMaterial.THORIUM, 1, 1f, new FabricItemSettings());

    public static final Item MITHRIL_SWORD = new SwordItem(ModToolMaterial.MITHRIL, 3, .8f, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item MITHRIL_SHOVEL = new ShovelItem(ModToolMaterial.MITHRIL, 1, 1.4f, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item MITHRIL_PICKAXE = new ModPickaxeItem(ModToolMaterial.MITHRIL, 2, 1.6f, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item MITHRIL_AXE = new ModAxeItem(ModToolMaterial.MITHRIL, 3, 1.2f, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item MITHRIL_HOE = new ModHoeItem(ModToolMaterial.MITHRIL, 1, 1f, new FabricItemSettings().group(ItemGroup.TOOLS));

    //public static final Item STONE_DAGGER = new WeaponBase(new DaggerBase(3, 100, 100, Items.COBBLESTONE));

    public static Item STONE_DAGGER = new SwordItem(new DaggerBase(3, 100, 100, Items.COBBLESTONE), 3, 3.5f, new Item.Settings().group(ItemGroup.TOOLS));

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
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_ingot"), THORIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_ore"), MITHRIL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_ingot"), MITHRIL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "lsd"), LSD);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "marijuana"), MARIJUANA);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "cocaine"), COCAINE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "coca_seed"), COCA_SEED);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "coca_leaf_food"), COCA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_armor_helmet"), new ArmorBase(DARK_RUBY_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_armor_chest"), new ArmorBase(DARK_RUBY_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_armor_legs"), new ArmorBase(DARK_RUBY_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "dark_ruby_armor_feet"), new ArmorBase(DARK_RUBY_ARMOR, EquipmentSlot.FEET));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "turtle_armor_chest"), new ArmorBase(TURTLE_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "turtle_armor_legs"), new ArmorBase(TURTLE_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "turtle_armor_feet"), new ArmorBase(TURTLE_ARMOR, EquipmentSlot.FEET));
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "stone_dagger"), STONE_DAGGER);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "liquid_iron"), LIQUID_IRON);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "staff_of_minerals"), STAFF_OF_MINERALS);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "jade"), JADE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "refined_uranium"), REFINED_URANIUM);
        FuelRegistry.INSTANCE.add(REFINED_URANIUM, 500);

        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "steel_sword"), STEEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "steel_shovel"), STEEL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "steel_axe"), STEEL_AXE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "steel_hoe"), STEEL_HOE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "steel_pickaxe"), STEEL_PICKAXE);

        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_sword"), THORIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_shovel"), THORIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_axe"), THORIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_hoe"), THORIUM_HOE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "thorium_pickaxe"), THORIUM_PICKAXE);

        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_sword"), MITHRIL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_shovel"), MITHRIL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_axe"), MITHRIL_AXE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_hoe"), MITHRIL_HOE);
        Registry.register(Registry.ITEM, new Identifier(Viapcraft.MOD_ID, "mithril_pickaxe"), MITHRIL_PICKAXE);
    }
}
