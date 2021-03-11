package com.patterns.solid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Test car not null")
    public void testConstructor()
    {
        ICar car;
        car = new ElectricCar();
        assertNotNull(car);
    }
}