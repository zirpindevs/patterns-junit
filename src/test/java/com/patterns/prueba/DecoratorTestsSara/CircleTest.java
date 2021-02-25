package com.patterns.prueba.DecoratorTestsSara;

import com.patterns.structural.decorator.Circle;
import static org.junit.jupiter.api.Assertions.*;

import com.patterns.structural.decorator.Shape;
import org.junit.jupiter.api.Test;

class CircleTest {

   /* @Test
    void draw() {
    }

    @Test
    void resize() {
    }*/

    @Test
    void description() {
        Circle circle = new Circle();
        assertEquals("Hey there! I'm using Decorator!", circle.description());
    }

    @Test
    void isHide() {
        Circle circle = new Circle();
        assertEquals(false, circle.isHide());
    }
    @Test
    void isInstance() {
        Circle circle = new Circle();
        assertTrue(circle instanceof Shape);
    }

}