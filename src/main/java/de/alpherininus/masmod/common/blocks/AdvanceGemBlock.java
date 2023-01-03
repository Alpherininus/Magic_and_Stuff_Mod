package de.alpherininus.masmod.common.blocks;

import de.alpherininus.masmod.core.init.TileEntityTypesInit;
import de.alpherininus.masmod.core.utils.materials.blocktier.BlockHardness;
import de.alpherininus.masmod.core.utils.materials.blocktier.BlockResistance;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class AdvanceGemBlock extends Block {

    public AdvanceGemBlock() {
        super(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)
                .hardnessAndResistance(BlockHardness.getIron(), BlockResistance.getIron()).sound(SoundType.ANVIL));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypesInit.ADV_GEM_ENTITY_TYPE.get().create();
    }
}
