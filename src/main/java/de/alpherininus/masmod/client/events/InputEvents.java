package de.alpherininus.masmod.client.events;

import de.alpherininus.masmod.Masmod;
import de.alpherininus.masmod.core.init.KeybindsInit;
import de.alpherininus.masmod.core.utils.MasmodConfig;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Masmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class InputEvents {

    private static final Minecraft mc = Minecraft.getInstance();

    @SubscribeEvent
    public static void onKeyPress(InputEvent.KeyInputEvent event) {
        if (mc.world == null) return;
        onInput(event.getKey(), event.getAction());
    }

    @SubscribeEvent
    public static void onMouseClick(InputEvent.MouseInputEvent event) {
        if (mc.world == null) return;
        onInput(event.getButton(), event.getAction());
    }

    private static void onInput(int button, int action) {
        if (InputEvents.mc.currentScreen != null && KeybindsInit.customKeyX.isPressed()) {
            System.out.println("Is Key X Pressed LOL");

            assert InputEvents.mc.player != null;
            InputEvents.mc.player.setJumping(MasmodConfig.KEYSETTINGS.config_alredy_jump.get());

        }
    }


}
