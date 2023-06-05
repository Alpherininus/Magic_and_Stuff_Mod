package de.alpherininus.masmod.core.init;

import de.alpherininus.masmod.Masmod;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.awt.event.KeyEvent;

@OnlyIn(Dist.CLIENT)
public class KeybindsInit {
    public static KeyBinding customKeyX;

    public static void register(final FMLClientSetupEvent event) {
        customKeyX = create("masmod_x_key", KeyEvent.VK_X);

        ClientRegistry.registerKeyBinding(customKeyX);

    }

    private static KeyBinding create(String name, int key) {
        return new KeyBinding("key." + Masmod.MOD_ID + "." + name, key, "key.category." + Masmod.MOD_ID);
    }
}
