package de.alpherininus.masmod;

import de.alpherininus.masmod.core.init.*;
import de.alpherininus.masmod.core.init.vanilla.VBlockInit;
import de.alpherininus.masmod.core.utils.CustomItemGroup;
import de.alpherininus.masmod.core.utils.CustomSoundEvent;
import de.alpherininus.masmod.core.utils.MasmodConfig;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

@Mod("masmod")
@Mod.EventBusSubscriber(modid = Masmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class Masmod {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Minecraft mc = Minecraft.getInstance();
    public static final String MOD_ID = "masmod";

    public Masmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEM_REGISTER.register(bus);
        BlockInit.BLOCK_REGISTER.register(bus);
        VBlockInit.VANILLA_BLOCK_REGISTER.register(bus);

        CustomSoundEvent.CUSTOM_SOUND_EVENTS.register(bus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeartureInit::addOres);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MasmodConfig.CUSTOMGUI.COMMON_SPEC_CUSTOMGUI, "basmod/creative_tab-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MasmodConfig.KEYSETTINGS.COMMON_SPEC_KEYSETTINGS, "basmod/key_settings-common.toml");


        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCK_REGISTER.getEntries().stream().map(RegistryObject::get).forEach(block ->
                event.getRegistry().register(new BlockItem(block, new Item.Properties()
                        .group(CustomItemGroup.ITEM_GROUP_ITEM))
                        .setRegistryName(Objects.requireNonNull(block.getRegistryName()))));

        VBlockInit.VANILLA_BLOCK_REGISTER.getEntries().stream().map(RegistryObject::get).forEach(block ->
                event.getRegistry().register(new BlockItem(block, new Item.Properties()
                        .group(ItemGroup.BUILDING_BLOCKS))
                        .setRegistryName(Objects.requireNonNull(block.getRegistryName()))));
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        loadStuff();
    }

    private void loadStuff() {
        mc.getMainWindow().setWindowTitle("Magic and Stuff Mod" + " " + mc.getVersion());

    }



}
