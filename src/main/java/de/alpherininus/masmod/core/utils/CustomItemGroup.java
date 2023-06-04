package de.alpherininus.masmod.core.utils;

import de.alpherininus.masmod.Masmod;
import de.alpherininus.masmod.core.init.ItemInit;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CustomItemGroup extends ItemGroup {

    private static final Minecraft mc = Minecraft.getInstance();

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

    @Override
    public ItemGroup setNoTitle() {
        return super.setNoTitle();
    }

    @OnlyIn(Dist.CLIENT)
    public net.minecraft.util.ResourceLocation getBackgroundImage() {
        if (hasSearchBar()) {
            this.setNoTitle();
            return new ResourceLocation(Masmod.MOD_ID, "textures/gui/container/masmod_search.png");
        } else {
            return new ResourceLocation(Masmod.MOD_ID, "textures/gui/container/masmod_items.png");
        }

    }

}
