package me.schntgaispock.myfirstaddon.slimefun;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.schntgaispock.myfirstaddon.slimefun.items.RadioactiveCake;

public class SchnsStacks {
    public static final SlimefunItemStack FIRE_CAKE,
        WATER_CAKE,
        XP_PRINTER,
        RADIOACTIVE_CAKE, MUSICAL_CAKE, MUSICAL_CAKE_TUNER;

    public static final SlimefunItemStack GUI_BACKGROUND, GUI_INPUT, GUI_OUTPUT;

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
            "&fInflates the XP economy!",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);

        RADIOACTIVE_CAKE = new SlimefunItemStack(
            "RADIOACTIVE_CAKE",
            Material.CAKE,
            "&4Radioactive Cake",
            "",
            "&fWhat a waste of cake ingredients...",
            "",
            LoreBuilder.radioactive(RadioactiveCake.RADIOACTIVITY),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

        MUSICAL_CAKE = new SlimefunItemStack(
            "MUSICAL_CAKE",
            Material.CAKE,
            "&aMusical Cake",
            "&7Tune this in the Musical Cake Tuner",
            "",
            "&fHow does it make that sound?");

        MUSICAL_CAKE_TUNER = new SlimefunItemStack(
            "MUSICAL_CAKE_TUNER",
            Material.JUKEBOX,
            "&aMusical Cake Tuner",
            "",
            "&fTunes Musical Cakes by... compressing them?");

        GUI_BACKGROUND = new SlimefunItemStack(
            "SCHNS_GUI_BACKGROUND",
            Material.BLACK_STAINED_GLASS_PANE,
            "");

        GUI_INPUT = new SlimefunItemStack(
            "SCHNS_GUI_INPUT",
            Material.LIGHT_BLUE_STAINED_GLASS_PANE,
            "");

        GUI_OUTPUT = new SlimefunItemStack(
            "SCHNS_GUI_OUTPUT",
            Material.ORANGE_STAINED_GLASS_PANE,
            "");
    }
}
