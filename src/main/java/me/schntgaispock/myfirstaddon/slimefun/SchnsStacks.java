package me.schntgaispock.myfirstaddon.slimefun;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.schntgaispock.myfirstaddon.slimefun.items.RadioactiveCake;
import me.schntgaispock.myfirstaddon.slimefun.util.MusicTools;

public class SchnsStacks {
    public static final SlimefunItemStack FIRE_CAKE,
        WATER_CAKE,
        XP_PRINTER,
        RADIOACTIVE_CAKE, MUSICAL_CAKE, MUSICAL_CAKE_TUNER, AIR_CAKE, EARTH_CAKE;

    public static final SlimefunItemStack[] MUSICAL_CAKES = _generateMusicalCakeStacks();

    private static SlimefunItemStack[] _generateMusicalCakeStacks() {
        SlimefunItemStack[] cakes = new SlimefunItemStack[25];
        for (int i = 0; i < 25; i++) {
            String _note = MusicTools.NOTES_NAMES[i];
            cakes[i] = new SlimefunItemStack(
                "MUSICAL_CAKE_" + _note,
                Material.CAKE,
                "&dMusical Cake",
                "&7" + _note,
                "",
                "&fHow does it make that sound?");
        };
        return cakes;
    }

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
            "&fExtinguishes you when you try to eat it!");

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
            "&dMusical Cake",
            "&7Tune this in the Musical Cake Tuner",
            "",
            "&fHow does it make that sound?");

        MUSICAL_CAKE_TUNER = new SlimefunItemStack(
            "MUSICAL_CAKE_TUNER",
            Material.JUKEBOX,
            "&5Musical Cake Tuner",
            "",
            "&fTunes Musical Cakes by... compressing them?");

        AIR_CAKE = new SlimefunItemStack(
            "AIR_CAKE",
            Material.CAKE,
            "&fAir Cake",
            "",
            "&fToo bad it doesn't float.");

        EARTH_CAKE = new SlimefunItemStack(
            "EARTH_CAKE",
            Material.CAKE,
            "&aEarth Cake",
            "",
            "&fIsn't this just dirt?");
    }
}
