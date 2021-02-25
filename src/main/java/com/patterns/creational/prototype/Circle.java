package com.patterns.creational.prototype;

public class Circle extends Shape{

    private int width;
    private int height;

    public Circle(String color, int width, int height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
