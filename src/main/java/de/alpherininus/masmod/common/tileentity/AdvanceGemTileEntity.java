package de.alpherininus.masmod.common.tileentity;

import de.alpherininus.masmod.core.init.BlockInit;
import de.alpherininus.masmod.core.init.TileEntityTypesInit;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;


public class AdvanceGemTileEntity extends TileEntity implements ITickableTileEntity {

    private static final Minecraft mc = Minecraft.getInstance();

    public AdvanceGemTileEntity(TileEntityType<?> tileEntityType) {
        super(tileEntityType);
    }

    public AdvanceGemTileEntity() {
        this(TileEntityTypesInit.ADV_GEM_ENTITY_TYPE.get());
    }

    @Override
    public void tick() {
        if (world.getBlockState(this.pos.up()) == BlockInit.ADVANCE_GEM_BLOCK.get().getDefaultState()) {

        }
    }

}
