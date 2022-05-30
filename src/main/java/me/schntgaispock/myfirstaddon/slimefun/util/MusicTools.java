package me.schntgaispock.myfirstaddon.slimefun.util;

import java.util.function.Function;

import org.bukkit.Sound;

import lombok.Getter;

public class MusicTools {

    public static final String[] NOTES_NAMES = {
        "F#0", "G0", "G#0", "A0", "A#0", "B0", "C0", "C#0", "D0", "D#0", "E0", "F0",
        "F#1", "G1", "G#1", "A1", "A#1", "B1", "C1", "C#1", "D1", "D#1", "E1", "F1", "F#2"
    };

    public static final Function<String, Integer> noteToKey = (String note) -> {
        return 0;
    };

    static class Note {

        @Getter
        public float pitch;
        @Getter
        public Sound sound;
        @Getter
        public static Sound defaultSound = Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO;

        public Note(int key) {
            this(key, defaultSound);
        }

        public Note(float pitch) {
            this(pitch, defaultSound);
        }

        public Note(int key, Sound sound) {
            this(keyToPitch(key), sound);
        }

        public Note(float pitch, Sound sound) {
            this.pitch = pitch;
            this.sound = sound; 
        }
    }

    private static float log2(double a) {
        return (float) ((float) (Math.log(a))/(Math.log(2)));
    }

    public static float keyToPitch(int key) {
        return (float) Math.pow(2, (key-12)/12);
    }

    public static int pitchToKey(double pitch) {
        return (int) Math.round(12 * log2(pitch)) + 12;
    }
}
