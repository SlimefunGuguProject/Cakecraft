package me.schntgaispock.myfirstaddon.slimefun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.Getter;
import me.schntgaispock.myfirstaddon.MyFirstAddon;
import me.schntgaispock.myfirstaddon.slimefun.items.FireCake;
import me.schntgaispock.myfirstaddon.slimefun.items.MusicalCake;
import me.schntgaispock.myfirstaddon.slimefun.items.RadioactiveCake;
import me.schntgaispock.myfirstaddon.slimefun.items.WaterCake;
import me.schntgaispock.myfirstaddon.slimefun.items.XpPrinter;

public class ItemManager {
    @Getter
    public static SlimefunItem fireCake, waterCake, xpPrinter, radioactiveCake, musicalCake;

    public static void setup() {
        MyFirstAddon addon = MyFirstAddon.getInstance();

        fireCake = new FireCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.FIRE_CAKE,
            SchnsRecipes.FIRE_CAKE.getRecipeType(),
            SchnsRecipes.FIRE_CAKE.getRecipe());

        waterCake = new WaterCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.WATER_CAKE,
            SchnsRecipes.WATER_CAKE.getRecipeType(),
            SchnsRecipes.WATER_CAKE.getRecipe());

        xpPrinter = new XpPrinter(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.XP_PRINTER,
            SchnsRecipes.XP_PRINTER.getRecipeType(),
            SchnsRecipes.XP_PRINTER.getRecipe());

        radioactiveCake = new RadioactiveCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.RADIOACTIVE_CAKE,
            SchnsRecipes.RADIOACTIVE_CAKE.getRecipeType(),
            SchnsRecipes.RADIOACTIVE_CAKE.getRecipe());

        musicalCake = new MusicalCake(
            SchnsGroup.SCHNS_FIRST_ADDON,
            SchnsStacks.MUSICAL_CAKE,
            SchnsRecipes.MUSICAL_CAKE.getRecipeType(),
            SchnsRecipes.MUSICAL_CAKE.getRecipe());

        fireCake.register(addon);
        waterCake.register(addon);
        xpPrinter.register(addon);
        radioactiveCake.register(addon);
        musicalCake.register(addon);
    }
}
