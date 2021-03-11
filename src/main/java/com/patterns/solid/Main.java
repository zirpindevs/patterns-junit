package com.patterns.solid;

public class Main {

    public static void main(String[] args) {

        ICar car;
        car = new ElectricCar();
        car.accelerate();
    }
}
