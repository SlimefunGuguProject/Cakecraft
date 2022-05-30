package me.schntgaispock.myfirstaddon.slimefun.items;

import java.util.logging.Level;

import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import lombok.NonNull;
import me.schntgaispock.myfirstaddon.MyFirstAddon;
import me.schntgaispock.myfirstaddon.slimefun.util.MusicTools;

public class MusicalCake extends SlimefunItem {
    public final int KEY;

    public MusicalCake(@NonNull ItemGroup itemGroup, @NonNull SlimefunItemStack itemStack,
        @NonNull RecipeType recipeType,
        @NonNull ItemStack[] recipe, int key) {
        super(itemGroup, itemStack, recipeType, recipe);

        this.KEY = key;
    }

    @Override
    public void preRegister() {
        addItemHandler((BlockUseHandler) this::onBlockRightClick);
    }

    private void onBlockRightClick(@NonNull PlayerRightClickEvent event) {
        event.cancel();
        Player player = event.getPlayer();
        String loreLine = ChatUtils.removeColorCodes(this.getItem().getItemMeta().getLore().get(0));
        if (this.KEY < 0) {
            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, SoundCategory.PLAYERS, 1.0f, 1.0f);
        } else {
            MyFirstAddon.getInstance().getLogger().log(Level.INFO, "lore:" + loreLine);
            MyFirstAddon.getInstance().getLogger().log(Level.INFO, "KEY:" + this.KEY);
            MyFirstAddon.getInstance().getLogger().log(Level.INFO, "pitch:" + MusicTools.keyToPitch(this.KEY));
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, SoundCategory.PLAYERS, 1.0f,
                MusicTools.keyToPitch(this.KEY));
        }
    }
}
