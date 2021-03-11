package com.patterns.mockito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SuiteTest {

    @Test
    @DisplayName("Test dummy name")
    void testDummyName()
    {
        String dummyName ="mockitoSuite";
        assertNotEquals("mockito",dummyName);

    }
    }
