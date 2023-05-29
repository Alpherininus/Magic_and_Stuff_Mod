package de.alpherininus.masmod.core.init;

import de.alpherininus.masmod.Masmod;
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

public class BlockInit {

    public static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, Masmod.MOD_ID);

    public static final RegistryObject<Block> GEM_ORE = BLOCK_REGISTER.register("gem_ore",
            ()-> new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.GREEN)
                    .hardnessAndResistance(BlockHardness.getIron(), BlockResistance.getIron())
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(BlockToolLevel.getDiamond())
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> GEM_BLOCK = BLOCK_REGISTER.register("gem_block",
            ()-> new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.GREEN)
                    .hardnessAndResistance(BlockHardness.getIron(), BlockResistance.getIron())
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(BlockToolLevel.getDiamond())
                    .sound(SoundType.STONE)));
    
}
