package net.marblednull.mcore.init;

import net.marblednull.mcore.MarbledsCore;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MarbledsCore.MODID);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK).destroyTime(5.0F).explosionResistance(6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE).mapColor(MapColor.METAL)));
    //public static final RegistryObject<Block> STEEL_STAIRS = registerBlock("steel_block", () ->
            //new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK).destroyTime(5.0F).explosionResistance(6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE).mapColor(MapColor.METAL)));
    //public static final RegistryObject<Block> STEEL_SLAB = registerBlock("steel_block", () ->
            //new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK).destroyTime(5.0F).explosionResistance(6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE).mapColor(MapColor.METAL)));
    //public static final RegistryObject<Block> CUT_STEEL_BLOCK = registerBlock("cut_steel_block", () ->
        //new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK).destroyTime(5.0F).explosionResistance(6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE).mapColor(MapColor.METAL)));

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK).destroyTime(5.0F).explosionResistance(6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE).mapColor(MapColor.METAL)));
    //public static final RegistryObject<Block> CUT_TITANIUM_BLOCK = registerBlock("cut_titanium_block", () ->
        //new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK).destroyTime(5.0F).explosionResistance(6.0F).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE).mapColor(MapColor.METAL)));
    public static final RegistryObject<Block> DEEPLSATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).sound(SoundType.DEEPSLATE).destroyTime(4.5F).explosionResistance(3.0F).requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
