package com.patterns.creational.factory.error;

public class FiguraNotFoundException extends Exception {

    public FiguraNotFoundException(){
        super("Shape not found.");
    }
}
