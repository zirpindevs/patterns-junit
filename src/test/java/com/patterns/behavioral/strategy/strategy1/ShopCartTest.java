package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopCartTest {

    @BeforeEach
    void setUp() {
        ShopCart trolley = new ShopCart();
    }

    @Test
    @DisplayName("Check cart")
    void testCart(){
        ShopCart shopCart = new ShopCart();
        assertNotNull(shopCart);
    }


}