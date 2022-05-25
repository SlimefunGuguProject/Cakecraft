package me.schntgaispock.myfirstaddon.slimefun.listeners;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import me.schntgaispock.myfirstaddon.MyFirstAddon;
import me.schntgaispock.myfirstaddon.slimefun.items.MusicalCakeTuner;
import me.schntgaispock.myfirstaddon.slimefun.util.GuiElements;
import me.schntgaispock.myfirstaddon.slimefun.util.MusicTools;
import net.md_5.bungee.api.ChatColor;

public class MusicalCakeTunerListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Logger logger = MyFirstAddon.getInstance().getLogger();
        logger.log(Level.INFO, e.getView().getTitle());
        if (ChatUtils.removeColorCodes(e.getView().getTitle()).equals("Musical Cake Tuner")) {
            ItemStack itemStack = e.getCurrentItem();
            if (itemStack == null) {
                return;
            } 
            String name = ChatUtils.removeColorCodes(itemStack.getItemMeta().getDisplayName());
            if (name.equals("Click to change pitch")) {
                logger.log(Level.INFO, "Clicked on the green pane!");
                String note = MusicTools.NOTES_NAMES[(Muical)]
            } else {
                logger.log(Level.INFO, name);
            }
        }
    }

    public static void setup() {
        Bukkit.getPluginManager().registerEvents((Listener) (new MusicalCakeTunerListener()), (Plugin) MyFirstAddon.getInstance());
    }
}
