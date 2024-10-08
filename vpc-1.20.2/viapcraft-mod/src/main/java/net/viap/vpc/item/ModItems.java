package net.viap.vpc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.viap.vpc.Viapcraft;

public class ModItems {
    public static final Item TURTLE_SKIN = registerItem("turtle_skin",
            new Item(new FabricItemSettings()));
    public static final Item TURTLE_SKIN_CHESTPLATE = registerItem("turtle_skin_chestplate",
            new ModArmorItem(ModArmorMaterials.TURTLE_SKIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TURTLE_SKIN_LEGGINGS = registerItem("turtle_skin_leggings",
            new ArmorItem(ModArmorMaterials.TURTLE_SKIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TURTLE_SKIN_BOOTS = registerItem("turtle_skin_boots",
            new ArmorItem(ModArmorMaterials.TURTLE_SKIN, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RAW_NACRE = registerItem("raw_nacre",
            new Item(new FabricItemSettings()));
    public static final Item NACRE = registerItem("nacre",
            new Item(new FabricItemSettings()));
    public static final Item FOSSILIZED_AMMOLITE = registerItem("fossilized_ammolite",
            new Item(new FabricItemSettings()));
    public static final Item FESTIS_KAKTUS = registerItem("festis_kaktus",
            new Item(new FabricItemSettings().food(ModFoodComponents.FESTIS_KAKTUS)));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril",
            new Item(new FabricItemSettings()));
    public static final Item MITHRIL_BAR = registerItem("mithril_bar",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Viapcraft.MOD_ID, name), item);
    }
    private static void itemGroupIngredients(FabricItemGroupEntries entries) {

    }
    public static void registerModItems() {
        Viapcraft.LOGGER.info("Registering mod items for " + Viapcraft.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
