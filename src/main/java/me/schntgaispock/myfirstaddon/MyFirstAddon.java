package me.schntgaispock.myfirstaddon;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.schntgaispock.myfirstaddon.items.FireCake;
import me.schntgaispock.myfirstaddon.items.WaterCake;
import me.schntgaispock.myfirstaddon.items.XpPrinter;

public class MyFirstAddon extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        ItemGroup schnsFirstAddon = new ItemGroup(
            new NamespacedKey(this, "schns_first_addon"),
            new CustomItemStack(Material.DIAMOND, "&6Schn's First Addon", "", "&7> Click to open")
        );

        SlimefunItem fireCake = new FireCake(
            schnsFirstAddon,
            new SlimefunItemStack("FIRE_CAKE", Material.CAKE, "&cFire Cake", "", "&fSets you on fire when you try to eat it!"),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, null, null,
                null, new ItemStack(Material.CANDLE), null,
                null, new ItemStack(Material.CAKE), null
            }
        );
        fireCake.register(this);

        SlimefunItem waterCake = new WaterCake(
            schnsFirstAddon,
            new SlimefunItemStack("FIRE_CAKE", Material.CAKE, "&bWater Cake", "", "&fExtinguishes you when you try to eat it!"),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, null, null,
                null, new ItemStack(Material.WATER_BUCKET), null,
                null, new ItemStack(Material.CAKE), null
            }
        );
        waterCake.register(this);

        SlimefunItem XpPrinter = new XpPrinter(
            schnsFirstAddon,
            new SlimefunItemStack("XP_PRINTER", Material.EXPERIENCE_BOTTLE, "&eXP Printer", "", "Inflates the XP economy!"),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.EXPERIENCE_BOTTLE),
                new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.PAPER), new ItemStack(Material.EXPERIENCE_BOTTLE),
                new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.EXPERIENCE_BOTTLE)
            }
        );
        XpPrinter.register(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return "https://github.com/SchnTgaiSpock/myFirstAddon/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
