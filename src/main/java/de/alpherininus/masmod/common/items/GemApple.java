package de.alpherininus.masmod.common.items;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GemApple extends Item {

    public GemApple(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World world, LivingEntity livingEntity) {
        world.setBlockState(livingEntity.getPosition().up(2), Blocks.STONE.getDefaultState());
        return super.onItemUseFinish(stack, world, livingEntity);
    }
}
