package net.viap.vpc;

import net.fabricmc.api.ModInitializer;

import net.viap.vpc.block.custom.ModBlocks;
import net.viap.vpc.enchantment.ModEnchantment;
import net.viap.vpc.item.ModItemGroup;
import net.viap.vpc.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Viapcraft implements ModInitializer {
	public static final String MOD_ID = "vpc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEnchantment.registerModEnchantment();
		LOGGER.info("STARTING MOD ENVIRONMENT");
		LOGGER.info("Viapcraft loaded!");
	}
}