package net.marblednull.mcore.util;

import net.marblednull.mcore.MarbledsCore;
import net.marblednull.mcore.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum McoreArmorMaterials implements IArmorMaterial {

    STEEL("steel", 33, new int[]{2, 6, 5, 2}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),

    TITANIUM("titanium", 15, new int[]{3, 6, 8, 3}, 10,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3f, 0.1f, () ->
            Ingredient.of(ModItems.TITANIUM_INGOT.get()));

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    McoreArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType equipmentSlot) {
        return BASE_DURABILITY[equipmentSlot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType equipmentSlot) {
        return this.slotProtections[(equipmentSlot.getIndex())];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MarbledsCore.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
