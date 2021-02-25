package com.patterns.creational.builder.builder1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    @DisplayName("User name")
    void createUserName() {
        User user = new User.Builder()
                .setFirstName("Juan")
                .build();

        assertEquals(user.getFirstName(), "Juan");
    }

    @Test
    @DisplayName("User married")
    void createUserMarried() {
        User user = new User.Builder()
                .setMarried(true)
                .build();

        assertEquals(user.getMarried(), true);
    }

    @Test
    @DisplayName("User age")
    void createUserAge() {
        User user = new User.Builder()
                .setAge(23)
                .build();

        assertEquals(user.getAge(), 23);

    }


    @Test
    @DisplayName("User age")
    void createUser() {
        User user = new User.Builder()
                .setFirstName("Juan")
                .setAge(23)
                .setMarried(true)
                .build();

        assertTrue(user instanceof User);

    }

    @Test
    @DisplayName("User not null")
    void notNullUser() {
        User user = new User.Builder().build();

        assertNotNull(user);
    }

}