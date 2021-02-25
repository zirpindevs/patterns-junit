package com.patterns.creational.factory;

import com.patterns.creational.factory.error.FiguraNotFoundException;

public class Main {

    public static void main(String[] args) throws FiguraNotFoundException {

        Figura triangulo = FiguraFactory.crearFigura("triangulo");
        Figura circulo = FiguraFactory.crearFigura("circulo");
        Figura rectangulo = FiguraFactory.crearFigura("rectangulo");

        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(rectangulo);

    }
}
