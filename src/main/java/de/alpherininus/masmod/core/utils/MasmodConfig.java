package de.alpherininus.masmod.core.utils;

import net.minecraftforge.common.ForgeConfigSpec;

public class MasmodConfig {

    public static class CUSTOMGUI {
        public static final ForgeConfigSpec.Builder CONFIG_BUILDER = new ForgeConfigSpec.Builder();
        public static ForgeConfigSpec COMMON_SPEC_CUSTOMGUI;

        public static final ForgeConfigSpec.ConfigValue<Boolean> config_search;

        static {
            CONFIG_BUILDER.comment("config your creative tab").push("Masmod Creative Tab");

            config_search = CONFIG_BUILDER.comment("Default value is false.").define("Get Searchbar", false);

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
            CONFIG_BUILDER.pop();
            COMMON_SPEC_CUSTOMGUI = CONFIG_BUILDER.build();
        }
    }

    public static class KEYSETTINGS {

        public static final ForgeConfigSpec.Builder CONFIG_BUILDER = new ForgeConfigSpec.Builder();
        public static ForgeConfigSpec COMMON_SPEC_KEYSETTINGS;

        public static final ForgeConfigSpec.ConfigValue<Boolean> config_alredy_jump;

        static {
            CONFIG_BUILDER.comment("config your keys").push("Masmod Key Settings");

            config_alredy_jump = CONFIG_BUILDER.comment("Default value is true.").define("Set Jump with Key X", true);

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
            CONFIG_BUILDER.pop();
            COMMON_SPEC_KEYSETTINGS = CONFIG_BUILDER.build();
        }
    }
}
