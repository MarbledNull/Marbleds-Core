package net.marblednull.mcore.materials;

import net.marblednull.mcore.MarbledsCore;
import net.marblednull.mcore.init.ModItems;
import net.marblednull.mcore.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class McoreTiers {

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 9f, 4f, 14,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(MarbledsCore.MODID, "steel"), List.of(Tiers.IRON), List.of());

    public static final Tier TITANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 250, 6f, 2f, 14,
                    ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
            new ResourceLocation(MarbledsCore.MODID, "titanium"), List.of(Tiers.IRON), List.of());
}
