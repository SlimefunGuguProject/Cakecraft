package me.schntgaispock.myfirstaddon.slimefun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.Getter;
import me.schntgaispock.myfirstaddon.MyFirstAddon;
import me.schntgaispock.myfirstaddon.slimefun.items.FireCake;
import me.schntgaispock.myfirstaddon.slimefun.items.RadioactiveCake;
import me.schntgaispock.myfirstaddon.slimefun.items.WaterCake;
import me.schntgaispock.myfirstaddon.slimefun.items.XpPrinter;

public class ItemManager {
    @Getter
    public static SlimefunItem fireCake, waterCake, xpPrinter, radioactiveCake;

    public static void setup() {
        MyFirstAddon addon = MyFirstAddon.getInstance();

        fireCake = new FireCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.FIRE_CAKE,
            SchnsRecipes.FIRE_CAKE.recipeType,
            SchnsRecipes.FIRE_CAKE.recipe);
        waterCake = new WaterCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.WATER_CAKE,
            SchnsRecipes.WATER_CAKE.recipeType,
            SchnsRecipes.WATER_CAKE.recipe);
        xpPrinter = new XpPrinter(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.XP_PRINTER,
            SchnsRecipes.XP_PRINTER.recipeType,
            SchnsRecipes.XP_PRINTER.recipe);
        radioactiveCake = new RadioactiveCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.RADIOACTIVE_CAKE,
            SchnsRecipes.RADIOACTIVE_CAKE.recipeType,
            SchnsRecipes.RADIOACTIVE_CAKE.recipe);

        fireCake.register(addon);
        waterCake.register(addon);
        xpPrinter.register(addon);
        radioactiveCake.register(addon);
    }
}
