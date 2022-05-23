package me.schntgaispock.myfirstaddon.slimefun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.Getter;
import me.schntgaispock.myfirstaddon.MyFirstAddon;
import me.schntgaispock.myfirstaddon.slimefun.items.FireCake;
import me.schntgaispock.myfirstaddon.slimefun.items.WaterCake;
import me.schntgaispock.myfirstaddon.slimefun.items.XpPrinter;

public class ItemManager {
    @Getter
    public static SlimefunItem fireCake;
    @Getter
    public static SlimefunItem waterCake;
    @Getter
    public static SlimefunItem xpPrinter;

    public static void setup() {
        MyFirstAddon addon = MyFirstAddon.getInstance();

        fireCake = new FireCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.FIRE_CAKE,
            SchnsRecipes.FIRE_CAKE.recipeType,
            SchnsRecipes.FIRE_CAKE.recipe);
        waterCake = new WaterCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.FIRE_CAKE,
            SchnsRecipes.FIRE_CAKE.recipeType,
            SchnsRecipes.FIRE_CAKE.recipe);
        xpPrinter = new XpPrinter(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.FIRE_CAKE,
            SchnsRecipes.FIRE_CAKE.recipeType,
            SchnsRecipes.FIRE_CAKE.recipe);

        fireCake.register(addon);
        waterCake.register(addon);
        xpPrinter.register(addon);
    }
}
