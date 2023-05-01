package de.alpherininus.masmod.core.utils.materials;

import de.alpherininus.masmod.core.init.ItemInit;
import de.alpherininus.masmod.core.utils.materials.blocktier.BlockToolLevel;
import de.alpherininus.masmod.core.utils.materials.itemtier.ItemDurability;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum CustomToolMaterial implements IItemTier {

    MATERIAL_WOOD_TOOL(BlockToolLevel.getWoodAndGold(), ItemDurability.getGold(), 4f, 0f, 15, ()-> Ingredient.fromItems(ItemInit.GEM_ITEM.get())),
    MATERIAL_GOLD_TOOL(BlockToolLevel.getWoodAndGold(), ItemDurability.getWood(), 4f, 0f, 22, ()-> Ingredient.fromItems(ItemInit.GEM_ITEM.get())),
    MATERIAL_STONE_TOOL(BlockToolLevel.getStone(), ItemDurability.getStone(), 8f, 0f, 5, ()-> Ingredient.fromItems(ItemInit.GEM_ITEM.get())),
    MATERIAL_IRON_TOOL(BlockToolLevel.getIron(), ItemDurability.getIron(), 12f, 0f, 14, ()-> Ingredient.fromItems(ItemInit.GEM_ITEM.get())),
    MATERIAL_DIAMOND_TOOL(BlockToolLevel.getDiamond(), ItemDurability.getDiamond(), 16f, 0f, 10, ()-> Ingredient.fromItems(ItemInit.GEM_ITEM.get())),
    MATERIAL_NETHERITE_TOOL(BlockToolLevel.getNetherite(), ItemDurability.getNetherite(), 20f, 0f, 15, ()-> Ingredient.fromItems(ItemInit.GEM_ITEM.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    CustomToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial.get();
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }
}
