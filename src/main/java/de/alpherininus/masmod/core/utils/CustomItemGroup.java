package de.alpherininus.masmod.core.utils;

import de.alpherininus.masmod.Masmod;
import de.alpherininus.masmod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.config.ModConfig;

import java.awt.*;

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

    @Override
    public boolean hasSearchBar() {
        return MasmodConfig.CUSTOMGUI.config_search.get();
    }

    @OnlyIn(Dist.CLIENT)
    public net.minecraft.util.ResourceLocation getBackgroundImage() {
        if (hasSearchBar()) {
            return new ResourceLocation(Masmod.MOD_ID, "textures/gui/container/custom/masmod_search.png");
        } else {
            return new ResourceLocation(Masmod.MOD_ID, "textures/gui/container/custom/masmod.png");
        }
    }

}
