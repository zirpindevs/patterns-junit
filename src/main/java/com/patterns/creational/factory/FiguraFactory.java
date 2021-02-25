package com.patterns.creational.factory;

import com.patterns.creational.factory.error.FiguraNotFoundException;

public class FiguraFactory {

    private static final String RECTANGULO = "rectangulo";
    private static final String CIRCULO = "circulo";
    private static final String TRIANGULO = "triangulo";
    public static Figura crearFigura(String tipo) throws FiguraNotFoundException {

        if (tipo == null)
            throw new FiguraNotFoundException();

        switch(tipo){
            case RECTANGULO:
                return new Rectangulo();
//                 return new RectanguloV2();
            case CIRCULO:
                return new Circulo();
            case TRIANGULO:
                return new Triangulo();
            default:
                throw new FiguraNotFoundException();
        }


    }
}
