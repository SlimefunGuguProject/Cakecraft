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
                "&d音乐蛋糕",
                "&7" + _note,
                "",
                "&f它到底是如何放出音乐的呢?");
        };
        return cakes;
    }

    static {

        FIRE_CAKE = new SlimefunItemStack(
            "FIRE_CAKE",
            Material.CAKE,
            "&c火焰蛋糕",
            "",
            "&f烫嘴!");

        WATER_CAKE = new SlimefunItemStack(
            "WATER_CAKE",
            Material.CAKE,
            "&b水蛋糕",
            "",
            "&f食用它的时候可以熄灭你身上的火!");

        XP_PRINTER = new SlimefunItemStack(
            "XP_PRINTER",
            Material.EXPERIENCE_BOTTLE,
            "&e经验释能器",
            "",
            "&f源源不断的经验!",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);

        RADIOACTIVE_CAKE = new SlimefunItemStack(
            "RADIOACTIVE_CAKE",
            Material.CAKE,
            "&4核蛋糕",
            "",
            "&f用核废水制成的蛋糕...",
            "",
            LoreBuilder.radioactive(RadioactiveCake.RADIOACTIVITY),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

        MUSICAL_CAKE = new SlimefunItemStack(
            "MUSICAL_CAKE",
            Material.CAKE,
            "&d音乐蛋糕",
            "&7需在音乐蛋糕调音器中调音",
            "",
            "&f它到底是如何放出音乐的呢?");

        MUSICAL_CAKE_TUNER = new SlimefunItemStack(
            "MUSICAL_CAKE_TUNER",
            Material.JUKEBOX,
            "&5音乐蛋糕调音器",
            "",
            "&f压缩...音乐蛋糕?");

        AIR_CAKE = new SlimefunItemStack(
            "AIR_CAKE",
            Material.CAKE,
            "&f空气蛋糕",
            "",
            "&f可惜它不会浮起来");

        EARTH_CAKE = new SlimefunItemStack(
            "EARTH_CAKE",
            Material.CAKE,
            "&a地球蛋糕",
            "",
            "&f泥土又或是石头？");
    }
}
