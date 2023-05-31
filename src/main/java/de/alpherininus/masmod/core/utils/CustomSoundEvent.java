package de.alpherininus.masmod.core.utils;

import de.alpherininus.masmod.Masmod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomSoundEvent {

    public static final DeferredRegister<SoundEvent> CUSTOM_SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Masmod.MOD_ID);

    public static final RegistryObject<SoundEvent> GLOWSTONE_SOUND = registerCustomSoundEvent("glowstone_sound");
    public static final RegistryObject<SoundEvent> BREAK_GLOWSTONE_SOUND = registerCustomSoundEvent("break_glowstone_sound");
    public static final RegistryObject<SoundEvent> STEP_GLOWSTONE_SOUND = registerCustomSoundEvent("step_glowstone_sound");


    private static RegistryObject<SoundEvent> registerCustomSoundEvent(String name) {
        return CUSTOM_SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Masmod.MOD_ID, "custom/" + name)));
    }
    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return CUSTOM_SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Masmod.MOD_ID, name)));
    }

    public static void register(IEventBus bus) {
        CUSTOM_SOUND_EVENTS.register(bus);
    }
}
