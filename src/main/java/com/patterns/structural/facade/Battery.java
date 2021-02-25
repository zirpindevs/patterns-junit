package com.patterns.structural.facade;

public class Battery {

    private Boolean on;

    public void on(){
        this.on = true;
        System.out.println("Battery ON");
    }

    public void off(){
        this.on = false;
        System.out.println("Battery OFF");
    }

    public Boolean isOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }
}
