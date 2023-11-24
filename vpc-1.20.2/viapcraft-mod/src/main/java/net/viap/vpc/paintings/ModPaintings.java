package net.viap.vpc.paintings;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.viap.vpc.Viapcraft;

public class ModPaintings {

    public static final PaintingVariant FELIX = registerPainting("felix", new PaintingVariant(32, 32));
    public static final PaintingVariant JONTE = registerPainting("jonte", new PaintingVariant(32, 32));
    public static final PaintingVariant VICTOR = registerPainting("victor", new PaintingVariant(32, 16));
    public static final PaintingVariant CATSMURF = registerPainting("catsmurf", new PaintingVariant(16, 32));
    public static final PaintingVariant SUMMER = registerPainting("summer", new PaintingVariant(16, 32));
    public static final PaintingVariant ADAM = registerPainting("pidde", new PaintingVariant(16, 32));
    public static final PaintingVariant PIDDE = registerPainting("adam", new PaintingVariant(16, 32));
    public static final PaintingVariant BEER = registerPainting("beer", new PaintingVariant(32, 16));
    public static final PaintingVariant POLI = registerPainting("poli", new PaintingVariant(48, 32));
    public static final PaintingVariant FIREDANCE = registerPainting("firedance", new PaintingVariant(32, 32));
    // Helper method to register future paintings
    public static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(Viapcraft.MOD_ID, name), paintingVariant);
    }
    public static void registerPaintings() {
        Viapcraft.LOGGER.info("Registering paintings");
    }
}