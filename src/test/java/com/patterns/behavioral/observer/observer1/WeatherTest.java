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

        assertNotNull(computer);;
        assertNotNull(smartphone);
    }
    @Test
    @DisplayName("Instancia Weather con lista vacia")
    void crearWeather(){
        Weather weather = new Weather();
        Computer computer = new Computer();
        WeatherObserver smartphone = new Smartphone();
        weather.addObserver(computer);
        weather.addObserver(smartphone);
        weather.changeWeather(WeatherType.SUNNY);
        assertTrue(computer.getReceivedMessages().contains("Computer has been notified of weather change: " + WeatherType.SUNNY));

    }

    @Test
    @DisplayName("Añadir Observador")
    void addObserver() {
        int size = 0;

        WeatherObserver computer = new Computer();
        WeatherObserver smartphone = new Smartphone();
        observers.add(computer);
        assertTrue(observers.size()>0);
        size = observers.size();
        observers.add(smartphone);

        for (WeatherObserver observer:this.observers){
            assertNotEquals(size,observers.size());

        }
    }

    @Test
    @DisplayName("Eliminar Observador")
    void removeObserver() {
        observers = new ArrayList<>();
        WeatherObserver computer = new Computer();
        WeatherObserver smartphone = new Smartphone();
        observers.add(computer);
        observers.add(smartphone);
        int count = observers.size();

        observers.remove(computer);
        int count2 = observers.size();
        assertNotEquals(count,count2);
    }

    @Test
    @DisplayName("cambiar el tiempo")//parametros
    void changeWeather() {
        WeatherType type = WeatherType.RAINY;
        WeatherObserver computer = new Computer();
        computer.update(type);
        assertNotNull(computer);

    }
}