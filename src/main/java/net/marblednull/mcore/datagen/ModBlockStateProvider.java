package net.marblednull.mcore.datagen;

import net.marblednull.mcore.MarbledsCore;
import net.marblednull.mcore.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MarbledsCore.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /*blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);

        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_STONE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);
        */

        //stairsBlock(((StairBlock) ModBlocks.STEEL_STAIRS.get()),blockTexture(ModBlocks.STEEL_BLOCK.get()));
        //slabBlock(((SlabBlock) ModBlocks.STEEL_SLAB.get()),blockTexture(ModBlocks.STEEL_BLOCK.get()), blockTexture(ModBlocks.STEEL_BLOCK.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
