package ch.frankel.blog.executablejar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Stream;

public class SayHello {

    private final Logger LOGGER = LogManager.getLogger(SayHello.class);

    private final String[] whos;

    public SayHello(String[] whos) {
        this.whos = whos;
    }

    public void init() {
        if (whos.length == 0) {
            LOGGER.info("Hello world!");
        } else {
            Stream.of(whos).forEach(who -> LOGGER.info("Hello " + who + "!"));
        }
    }
}