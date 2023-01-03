package de.alpherininus.masmod.core.init;

import de.alpherininus.masmod.Masmod;
import de.alpherininus.masmod.common.items.GemApple;
import de.alpherininus.masmod.common.items.MagicWand;
import de.alpherininus.masmod.core.utils.CustomItemGroup;
import de.alpherininus.masmod.core.utils.materials.CustomArmorMaterial;
import de.alpherininus.masmod.core.utils.materials.CustomToolMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Masmod.MOD_ID);

    public static final RegistryObject<Item> MASMOD_GROUP_ICON_ITEMS = ITEM_REGISTER.register("group_icon_items", ()-> new Item(new Item.Properties()));

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static final RegistryObject<Item> GEM_ITEM = ITEM_REGISTER.register("gem", ()-> new Item(new Item.Properties().group(CustomItemGroup.ITEM_GROUP_ITEM)));

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static final RegistryObject<Item> MAGIC_WAND = ITEM_REGISTER.register("magic_wand", ()-> new MagicWand(CustomToolMaterial.MATERIAL_NETHERITE_TOOL, 5, 4f,
            new Item.Properties().group(CustomItemGroup.ITEM_GROUP_ITEM)));

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static final RegistryObject<Item> MASMOD_BOOTS = ITEM_REGISTER.register("masmod_boots", ()-> new ArmorItem(CustomArmorMaterial.MASMOD_ARMOR, EquipmentSlotType.FEET,
            new Item.Properties().group(CustomItemGroup.ITEM_GROUP_ITEM)));

    public static final RegistryObject<Item> MASMOD_LEGGINGS = ITEM_REGISTER.register("masmod_leggings", ()-> new ArmorItem(CustomArmorMaterial.MASMOD_ARMOR, EquipmentSlotType.LEGS,
            new Item.Properties().group(CustomItemGroup.ITEM_GROUP_ITEM)));

    public static final RegistryObject<Item> MASMOD_CHESTPLATE = ITEM_REGISTER.register("masmod_chestplate", ()-> new ArmorItem(CustomArmorMaterial.MASMOD_ARMOR, EquipmentSlotType.CHEST,
            new Item.Properties().group(CustomItemGroup.ITEM_GROUP_ITEM)));

    public static final RegistryObject<Item> MASMOD_HELMET = ITEM_REGISTER.register("masmod_helmet", ()-> new ArmorItem(CustomArmorMaterial.MASMOD_ARMOR, EquipmentSlotType.HEAD,
            new Item.Properties().group(CustomItemGroup.ITEM_GROUP_ITEM)));

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static final RegistryObject<Item> GEM_APPLE = ITEM_REGISTER.register("gem_apple", ()-> new GemApple(new Item.Properties().food(new Food.Builder()
            .hunger(7).fastToEat().setAlwaysEdible().build()).group(CustomItemGroup.ITEM_GROUP_ITEM)));

    public static final RegistryObject<Item> GEM_BERRIES = ITEM_REGISTER.register("sweet_gem_berries", ()-> new Item(new Item.Properties().food(new Food.Builder()
            .hunger(3).fastToEat().setAlwaysEdible().build()).group(CustomItemGroup.ITEM_GROUP_ITEM)));

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
