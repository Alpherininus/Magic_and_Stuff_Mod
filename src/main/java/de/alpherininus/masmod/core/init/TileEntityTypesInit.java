package de.alpherininus.masmod.core.init;

import de.alpherininus.masmod.Masmod;
import de.alpherininus.masmod.common.tileentity.AdvanceGemTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE_REGISTER = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Masmod.MOD_ID);

    public static final RegistryObject<TileEntityType<AdvanceGemTileEntity>> ADV_GEM_ENTITY_TYPE = TILE_ENTITY_TYPE_REGISTER
            .register("adv_gem", ()-> TileEntityType.Builder.create(AdvanceGemTileEntity::new, BlockInit.ADVANCE_GEM_BLOCK.get()).build(null));
}
