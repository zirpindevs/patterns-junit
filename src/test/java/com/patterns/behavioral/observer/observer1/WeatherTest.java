package com.patterns.behavioral.observer.observer1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    @Test
    @BeforeEach
    void comienzo(){
        System.out.println("comienzo");
        //para crear los casos de test por cada llamada se limpiará la lista de observadores
        observers = new ArrayList<>();

        WeatherObserver computer = new Computer();
        WeatherObserver smartphone = new Smartphone();
    }
    @Test
    @DisplayName("Instancia Weather con lista vacia")
    void crearWeather(){
        Weather weather = new Weather();
        assertTrue(observers.size()==0);

    }

    @Test
    void addObserver() {
    }

    @Test
    void removeObserver() {
    }

    @Test
    void changeWeather() {
    }
}