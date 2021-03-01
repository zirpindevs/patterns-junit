package com.patterns.mockito.prototypeAndres;

import com.patterns.creational.prototype.Circle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TestPrototypeMockito1 {

    @Mock
    Circle circle;

    @Test
    void test1() throws CloneNotSupportedException {
        when(circle.area()).thenReturn(4.5);
        when(circle.getColor()).thenReturn("negro");

        assertEquals(4.5,circle.area());

        System.out.println(circle.area());
        System.out.println(circle.getColor());
        System.out.println(circle.toString());
        System.out.println("-----------------------------");
    }

    @Test
    void test2(){
        circle.setRadio(3.0);

        ArgumentCaptor<Double> argumentCaptor = ArgumentCaptor.forClass(Double.class);
        verify(circle).setRadio(argumentCaptor.capture());

        assertEquals(3.0, argumentCaptor.getValue());
        System.out.println("-----------------------------");
    }

    @Test
    void test3() throws CloneNotSupportedException {

        when(circle.clone()).thenReturn(new Circle("fucsia", 100.0));

        System.out.println(circle.clone());

        verify(circle, times(1)).clone();

        System.out.println("-----------------------------");
    }
}

