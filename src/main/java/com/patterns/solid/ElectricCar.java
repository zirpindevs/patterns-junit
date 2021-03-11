package com.patterns.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricCar implements ICar{

    private final Logger log = LoggerFactory.getLogger(ElectricCar.class);

    private int battery;

    @Override
    public void accelerate() {
        String logMessage;

        if (hasBattery()) {
            logMessage = "accelerating the car";
        }
        else {
             logMessage = "I can not accelerate the car";
        }

        this.logInfo(logMessage);

    }

    @Override
    public void stop() {
        this.logInfo("accelerating the car");

    }

    public boolean hasBattery() {
        this.logInfo("checking battery");

        if (battery < 95) {
            this.logInfo("the battery is very low :(");

            return false;
        } else {
            this.logInfo("battery OK :)");

            return true;
        }
    }

    public void logInfo(String logMessage){
        log.info(logMessage);
    }

}
