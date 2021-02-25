package com.patterns.behavioral.observer.observer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteSubjectTest {

    @Test
    void addSubscriberTest() {
        ConcreteSubject elon = new ConcreteSubject("@elonmusk");
        Observer bloomberg = new ConcreteObserver("Bloomberg");
        assertEquals(0, elon.observers.size());
        elon.addSubscriber(bloomberg);
        assertTrue(elon.handle == "@elonmusk");
        assertEquals(1, elon.observers.size());

    }

    @Test
    void removeSubscriberTest() {
        ConcreteSubject elon = new ConcreteSubject("@elonmusk");
        Observer bloomberg = new ConcreteObserver("Bloomberg");
        elon.addSubscriber(bloomberg);
        assertEquals(1, elon.observers.size());
        elon.removeSubscriber(bloomberg);
        assertEquals(0, elon.observers.size());

    }

    @Test
    void notifySubscribersTest() {


    }

    @Test
    void tweetTest() {
        ConcreteSubject elon = new ConcreteSubject("@elonmusk");
        Observer bloomberg = new ConcreteObserver("Bloomberg");
        String testname;


    }
}