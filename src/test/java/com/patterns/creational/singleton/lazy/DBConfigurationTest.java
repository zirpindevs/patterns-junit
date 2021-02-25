package com.patterns.creational.singleton.lazy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBConfigurationTest {

    DBConfiguration config1;
    DBConfiguration config2;

    @BeforeEach
    public void init(){
        config1 = DBConfiguration.getDBConfiguration(
                "jdbc:mariadb://locahost:65131",
                "customers",
                "root",
                "admin");

        config2 = DBConfiguration.getDBConfiguration(
                "jdbc:mysql://locahost:65129",
                "vehicles",
                "jose",
                "user");
    }


    @Test
    void getDBConfiguration() {
        assertNotNull(config1);
        assertNotNull(config2);
        assertSame(config1, config2);
        assertEquals(config1, config2);
        assertEquals(config1.getUrl(), config2.getUrl());
    }

    @Test
    void getUrl() {
        assertNotNull(config1.getUrl());
        assertInstanceOf(String.class, config1.getUrl());
    }

    @Test
    void setUrl() {
        String hola = "Hola";
        config1.setUrl(hola);
        assertEquals(hola, config1.getUrl());
    }

    @Test
    void getDatabase() {
        assertNotNull(config1.getDatabase());
        assertInstanceOf(String.class, config1.getDatabase());
    }

    @Test
    void setDatabase() {
        String hola = "Hola";
        config1.setDatabase(hola);
        assertEquals(hola, config1.getDatabase());
    }

    @Test
    void getUser() {
        assertNotNull(config1.getUser());
        assertInstanceOf(String.class, config1.getUser());
    }

    @Test
    void setUser() {
        String user = "Antonio";
        config1.setUser(user);
        assertEquals(user, config1.getUser());
    }

    @Test
    void getPassword() {
        assertNotNull(config1.getPassword());
        assertInstanceOf(String.class, config1.getPassword());
    }

    @Test
    void setPassword() {
        String pass = "password";
        config1.setPassword(pass);
        assertEquals(pass, config1.getPassword());
    }
}