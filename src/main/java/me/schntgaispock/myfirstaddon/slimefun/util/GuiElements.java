package me.schntgaispock.myfirstaddon.slimefun.util;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class GuiElements {

    /**
     * MenuItems
     */
    public static class MenuItems {
        public static final CustomItemStack getMusicalCakeConfirm(int key) {
            return new CustomItemStack(
                Material.LIME_STAINED_GLASS_PANE,
                "&b单击设定为: &f" + MusicTools.NOTES_NAMES[key],
                "&8" + key
            );
        }    
    }

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
