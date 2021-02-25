package com.patterns.creational.singleton.eager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    @Test
    void getInstance() {
        assertNotNull(singleton1);
        assertSame(singleton1, singleton2);
        assertEquals(singleton1, singleton2);
    }
}