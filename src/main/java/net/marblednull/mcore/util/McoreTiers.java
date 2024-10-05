package net.marblednull.mcore.util;

import net.marblednull.mcore.init.ModItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class McoreTiers {
    public static final ForgeTier STEEL = new ForgeTier(3, 1561, 0.0f,
            4f, 14, McoreTags.Blocks.NEEDS_STEEL_TOOL,
            () -> Ingredient.of(ModItems.STEEL_INGOT.get()));

    public static final ForgeTier TITANIUM = new ForgeTier(3, 250, 0.0f,
            2f, 14, McoreTags.Blocks.NEEDS_TITANIUM_TOOL,
            () -> Ingredient.of(ModItems.TITANIUM_INGOT.get()));
}
