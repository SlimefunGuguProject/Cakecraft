package me.schntgaispock.myfirstaddon.slimefun.listeners;

import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import me.schntgaispock.myfirstaddon.MyFirstAddon;
import me.schntgaispock.myfirstaddon.slimefun.SchnsStacks;
import me.schntgaispock.myfirstaddon.slimefun.items.MusicalCakeTuner;
import me.schntgaispock.myfirstaddon.slimefun.util.GuiElements;

public class MusicalCakeTunerListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        if (ChatUtils.removeColorCodes(e.getView().getTitle()).equals("Musical Cake Tuner")) {
            ItemStack itemStack = e.getCurrentItem();
            if (itemStack == null) {
                return;
            }

            String name = ChatUtils.removeColorCodes(itemStack.getItemMeta().getDisplayName());
            @Nonnull List<String> buttonLore = e.getInventory().getItem(22).getItemMeta().getLore();

            if (name.startsWith("Click to set note to:")) {

                ItemStack inputItem = e.getInventory().getItem(MusicalCakeTuner.INPUT_SLOT);
                if (inputItem != null) {
                    int inputAmount = inputItem.getAmount();
                    inputItem.setAmount(inputAmount - 1);

                    int key = Integer.parseInt(ChatUtils.removeColorCodes(buttonLore.get(0)));
                    e.getInventory().setItem(MusicalCakeTuner.OUTPUT_SLOT, SchnsStacks.MUSICAL_CAKES[key]);
                }

            } else if (name.equals("Click to increase pitch")) {
                int oldKey = Integer.parseInt(ChatUtils.removeColorCodes(buttonLore.get(0)));
                int key = (oldKey < 24) ? oldKey + 1 : oldKey;
                e.getInventory().setItem(MusicalCakeTuner.CONFIRM_SLOT,
                    GuiElements.MenuItems.getMusicalCakeConfirm(key));
                buttonLore.set(0, "" + key);    

            } else if (name.equals("Click to decrease pitch")) {
                int oldKey = Integer.parseInt(ChatUtils.removeColorCodes(buttonLore.get(0)));
                int key = (oldKey > 0) ? oldKey - 1 : oldKey;
                e.getInventory().setItem(MusicalCakeTuner.CONFIRM_SLOT,
                    GuiElements.MenuItems.getMusicalCakeConfirm(key));
                buttonLore.set(0, "" + key);

            }
        }
    }

    public static void setup() {
        Bukkit.getPluginManager().registerEvents((Listener) (new MusicalCakeTunerListener()),
            (Plugin) MyFirstAddon.getInstance());
    }
}
