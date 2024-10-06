package me.isteewx.eta.event.api;

import lombok.Getter;
import lombok.Setter;
import me.isteewx.eta.Eta;

@Setter @Getter
public class Event {
    private boolean cancelled;

    public void post() {
        Eta.getINSTANCE().getEventManager().post(this);
    }
}
