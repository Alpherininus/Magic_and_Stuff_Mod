package de.alpherininus.masmod.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeartureInit {
    public static void addOres(final BiomeLoadingEvent event) {
        addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.GEM_ORE.get().getDefaultState(), 5, 1, 35, 20);

    }

    public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(rule, state, veinSize))
                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight))).square().count(amount));
    }
}
