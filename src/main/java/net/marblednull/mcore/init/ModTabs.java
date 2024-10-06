package net.marblednull.mcore.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTabs {
    public static final ItemGroup TABS = new ItemGroup("mcore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEEL_BLOCK.get());
        }
    };
}
