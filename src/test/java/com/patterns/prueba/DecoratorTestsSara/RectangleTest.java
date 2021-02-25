package com.patterns.prueba.DecoratorTestsSara;

import com.patterns.structural.decorator.Rectangle;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {
   /* @Test
    void draw() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        assertEquals("Drawing rectangle", rectangle.draw());
    }

    @Test
    void resize() {
        Rectangle rectangle = new Rectangle();
        rectangle.resize();
        assertEquals("Resizing rectangle", rectangle.resize());
    }*/

    @Test
    void description() {
        Rectangle rectangle = new Rectangle();
        assertEquals("Hey there! I'm using Decorator!", rectangle.description());
    }

    @Test
    void isHide() {
        Rectangle rectangle = new Rectangle();
        assertEquals(false, rectangle.isHide());
    }
}