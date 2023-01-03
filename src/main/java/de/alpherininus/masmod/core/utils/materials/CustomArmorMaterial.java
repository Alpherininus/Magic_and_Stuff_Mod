package de.alpherininus.masmod.core.utils.materials;

import de.alpherininus.masmod.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum CustomArmorMaterial implements IArmorMaterial {

    MASMOD_ARMOR("masmod_armor", 10, new int[] {4,7,9,4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 4f, 0.5f, ()-> Ingredient.fromItems(ItemInit.GEM_ITEM.get()));

    private static final int[] baseDurability = {128, 144, 160, 112};
    private final String name;
    private final int durabilityMultipier;
    private final int[] armorVal;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float tougness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    CustomArmorMaterial(String name, int durabilityMultipier, int[] armorVal, int enchantability, SoundEvent equipSound, float tougness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultipier = durabilityMultipier;
        this.armorVal = armorVal;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.tougness = tougness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient.get();
    }

    @Override
    public int getDurability(EquipmentSlotType slot) {
        return this.baseDurability[slot.getIndex()] * this.durabilityMultipier;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.armorVal[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.tougness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
