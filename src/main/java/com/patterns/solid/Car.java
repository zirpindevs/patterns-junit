package com.patterns.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements ICar{

    private final Logger log = LoggerFactory.getLogger(Car.class);


    @Override
    public void accelerate() {
        String logMessage = "accelerating the car";
        log.info(logMessage);
    }

    @Override
    public void stop() {
        String logMessage = "stopping the car";
        log.info(logMessage);
    }
}
