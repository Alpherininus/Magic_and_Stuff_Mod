package de.alpherininus.masmod.core.init.vanilla;

import de.alpherininus.masmod.core.utils.materials.blocktier.BlockHardness;
import de.alpherininus.masmod.core.utils.materials.blocktier.BlockResistance;
import de.alpherininus.masmod.core.utils.materials.blocktier.BlockToolLevel;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VBlockInit {
    public static final DeferredRegister<Block> VANILLA_BLOCK_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");

    public static final RegistryObject<Block> BEDROCK = VANILLA_BLOCK_REGISTER.register("bedrock",
            ()-> new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.GREEN)
                    .hardnessAndResistance(BlockHardness.getIron(), BlockResistance.getIron())
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(BlockToolLevel.getDiamond())
                    .sound(SoundType.STONE)));
}
