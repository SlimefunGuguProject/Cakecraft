package me.schntgaispock.myfirstaddon.slimefun.listeners;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.schntgaispock.myfirstaddon.MyFirstAddon;
import me.schntgaispock.myfirstaddon.slimefun.items.MusicalCakeTuner;
import me.schntgaispock.myfirstaddon.slimefun.util.GuiElements;
import net.md_5.bungee.api.ChatColor;

public class MusicalCakeTunerListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Logger logger = MyFirstAddon.getInstance().getLogger();
        logger.log(Level.INFO, e.getView().getTitle());
        if (e.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', "&bMusical Cake Tuner"))) {
            ItemStack itemStack = e.getCurrentItem();
            logger.log(Level.INFO, itemStack.toString());
            logger.log(Level.INFO, itemStack.toString());
            if (itemStack == null) {
                return;
            } else if (itemStack == GuiElements.GUI_BACKGROUND ||
                itemStack == GuiElements.GUI_INPUT ||
                itemStack == GuiElements.GUI_OUTPUT ||
                itemStack == MusicalCakeTuner.pitchUpItemStack ||
                itemStack == MusicalCakeTuner.pitchDownItemStack
                ) {
                e.setCancelled(true);
            } else {
                e.getWhoClicked().sendMessage("You clicked right!");
            }
        }
    }

    public static void setup() {
        Bukkit.getPluginManager().registerEvents((Listener) (new MusicalCakeTunerListener()), (Plugin) MyFirstAddon.getInstance());
    }
}
