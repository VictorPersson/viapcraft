package net.viap.vpc.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGeneration() {
        // Sets the world to generate the ores/trees on creation. Important to do trees and structures last
        ModOreGeneration.generateOres();
    }
}
