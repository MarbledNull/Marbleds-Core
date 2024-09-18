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

                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        //pOutput.accept(ModBlocks.STEEL_STAIRS.get());
                        //pOutput.accept(ModBlocks.STEEL_SLAB.get());
                        //pOutput.accept(ModBlocks.CUT_STEEL_BLOCK.get());
                        //pOutput.accept(ModBlocks.CUT_STEEL_STAIRS.get());
                        //pOutput.accept(ModBlocks.CUT_STEEL_SLAB.get());
                        //pOutput.accept(ModBlocks.VERTICAL_CUT_STEEL_BLOCK.get());
                        //pOutput.accept(ModBlocks.VERTICAL_CUT_STEEL_STAIRS.get());
                        //pOutput.accept(ModBlocks.VERTICAL_CUT_STEEL_SLAB.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.STEEL_NUGGET.get());
                        pOutput.accept(ModItems.STEEL_SHEET.get());
                        pOutput.accept(ModItems.STEEL_SCRAP.get());

                        pOutput.accept(ModBlocks.DEEPLSATE_TITANIUM_ORE.get());
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                        //pOutput.accept(ModBlocks.CUT_TITANIUM_BLOCK.get());
                        pOutput.accept(ModItems.TITANIUM_INGOT.get());
                        pOutput.accept(ModItems.TITANIUM_NUGGET.get());
                        pOutput.accept(ModItems.RAW_TITANIUM.get());

                        pOutput.accept(ModItems.STEEL_SWORD.get());
                        pOutput.accept(ModItems.STEEL_PICKAXE.get());
                        pOutput.accept(ModItems.STEEL_AXE.get());
                        pOutput.accept(ModItems.STEEL_SHOVEL.get());
                        pOutput.accept(ModItems.STEEL_HOE.get());
                        pOutput.accept(ModItems.TITANIUM_SWORD.get());
                        pOutput.accept(ModItems.TITANIUM_PICKAXE.get());
                        pOutput.accept(ModItems.TITANIUM_AXE.get());
                        pOutput.accept(ModItems.TITANIUM_SHOVEL.get());
                        pOutput.accept(ModItems.TITANIUM_HOE.get());
                        pOutput.accept(ModItems.STEEL_HELMET.get());
                        pOutput.accept(ModItems.STEEL_CHESTPLATE.get());
                        pOutput.accept(ModItems.STEEL_LEGGINGS.get());
                        pOutput.accept(ModItems.STEEL_BOOTS.get());
                        pOutput.accept(ModItems.TITANIUM_HELMET.get());
                        pOutput.accept(ModItems.TITANIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.TITANIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.TITANIUM_BOOTS.get());
                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
