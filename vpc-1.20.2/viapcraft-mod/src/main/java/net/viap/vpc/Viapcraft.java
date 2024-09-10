package net.viap.vpc;

import net.fabricmc.api.ModInitializer;

import net.viap.vpc.block.custom.ModBlocks;
import net.viap.vpc.enchantment.ModEnchantment;
import net.viap.vpc.item.ModItemGroup;
import net.viap.vpc.item.ModItems;
import net.viap.vpc.paintings.ModPaintings;
import net.viap.vpc.potion.ModPotions;
import net.viap.vpc.util.ModLootTableModifiers;
import net.viap.vpc.util.ModRegistries;
import net.viap.vpc.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.viap.vpc.villagers.ModVillagers;

public class Viapcraft implements ModInitializer {
	public static final String MOD_ID = "vpc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEnchantment.registerModEnchantment();
		ModLootTableModifiers.modifyLootTable();
		ModPotions.registerPotions();
		ModPaintings.registerPaintings();
		ModRegistries.registerModStuff();
		ModVillagers.registerVillagers();
		ModWorldGeneration.generateModWorldGeneration();
		LOGGER.info("STARTING MOD ENVIRONMENT");
		LOGGER.info("Viapcraft loaded!");
	}
}