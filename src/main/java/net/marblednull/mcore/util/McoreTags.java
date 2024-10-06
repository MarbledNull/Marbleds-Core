package net.marblednull.mcore.util;

import net.marblednull.mcore.MarbledsCore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class McoreTags {
    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> NEEDS_TITANIUM_TOOL = createTag("needs_titanium_tool");
        public static final Tags.IOptionalNamedTag<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");


        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(MarbledsCore.MODID, name));
        }
        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(MarbledsCore.MODID, name));
        }
        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
