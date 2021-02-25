package com.patterns.creational.factory;

import com.patterns.creational.factory.error.FiguraNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Creación de figuras")
class FiguraFactoryTest {


    @Test
    @DisplayName("Null")
    void createNull() {
        assertThrows(FiguraNotFoundException.class, () -> FiguraFactory.crearFigura(null));
    }

    @Test
    @DisplayName("Empty")
    void createEmpty() {
        assertThrows(FiguraNotFoundException.class, () -> FiguraFactory.crearFigura(""));
    }

    @Test
    @DisplayName("Non existent")
    void createNonExistent(){
        assertThrows(FiguraNotFoundException.class, () -> FiguraFactory.crearFigura("dfgsdfgsdg"));
    }

    @Test
    @DisplayName("Triangle")
    void createTriangle() throws FiguraNotFoundException {
        Figura figura = FiguraFactory.crearFigura("triangulo");
        assertTrue(figura instanceof Triangulo);
    }

    @Test
    @DisplayName("Circle")
    //@Disabled
    void createCircle() throws FiguraNotFoundException {
        Figura figura = FiguraFactory.crearFigura("circulo");
        assertTrue(figura instanceof Circulo);
    }

    @Test
    @DisplayName("Rectangle")
    void createRectangle() throws FiguraNotFoundException {
        Figura figura = FiguraFactory.crearFigura("rectangulo");
        assertTrue(figura instanceof Rectangulo);
    }



}