package de.alpherininus.masmod.client.events;

import de.alpherininus.masmod.Masmod;
import de.alpherininus.masmod.core.init.KeybindsInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Masmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBus {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        KeybindsInit.register(event);
    }
}
