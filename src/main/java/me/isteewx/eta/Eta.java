package me.isteewx.eta;

import lombok.Getter;
import me.isteewx.eta.event.api.EventManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Eta {
    @Getter private static final Eta INSTANCE = new Eta();

    private final Logger logger = LogManager.getLogger(this);
    @Getter private final EventManager eventManager;

    public Eta() {
        Runtime.getRuntime().addShutdownHook(new Thread(this::onStop));

        this.logger.info("[Eta] Client started");

        this.eventManager = new EventManager();
    }

    private void onStop() {
        this.logger.info("[Eta] Client stopped");
    }
}
