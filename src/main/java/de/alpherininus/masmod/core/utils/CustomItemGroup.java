package de.alpherininus.masmod.core.utils;

import de.alpherininus.masmod.Masmod;
import de.alpherininus.masmod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CustomItemGroup extends ItemGroup {

    public static final CustomItemGroup ITEM_GROUP_ITEM = new CustomItemGroup(ItemGroup.GROUPS.length, Masmod.MOD_ID + "." + "moditems");

    public CustomItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.MASMOD_GROUP_ICON_ITEMS.get());
    }

    @Override
    public boolean hasScrollbar() {
        return true;
    }
}
