package me.isteewx.eta.event.api;

import me.isteewx.eta.event.impl.Event2D;
import net.minecraft.client.Minecraft;

public class EventManager {
    public void post(Event e) {
        System.out.println("Received event: " + e);

        if (e instanceof Event2D.Post) {
            Minecraft.getMinecraft().fontRendererObj.drawString("Hello world", 10, 10, -1);
        }
    }
}
