package net.marblednull.mcore.init;

import net.marblednull.mcore.MarbledsCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarbledsCore.MODID);

    public static final RegistryObject<CreativeModeTab> MCORE = TABS.register("mcore",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mcore"))
                    .icon(() -> new ItemStack(ModBlocks.STEEL_BLOCK.get()))
                    .displayItems((displayParameters, pOutput) -> {

                        //Blocks
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());

                        //Items
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.STEEL_NUGGET.get());
                        pOutput.accept(ModItems.STEEL_SHEET.get());
                        pOutput.accept(ModItems.STEEL_SCRAP.get());

                        //Tools & Armor
                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
