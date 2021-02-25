package com.patterns.prueba.DecoratorTestsSara;

import com.patterns.structural.decorator.BorderStyleDecorator;
import com.patterns.structural.decorator.Circle;
import com.patterns.structural.decorator.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BorderStyleDecoratorTest {

    @Test
    void draw() {
    }

    @Test
    void resize() {
    }

    @Test
    void description() {
        Shape circulo = new Circle();
        String style ="sólido";
        Shape circuloBordeDecorado = new BorderStyleDecorator(circulo, style);
        assertEquals("Hey there! I'm using Decorator! decorated with border style: "+style, circuloBordeDecorado.description());
    }

    @Test
    void isHide() {
        Shape circulo = new Circle();
        Shape circuloBordeDecorado = new BorderStyleDecorator(circulo, "2px");
        assertEquals(false, circuloBordeDecorado.isHide());
    }
}