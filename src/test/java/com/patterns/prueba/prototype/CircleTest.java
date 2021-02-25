package com.patterns.prueba.prototype;

import com.patterns.creational.prototype.Circle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Circle")
public class CircleTest {


    @Test
    @DisplayName("InstanceOf")
    void testCircle(){
        Circle circle = new Circle("amarillo", 10,10);
        assertTrue(circle instanceof Circle);
    }

    @Test
    @DisplayName("Clone")
    void testClone() throws CloneNotSupportedException{
        Circle circle =  new Circle("amarillo", 20,20);
        Circle circleClonado = circle.clone();

        assertNotEquals(circle, circleClonado);

        assertEquals(circle.getColor(), circleClonado.getColor());
        assertEquals(circle.getHeight(), circle.getWidth());
        assertEquals(circle.getWidth(),  circleClonado.getWidth());
    }
}
