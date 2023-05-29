package de.alpherininus.masmod.client.events;

import de.alpherininus.masmod.Masmod;
import de.alpherininus.masmod.core.init.BlockInit;
import de.alpherininus.masmod.core.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Masmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEvents {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        // player.inventory.armorInventory.set(0, new ItemStack(ItemInit.MASMOD_HELMET.get()));

    }

    @SubscribeEvent
    public static void onPlayerToss(ItemTossEvent event) {
        // PlayerEntity player = event.getPlayer();
        // World world = player.getEntityWorld();
        // BlockState state = world.getBlockState(player.getPosition().down());

        // if (state.getBlock() == BlockInit.ADVANCE_GEM_BLOCK.get()) {
        //    player.addItemStackToInventory(new ItemStack(ItemInit.GEM_APPLE.get()));

        //}
    }

}
