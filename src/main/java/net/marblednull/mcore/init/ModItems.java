package net.marblednull.mcore.init;

import net.marblednull.mcore.MarbledsCore;
import net.marblednull.mcore.util.McoreArmorMaterials;
import net.marblednull.mcore.util.McoreTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsCore.MODID);

    //items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SCRAP = ITEMS.register("steel_scrap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TITANIUM_SHEET = ITEMS.register("titanium_sheet", () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties().fireResistant()));

    //item blocks
    public static final RegistryObject<Item> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(ModBlocks.STEEL_BLOCK.get(), new Item.Properties()));
    //public static final RegistryObject<Item> STEEL_STAIRS = ITEMS.register("steel_stairs", () -> new BlockItem(ModBlocks.STEEL_STAIRS.get(), new Item.Properties()));
    //public static final RegistryObject<Item> STEEL_SLAB = ITEMS.register("steel_slab", () -> new BlockItem(ModBlocks.STEEL_SLAB.get(), new Item.Properties()));
    //public static final RegistryObject<Item> CUT_STEEL_BLOCK = ITEMS.register("cut_steel_block", () -> new BlockItem(ModBlocks.CUT_STEEL_BLOCK.get(), new Item.Properties()));
    //public static final RegistryObject<Item> CUT_STEEL_STAIRS = ITEMS.register("cut_steel_stairs", () -> new BlockItem(ModBlocks.CUT_STEEL_STAIRS.get(), new Item.Properties()));
    //public static final RegistryObject<Item> CUT_STEEL_SLAB = ITEMS.register("cut_steel_slab", () -> new BlockItem(ModBlocks.CUT_STEEL_SLAB.get(), new Item.Properties()));
    //public static final RegistryObject<Item> VERTICAL_CUT_STEEL_BLOCK = ITEMS.register("vertical_cut_steel_block", () -> new BlockItem(ModBlocks.VERTICAL_CUT_STEEL_BLOCK.get(), new Item.Properties()));
    //public static final RegistryObject<Item> VERTICAL_CUT_STEEL_STAIRS = ITEMS.register("vertical_cut_steel_stairs", () -> new BlockItem(ModBlocks.VERTICAL_CUT_STEEL_STAIRS.get(), new Item.Properties()));
    //public static final RegistryObject<Item> VERTICAL_CUT_STEEL_SLAB = ITEMS.register("vertical_cut_steel_slab", () -> new BlockItem(ModBlocks.VERTICAL_CUT_STEEL_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_BLOCK = ITEMS.register("titanium_block", () -> new BlockItem(ModBlocks.TITANIUM_BLOCK.get(), new Item.Properties().fireResistant()));
    //public static final RegistryObject<Item> TITANIUM_STAIRS = ITEMS.register("titanium_stairs", () -> new BlockItem(ModBlocks.TITANIUM_STAIRS.get(), new Item.Properties().fireResistant()));
    //public static final RegistryObject<Item> TITANIUM_SLAB = ITEMS.register("titanium_slab", () -> new BlockItem(ModBlocks.TITANIUM_SLAB.get(), new Item.Properties().fireResistant()));
    //public static final RegistryObject<Item> CUT_TITANIUM_BLOCK = ITEMS.register("cut_titanium_block", () -> new BlockItem(ModBlocks.CUT_TITANIUM_BLOCK.get(), new Item.Properties().fireResistant()));
    //public static final RegistryObject<Item> CUT_TITANIUM_STAIRS = ITEMS.register("cut_titanium_stairs", () -> new BlockItem(ModBlocks.CUT_TITANIUM_STAIRS.get(), new Item.Properties().fireResistant()));
    //public static final RegistryObject<Item> CUT_TITANIUM_SLAB = ITEMS.register("cut_titanium_slab", () -> new BlockItem(ModBlocks.CUT_TITANIUM_SLAB.get(), new Item.Properties().fireResistant()));
    //public static final RegistryObject<Item> VERTICAL_CUT_TITANIUM_BLOCK = ITEMS.register("vertical_cut_titanium_block", () -> new BlockItem(ModBlocks.VERTICAL_CUT_TITANIUM_BLOCK.get(), new Item.Properties().fireResistant()));
    //public static final RegistryObject<Item> VERTICAL_CUT_TITANIUM_STAIRS = ITEMS.register("vertical_cut_titanium_stairs", () -> new BlockItem(ModBlocks.VERTICAL_CUT_TITANIUM_STAIRS.get(), new Item.Properties().fireResistant()));
    //public static final RegistryObject<Item> VERTICAL_CUT_TITANIUM_SLAB = ITEMS.register("vertical_cut_titanium_slab", () -> new BlockItem(ModBlocks.VERTICAL_CUT_TITANIUM_SLAB.get(), new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DEEPSLATE_TITANIUM_ORE = ITEMS.register("deepslate_titanium_ore", () -> new BlockItem(ModBlocks.DEEPLSATE_TITANIUM_ORE.get(), new Item.Properties().fireResistant()));

    //tools & weapons
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(McoreTiers.STEEL, 1, -2.4F, new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(McoreTiers.STEEL, -2, -2.8F, new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(McoreTiers.STEEL, 4, -3.1f, new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(McoreTiers.STEEL, -0.5f, -3, new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(McoreTiers.STEEL, -4, -1, new Item.Properties().durability(1561)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new SwordItem(McoreTiers.TITANIUM, 4, -2.4F, new Item.Properties().fireResistant().durability(250)));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(McoreTiers.TITANIUM, 2, -2.8F, new Item.Properties().fireResistant().durability(250)));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(McoreTiers.TITANIUM, 6, -3f, new Item.Properties().fireResistant().durability(250)));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new ShovelItem(McoreTiers.TITANIUM, -2.5f, -3, new Item.Properties().fireResistant().durability(250)));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new HoeItem(McoreTiers.TITANIUM, -2, 0, new Item.Properties().fireResistant().durability(250)));

    //armor sets
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(McoreArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(McoreArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(McoreArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(McoreArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet", () -> new ArmorItem(McoreArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", () -> new ArmorItem(McoreArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", () -> new ArmorItem(McoreArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots", () -> new ArmorItem(McoreArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
