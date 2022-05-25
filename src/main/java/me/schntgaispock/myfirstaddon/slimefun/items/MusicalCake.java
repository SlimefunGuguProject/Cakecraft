package me.schntgaispock.myfirstaddon.slimefun.items;

import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import lombok.Getter;
import lombok.NonNull;
import me.schntgaispock.myfirstaddon.slimefun.util.MusicTools;

public class MusicalCake extends SlimefunItem {
    public static final Radioactivity RADIOACTIVITY = Radioactivity.HIGH;
    @Getter
    private final int key;


    public MusicalCake(@NonNull ItemGroup itemGroup, @NonNull SlimefunItemStack itemStack,
        @NonNull RecipeType recipeType,
        @NonNull ItemStack[] recipe) {
        this(itemGroup, itemStack, recipeType, recipe, 0);
    }

    public MusicalCake(@NonNull ItemGroup itemGroup, @NonNull SlimefunItemStack itemStack,
        @NonNull RecipeType recipeType,
        @NonNull ItemStack[] recipe, int key) {
        super(itemGroup, itemStack, recipeType, recipe);
        this.key = key;
    }

    @Override
    public void preRegister() {
        addItemHandler((BlockUseHandler) this::onBlockRightClick);
    }

    private void onBlockRightClick(@NonNull PlayerRightClickEvent event) {
        event.cancel();
        Player player = event.getPlayer();
        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, SoundCategory.PLAYERS, 1.0f, MusicTools.keyToPitch(this.key));
    }
}
