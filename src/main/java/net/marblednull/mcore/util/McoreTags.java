package net.marblednull.mcore.util;

import net.marblednull.mcore.MarbledsCore;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class McoreTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = tag("needs_titanium_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = tag("needs_steel_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MarbledsCore.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MarbledsCore.MODID, name));
        }
    }
}
