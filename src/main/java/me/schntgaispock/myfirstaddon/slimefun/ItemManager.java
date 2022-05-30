package me.schntgaispock.myfirstaddon.slimefun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.Getter;
import me.schntgaispock.myfirstaddon.MyFirstAddon;
import me.schntgaispock.myfirstaddon.slimefun.items.AirCake;
import me.schntgaispock.myfirstaddon.slimefun.items.FireCake;
import me.schntgaispock.myfirstaddon.slimefun.items.MusicalCake;
import me.schntgaispock.myfirstaddon.slimefun.items.MusicalCakeTuner;
import me.schntgaispock.myfirstaddon.slimefun.items.RadioactiveCake;
import me.schntgaispock.myfirstaddon.slimefun.items.WaterCake;
import me.schntgaispock.myfirstaddon.slimefun.items.XpPrinter;

public class ItemManager {
    @Getter
    public static SlimefunItem fireCake, waterCake, xpPrinter, radioactiveCake, musicalCake, musicalCakeTuner, airCake;

    public static MusicalCake[] musicalCakes;

    public static MusicalCake[] _getMusicalCakes() {
        MusicalCake[] cakes = new MusicalCake[24];
        for (int i = 0; i < 24; i++) {
            cakes[i] = new MusicalCake(
                SchnsGroups.SCHNS_FIRST_ADDON,
                SchnsStacks.MUSICAL_CAKES[i],
                SchnsRecipes.MUSICAL_CAKE.getRecipeType(),
                SchnsRecipes.MUSICAL_CAKE.getRecipe(), i);
        }
        return cakes;
    }

    public static void setup() {
        MyFirstAddon addon = MyFirstAddon.getInstance();

        fireCake = new FireCake(
            SchnsGroups.SCHNS_FIRST_ADDON,
            SchnsStacks.FIRE_CAKE,
            SchnsRecipes.FIRE_CAKE.getRecipeType(),
            SchnsRecipes.FIRE_CAKE.getRecipe());

        waterCake = new WaterCake(
            SchnsGroups.SCHNS_FIRST_ADDON,
            SchnsStacks.WATER_CAKE,
            SchnsRecipes.WATER_CAKE.getRecipeType(),
            SchnsRecipes.WATER_CAKE.getRecipe());

        xpPrinter = new XpPrinter(
            SchnsGroups.SCHNS_FIRST_ADDON,
            SchnsStacks.XP_PRINTER,
            SchnsRecipes.XP_PRINTER.getRecipeType(),
            SchnsRecipes.XP_PRINTER.getRecipe());

        radioactiveCake = new RadioactiveCake(
            SchnsGroups.SCHNS_FIRST_ADDON,
            SchnsStacks.RADIOACTIVE_CAKE,
            SchnsRecipes.RADIOACTIVE_CAKE.getRecipeType(),
            SchnsRecipes.RADIOACTIVE_CAKE.getRecipe());

        musicalCake = new MusicalCake(
            SchnsGroups.SCHNS_FIRST_ADDON,
            SchnsStacks.MUSICAL_CAKE,
            SchnsRecipes.MUSICAL_CAKE.getRecipeType(),
            SchnsRecipes.MUSICAL_CAKE.getRecipe(), -1);

        musicalCakes = _getMusicalCakes();

        musicalCakeTuner = new MusicalCakeTuner(
            SchnsGroups.SCHNS_FIRST_ADDON,
            SchnsStacks.MUSICAL_CAKE_TUNER,
            SchnsRecipes.MUSICAL_CAKE_TUNER.getRecipeType(),
            SchnsRecipes.MUSICAL_CAKE_TUNER.getRecipe());

        airCake = new AirCake(
            SchnsGroups.SCHNS_FIRST_ADDON,
            SchnsStacks.AIR_CAKE,
            SchnsRecipes.AIR_CAKE.getRecipeType(),
            SchnsRecipes.AIR_CAKE.getRecipe());

        xpPrinter.register(addon);
        fireCake.register(addon);
        waterCake.register(addon);
        radioactiveCake.register(addon);
        musicalCake.register(addon);
        musicalCakeTuner.register(addon);
        airCake.register(addon);
    }
}
