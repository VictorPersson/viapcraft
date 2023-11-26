package net.viap.vpc.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.viap.vpc.item.ModItems;
import net.viap.vpc.mixin.BrewingRecipeRegistryMixin;
import net.viap.vpc.potion.ModPotions;
import net.viap.vpc.villagers.ModVillagers;

public class ModRegistries {
    public static void registerModStuff() {
        registerCustomerTrades();
    }

    // Registering the new potion brew recipe, saying what we need and what effect it will produce: awkward potion + sapphire
    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.STRONG_REGENERATION, Items.CACTUS, ModPotions.FESTIS_KAKTUS);
    }

    // How to add custom trading setups for existing villagers
    private static void registerCustomerTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(Items.BAT_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 25),
                    new ItemStack(Items.FOX_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(Items.POLAR_BEAR_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 35),
                    new ItemStack(Items.CAMEL_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(Items.TURTLE_EGG, 1), 12, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 35),
                    new ItemStack(Items.LLAMA_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(Items.GOAT_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 45),
                    new ItemStack(Items.PARROT_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 40),
                    new ItemStack(Items.DOLPHIN_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 55),
                    new ItemStack(Items.FROGSPAWN, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 50),
                    new ItemStack(Items.AXOLOTL_BUCKET, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 40),
                    new ItemStack(Items.PANDA_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 60),
                    new ItemStack(Items.CAT_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_ANIMAL_TRADER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 64),
                    new ItemStack(Items.OCELOT_SPAWN_EGG, 1), 4, 2, 0.02f));
        });
    }
}
