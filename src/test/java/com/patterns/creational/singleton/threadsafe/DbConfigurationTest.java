package com.patterns.creational.singleton.threadsafe;

import com.patterns.creational.singleton.threadsafe.DbConfiguration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DbConfigurationTest {

    DbConfiguration config1 = DbConfiguration.getDBConfiguration();
    DbConfiguration config2 = DbConfiguration.getDBConfiguration();

    @Test
    void getInstance() {
        assertNotNull(config1);
        assertSame(config1, config2);
        assertEquals(config1, config2);
    }
  
}