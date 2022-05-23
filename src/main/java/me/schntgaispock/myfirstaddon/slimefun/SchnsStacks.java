package me.schntgaispock.myfirstaddon.slimefun;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class SchnsStacks {
    public static final SlimefunItemStack FIRE_CAKE,
        WATER_CAKE,
        XP_PRINTER;

    static {

        FIRE_CAKE = new SlimefunItemStack(
            "XP_PRINTER",
            Material.CAKE,
            "&cFire Cake",
            "",
            "&fSets you on fire when you try to eat it!");

        WATER_CAKE = new SlimefunItemStack(
            "XP_PRINTER",
            Material.CAKE,
            "&bWater Cake",
            "",
            "&dExtinguishes you when you try to eat it!");

        XP_PRINTER = new SlimefunItemStack(
            "XP_PRINTER",
            Material.EXPERIENCE_BOTTLE,
            "&eXP Printer",
            "",
            "&fInflates the XP economy!");

    }
}
