package com.patterns.structural.facade;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Smartphone structure")
class SmartphoneFacadeTest {
    private static SmartphoneFacade facade;

    @BeforeAll
    static void setupClass(){
        facade = new SmartphoneFacade();
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void tearDownClass(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    void setupTest(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    void tearDown(){
        System.out.println("AfterEach");
    }

    @Test
    @DisplayName("Turn ON smartphone")
    @Order(1)
    void start() {
        Smartphone smartphone = facade.start();
        assertNotNull(smartphone);
        assertNotNull(smartphone.getBattery());
        assertTrue(smartphone.getBattery().isOn());

    }

    @Test
    @DisplayName("Turn OFF smartphone")
    @Order(2)
    void stop() {
        Smartphone smartphone = facade.start();
        facade.stop(smartphone);
        assertFalse(smartphone.getBattery().isOn());

    }

    @Test
    @DisplayName("Smartphone sensors")
    @Order(3)
    // @Disabled("Pending bugfix-74")
    void sensors(){
        Smartphone smartphone = facade.start();
        List<SmartphoneSensor> sensors = smartphone.getSensors();
        assertNotNull(sensors);
        assertFalse(sensors.isEmpty());
        assertEquals(2, sensors.size());
    }



}