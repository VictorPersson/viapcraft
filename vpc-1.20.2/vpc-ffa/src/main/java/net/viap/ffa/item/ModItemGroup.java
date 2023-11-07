package net.viap.ffa.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.viap.ffa.FFA;

public class ModItemGroup {

    /**
     * Creating a new item group to the Minecraft creative tab
     * Re name and copy this code in order to create new item groups
     */
    public static final ItemGroup FLORA_FAUNA_ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FFA.MOD_ID, "flora_fauna_armor_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.flora_fauna_armor_group"))
                    .icon(() -> new ItemStack(Items.TURTLE_HELMET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TURTLE_SKIN_CHESTPLATE);
                        entries.add(ModItems.TURTLE_SKIN_LEGGINGS);
                        entries.add(ModItems.TURTLE_SKIN_BOOTS);
                        entries.add(ModItems.TURTLE_SKIN);

                    }).build());
    public static void registerItemGroup() {}
}
