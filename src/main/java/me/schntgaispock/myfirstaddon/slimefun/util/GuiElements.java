package me.schntgaispock.myfirstaddon.slimefun.util;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class GuiElements {
    public static final CustomItemStack GUI_BACKGROUND = new CustomItemStack(
        Material.BLACK_STAINED_GLASS_PANE,
        "");
    public static final CustomItemStack GUI_INPUT = new CustomItemStack(
        Material.BLUE_STAINED_GLASS_PANE,
        "");
    public static final CustomItemStack GUI_OUTPUT = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        "");
    public static final CustomItemStack GUI_INVISIBLE = new CustomItemStack(
        Material.LIGHT_GRAY_STAINED_GLASS_PANE,
        "");

    public static final CustomItemStack getGuiClickable(String name, String... lore) {
        return new CustomItemStack(
            Material.LIME_STAINED_GLASS_PANE,
            name,
            lore);
    }

    public static final CustomItemStack getGuiArrow(String name, String... lore) {
        return new CustomItemStack(
            Material.ARROW,
            name,
            lore);
    }
}
