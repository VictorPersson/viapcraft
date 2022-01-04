package net.viap.viapcraft.utilities;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.viap.viapcraft.Viapcraft;

public class ModTags {

    public static class Blocks {

        public static final Tag<Block> VALUABLE_BLOCKS = createTag("valuable_blocks");

        private static Tag<Block> createTag(String name) {
            return TagRegistry.block(new Identifier(Viapcraft.MOD_ID, name));
        }
        private static Tag<Block> createCommonTag(String name) {
            return TagRegistry.block(new Identifier("c", name));
        }
    }

    public static class Items {

        public static final Tag<Item> GEMS = createCommonTag("gems");
        public static final Tag<Item> DARK_RUBY = createCommonTag("dark_ruby");

        private static Tag<Item> crateTag(String name) {
            return TagRegistry.item(new Identifier(Viapcraft.MOD_ID, name));
        }

        private static Tag<Item> createCommonTag(String name) {
            return TagRegistry.item(new Identifier("c", name));
        }


    }
}
