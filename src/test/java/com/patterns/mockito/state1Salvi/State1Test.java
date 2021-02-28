package com.patterns.mockito.state1Salvi;

import com.patterns.behavioral.state.state1.DeviceContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class State1Test {


// captors:
  //  @Captor
  //  ArgumentCaptor<WeatherType> weatherTypeCaptor;

    // dependencias
   // @Mock
   // DeviceContext deviceContext;

    // generamos un mock mediante el metodo mock
  //  private GenericDAO mockGenericDao = mock(GenericDAO.class);
    // SUT - dependiente
    @InjectMocks
    DeviceContext deviceContext;


@Test
@DisplayName("testDeviceContext")
public void testDeviceContext() {
    deviceContext = new DeviceContext();
    assertNotNull(deviceContext);
    
}














}
