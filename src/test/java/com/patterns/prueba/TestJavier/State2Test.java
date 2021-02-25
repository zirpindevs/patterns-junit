package com.patterns.prueba.TestJavier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.patterns.behavioral.state.state2.Device;
import com.patterns.behavioral.state.state2.Off;
import com.patterns.behavioral.state.state2.On;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class State2Test {


    @BeforeAll
    static  void setupClass(){
        System.out.println("init test");
    }
    @AfterAll
    static void tearDown(){
        System.out.println("AfterAll");
    }



}
