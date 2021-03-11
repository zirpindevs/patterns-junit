package com.patterns.testexample;


import com.patterns.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5,5));
    }

    @Test
    void sumTest(){
        Calculator calc = new Calculator();
        assertEquals(4, calc.sum(2, 2));
        System.out.println("Suma");
    }


    @Test
    void subTest(){
        Calculator calc = new Calculator();
        assertEquals(2, calc.sub(10,8));
        System.out.println("Resta");
    }
}