package net.marblednull.mcore.worldgen;

import net.marblednull.mcore.MarbledsCore;
import net.marblednull.mcore.worldgen.gen.OreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MarbledsCore.MODID)

public class McoreWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        OreGeneration.generateOres(event);
    }
}
