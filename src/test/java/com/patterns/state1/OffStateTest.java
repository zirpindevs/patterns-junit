package com.patterns.state1;

import com.patterns.behavioral.state.state1.OffState;
import com.patterns.behavioral.state.state1.State;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("offState")
public class OffStateTest {

    @Test
    @DisplayName("offStatenotNull")
    void offStatenotNull()  {
        State stop = new OffState();
        assertTrue(stop!= null);
    }
    @Test
    @DisplayName("offStateisoffState")
    void offStateisoffState()  {
        State stop = new OffState();
        assertTrue(stop instanceof OffState);

    }

}
