package net.marblednull.mcore.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab TABS = new CreativeModeTab("mcore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEEL_BLOCK.get());
        }
    };
}
