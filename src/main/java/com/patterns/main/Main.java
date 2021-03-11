package com.patterns.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        final Logger log = LoggerFactory.getLogger(Main.class);

        String logMessage = "Hola mundo!";
        log.info(logMessage);
    }
}
