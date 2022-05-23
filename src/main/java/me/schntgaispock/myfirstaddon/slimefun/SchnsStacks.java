package me.schntgaispock.myfirstaddon.slimefun;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.schntgaispock.myfirstaddon.slimefun.items.RadioactiveCake;

public class SchnsStacks {
    public static final SlimefunItemStack FIRE_CAKE,
        WATER_CAKE,
        XP_PRINTER,
        RADIOACTIVE_CAKE;

    static {

        FIRE_CAKE = new SlimefunItemStack(
            "FIRE_CAKE",
            Material.CAKE,
            "&cFire Cake",
            "",
            "&fSets you on fire when you try to eat it!");

        WATER_CAKE = new SlimefunItemStack(
            "WATER_CAKE",
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

        RADIOACTIVE_CAKE = new SlimefunItemStack(
            "RADIOACTIVE_CAKE",
            Material.CAKE,
            "&4Radioactive Cake",
            "",
            "&fWhat a waste of cake ingredients...",
            "",
            LoreBuilder.radioactive(RadioactiveCake.RADIOACTIVITY),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    }
}
