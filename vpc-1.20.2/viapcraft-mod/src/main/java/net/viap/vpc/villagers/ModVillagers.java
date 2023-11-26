package net.viap.vpc.villagers;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.viap.vpc.Viapcraft;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> EXOTIC_ANIMAL_TRADER_POI_KEY = registerPoiKey("eatpoi");

    public static final PointOfInterestType EXOTIC_ANIMAL_TRADER_POI = registerPoi("eatpoi", Blocks.HAY_BLOCK);


    public static final VillagerProfession EXOTIC_ANIMAL_TRADER = registerProfession("exotic_animal_trader", EXOTIC_ANIMAL_TRADER_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(Viapcraft.MOD_ID, name),
                new VillagerProfession(name, entry -> true, entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_MASON));
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(Viapcraft.MOD_ID, name));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(Viapcraft.MOD_ID, name), 1, 1, block);
    }

    public static void registerVillagers() {
        Viapcraft.LOGGER.info("Registering Villagers for " + Viapcraft.MOD_ID);
    }
}