package me.isteewx.eta.event.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.isteewx.eta.event.api.Event;
import net.minecraft.client.gui.ScaledResolution;

public class Event2D {
    @Getter
    @AllArgsConstructor
    public static class Pre extends Event {
        private final ScaledResolution sr;
    }
    @Getter
    @AllArgsConstructor
    public static class Post extends Event {
        private final ScaledResolution sr;
    }
}
