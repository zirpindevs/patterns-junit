package com.patterns.state1;

import com.patterns.behavioral.state.state1.DeviceContext;
import com.patterns.behavioral.state.state1.OffState;
import com.patterns.behavioral.state.state1.OnState;
import com.patterns.behavioral.state.state1.State;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("DeviceContextTest")
public class DeviceContextTest {

@Test
@DisplayName("the object type not Null")
void checkStatenotNull()  {
    DeviceContext stateContext = new DeviceContext();
    assertTrue(stateContext!= null);
}
    @Test
    @DisplayName("the object type DeviceContext")
    void createState()  {
        DeviceContext stateContext = new DeviceContext();
         assertTrue(stateContext instanceof DeviceContext);
}
   @Test
    @DisplayName("getDeviceStateOnIsnotNull")
    void getDeviceStateOnIsnotNull()  {
        DeviceContext stateContext = new DeviceContext();
       State start = new OnState();
       stateContext.setDeviceState(start);
        stateContext.doAction();
        assertTrue(stateContext.getDeviceState()!=null);
    }
    @Test
    @DisplayName("getDeviceStateOnIsnotEmpty")
    void getDeviceStateOnIsnotEmpty()  {
        DeviceContext stateContext = new DeviceContext();
        State start = new OnState();
        stateContext.setDeviceState(start);
        stateContext.doAction();
        assertTrue(!stateContext.getDeviceState().equals(""));
    }
    @Test
    @DisplayName("getDeviceStateOffnotNull")
    void getDeviceStateOffnotNull()  {
        DeviceContext stateContext = new DeviceContext();
        State stop = new OffState();
        stateContext.setDeviceState(stop);
        stateContext.doAction();
        assertTrue(stateContext.getDeviceState()!=null);
    }
    @Test
    @DisplayName("getDeviceStateOffIsnotEmpty")
    void getDeviceStateOffnotEmpty()  {
        DeviceContext stateContext = new DeviceContext();
        State stop = new OffState();
        stateContext.setDeviceState(stop);
        stateContext.doAction();
        assertTrue(!stateContext.getDeviceState().equals(""));
    }
    @Test
    @DisplayName("checkStateisON")
    void checkStateisON()  {
        DeviceContext stateContext = new DeviceContext();
        State start = new OnState();
        stateContext.setDeviceState(start);
        assertTrue(stateContext.getDeviceState() instanceof OnState);
    }


    @Test
    @DisplayName("checkStateisOFF")
    void checkStateisOFF()  {
        DeviceContext stateContext = new DeviceContext();
        State stop = new OffState();
        stateContext.setDeviceState(stop);
        assertTrue(stateContext.getDeviceState() instanceof OffState);
    }
}
