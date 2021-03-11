package com.patterns.testexample;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PruebaTest {
    @Test
    @DisplayName("Test name")
    public void testName()
    {
        String myName ="Javier";
        assertNotEquals("Javi",myName);

    }
}

