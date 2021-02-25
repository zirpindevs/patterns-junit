package com.patterns.behavioral.strategy.strategy2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strategy2Test {
    Context upperCaseCtx = new Context(new UpperCaseStrategy());
    Context lowerCaseCtx = new Context(new LowerCaseStrategy());
    Context numericCtx = new Context(new NumericStrategy());

    @Test
    @DisplayName("Validacion de mayúsculas")
    void testMayusculas() {

        assertNotNull(upperCaseCtx);

        assertTrue(upperCaseCtx.validate("HOLA"));
        assertFalse(upperCaseCtx.validate("hola"));
        assertFalse(upperCaseCtx.validate("4"));
    }

    @Test
    @DisplayName("Validacion de minúsculas")
    void testMinusculas() {

        assertNotNull(lowerCaseCtx);

        assertTrue(lowerCaseCtx.validate("hola"));
        assertFalse(lowerCaseCtx.validate("HOLA"));
        assertFalse(lowerCaseCtx.validate("4"));
    }

    @Test
    @DisplayName("Validación numérica")
    void testNumerico() {

        assertNotNull(numericCtx);

        assertTrue(numericCtx.validate("4"));
        assertFalse(numericCtx.validate("HOLA"));
        assertFalse(numericCtx.validate("hola"));


    }
}