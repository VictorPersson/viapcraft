package net.viap.vpc.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.viap.vpc.Viapcraft;
import net.viap.vpc.block.custom.ModBlocks;
import net.viap.vpc.potion.ModPotions;

public class ModItemGroup {

    /**
     * Creating a new item group to the Minecraft creative tab
     * Re name and copy this code in order to create new item groups
     */
    public static final ItemGroup VIAPCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Viapcraft.MOD_ID, "viapcraft_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.viapcraft_group"))
                    .icon(() -> new ItemStack(Items.TURTLE_HELMET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TURTLE_SKIN_CHESTPLATE);
                        entries.add(ModItems.TURTLE_SKIN_LEGGINGS);
                        entries.add(ModItems.TURTLE_SKIN_BOOTS);
                        entries.add(ModItems.TURTLE_SKIN);
                        entries.add(ModItems.RAW_NACRE);
                        entries.add(ModItems.NACRE);
                        entries.add(ModItems.FOSSILIZED_AMMOLITE);
                        entries.add(ModBlocks.FOSSILIZED_AMMOLITE_ORE);
                        entries.add(ModItems.FESTIS_KAKTUS);
                    }).build());
    public static void registerItemGroup() {}
}
