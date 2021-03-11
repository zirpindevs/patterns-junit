package com.patterns.main;
import com.patterns.behavioral.iterator.iterator1.BookShop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        final Logger log = LoggerFactory.getLogger(BookShop.class);

        String logMessage = "Hola mundo!";
        log.info(logMessage);
    }
}
