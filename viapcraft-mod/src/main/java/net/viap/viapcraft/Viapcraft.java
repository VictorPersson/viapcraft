package net.viap.viapcraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.viap.viapcraft.registry.ModBlocks;
import net.viap.viapcraft.registry.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Viapcraft implements ModInitializer {

	public static final String MOD_ID = "viapcraft";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("modid");

	// "Simple" way of making a item group for your mod. Can be made more advanced.
	/*
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			// Setting the path to the new tab, where it gets its name. Below, which icon tab should have
			new Identifier(MOD_ID, "general_item_group_name"),
			() -> new ItemStack(ModItems.DARK_RUBY)
	);
*/
	// More advanced way of making an item group, custom icon vanilla/mod items.
	public static final ItemGroup ADVANCED_GROUP = FabricItemGroupBuilder.create(
					new Identifier(MOD_ID, "advanced_item_group_name"))
			.icon(() -> new ItemStack(ModItems.LSD))
			.appendItems(stacks -> {
				// This way items will come in the order you list them.
				stacks.add(new ItemStack(ModItems.DARK_RUBY));
				stacks.add(new ItemStack(ModItems.CRYSTALIZED_DARK_RUBY));
				stacks.add(new ItemStack(ModBlocks.DARK_RUBY_BLOCK));
				stacks.add(new ItemStack(ModBlocks.DARK_RUBY_ORE));
				stacks.add(new ItemStack(ModBlocks.THORIUM_ORE));
				stacks.add(new ItemStack(ModItems.THORIUM_INGOT));
				stacks.add(new ItemStack(ModBlocks.MITHRIL_ORE));
				stacks.add(new ItemStack(ModItems.MITHRIL_INGOT));
				stacks.add(new ItemStack(ModItems.LSD));
				stacks.add(new ItemStack(ModItems.COCAINE));
				stacks.add(new ItemStack(ModItems.MARIJUANA));
				stacks.add(new ItemStack(ModItems.DARK_RUBY_PICKAXE));
				stacks.add(new ItemStack(ModItems.DARK_RUBY_AXE));
				stacks.add(new ItemStack(ModItems.DARK_RUBY_SHOVEL));
				stacks.add(new ItemStack(ModItems.DARK_RUBY_SWORD));
				stacks.add(new ItemStack(ModItems.DARK_RUBY_HOE));
				stacks.add(new ItemStack(ModItems.COCA_LEAF));
				stacks.add(new ItemStack(ModBlocks.COCA_PLANT));
				stacks.add(new ItemStack(ModItems.COCA_SEED));
				stacks.add(new ItemStack(ModItems.LIQUID_IRON));
				stacks.add(new ItemStack(ModItems.STEEL_INGOT));
				stacks.add(new ItemStack(ModItems.STEEL_AXE));
				stacks.add(new ItemStack(ModItems.STEEL_HOE));
				stacks.add(new ItemStack(ModItems.STEEL_PICKAXE));
				stacks.add(new ItemStack(ModItems.STEEL_SHOVEL));
				stacks.add(new ItemStack(ModItems.STEEL_SWORD));
				stacks.add(new ItemStack(ModItems.JADE));
				stacks.add(new ItemStack(ModItems.STAFF_OF_MINERALS));
				stacks.add(new ItemStack(ModItems.REFINED_URANIUM));
				stacks.add(new ItemStack(ModItems.THORIUM_PICKAXE));
				stacks.add(new ItemStack(ModItems.THORIUM_AXE));
				stacks.add(new ItemStack(ModItems.THORIUM_SHOVEL));
				stacks.add(new ItemStack(ModItems.THORIUM_SWORD));
				stacks.add(new ItemStack(ModItems.THORIUM_HOE));
				stacks.add(new ItemStack(ModItems.MITHRIL_PICKAXE));
				stacks.add(new ItemStack(ModItems.MITHRIL_AXE));
				stacks.add(new ItemStack(ModItems.MITHRIL_SHOVEL));
				stacks.add(new ItemStack(ModItems.MITHRIL_SWORD));
				stacks.add(new ItemStack(ModItems.MITHRIL_HOE));
			}).build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerItems();
		ModBlocks.registerBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}
