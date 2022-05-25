package me.schntgaispock.myfirstaddon.slimefun.items;

import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.machines.MenuBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.Getter;
import lombok.NonNull;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.schntgaispock.myfirstaddon.slimefun.util.GuiElements;

public class MusicalCakeTuner extends MenuBlock {
    protected static final int[] GUI_BACKGROUND_SLOTS = {
        0, 1, 2, 3, 4, 5, 6, 7, 8,
        9, 11, 12, 14, 15, 17,
        18, 20, 21, 23, 24, 26,
        27, 29, 30, 32, 33, 35,
        36, 37, 38, 39, 40, 41, 42, 43, 44
    };
    protected static final int[] GUI_INPUT_SLOTS = { 10, 28 };
    protected static final int[] GUI_OUTPUT_SLOTS = { 16, 34 };
    protected static final int[] GUI_ARROW_UP_SLOTS = { 13 };
    protected static final int[] GUI_ARROW_DOWN_SLOTS = { 31 };
    protected static final int[] GUI_SET_PITCH_SLOTS = { 22 };

    public static final int INPUT_SLOT = 19;
    public static final int OUTPUT_SLOT = 25;
    public static final int CONFIRM_SLOT = 22;

    @Getter
    private int currentPitch;

    private CustomItemStack setPitchItemStack;
    public static final CustomItemStack pitchUpItemStack = GuiElements.getGuiArrow("&7Click to increase pitch");
    public static final CustomItemStack pitchDownItemStack = GuiElements.getGuiArrow("&7Click to decrease pitch");

    public static final Radioactivity RADIOACTIVITY = Radioactivity.HIGH;

    public MusicalCakeTuner(@NonNull ItemGroup itemGroup, @NonNull SlimefunItemStack itemStack,
        @NonNull RecipeType recipeType,
        @NonNull ItemStack[] recipe) {
        super(itemGroup, itemStack, recipeType, recipe);

        this.setPitchItemStack = GuiElements.getGuiClickable("&bClick to set pitch to: &fF#1", "&80");
        this.setCurrentPitch(0);
    }

    @Override
    protected void setup(BlockMenuPreset preset) {
        preset.drawBackground(GUI_BACKGROUND_SLOTS);
        preset.drawBackground(INPUT_BORDER, GUI_INPUT_SLOTS);
        preset.drawBackground(OUTPUT_BORDER, GUI_OUTPUT_SLOTS);
        preset.drawBackground(pitchUpItemStack, GUI_ARROW_UP_SLOTS);
        preset.drawBackground(pitchDownItemStack, GUI_ARROW_DOWN_SLOTS);
        preset.drawBackground(this.setPitchItemStack, GUI_SET_PITCH_SLOTS);
    }

    @NonNull
    public void setCurrentPitch(int pitch) {
        this.currentPitch = Math.min(0, Math.max(pitch, 23));
    }

    @Override
    protected int[] getInputSlots() {
        return new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        return new int[0];
    }
}
