package de.alpherininus.masmod.core.utils.materials.itemtier;

import net.minecraft.entity.player.PlayerEntity;

public class ItemAttackDamage {

    public static int getWoodAndGold() {
        return 4;
    }

    public static int getStone() {
        return 5;
    }

    public static int getIron() {
        return 6;
    }

    public static int getDiamond() {
        return 7;
    }

    public static int getNetherite() {
        return 8;
    }

    public static int setAttackDamadge(int attack) {
        return attack;
    }

    public static float setModifiAttackDamage(PlayerEntity modifi, float modifiAttack) {
        return modifi.getCooledAttackStrength(modifiAttack);
    }
}