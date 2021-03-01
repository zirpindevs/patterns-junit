package com.patterns.creational.prototype;

public abstract class Shape implements  Cloneable{

    private String color;

    // Constructores
    public Shape(){}
    public Shape(String color){
        this.color= color;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // método area
    public abstract Double area();

    // método clone
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
