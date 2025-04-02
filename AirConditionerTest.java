package TDDSnacksTest;

import TDDSnacks.AirConditioner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirConditionerTest {

    AirConditioner airConditioner = new AirConditioner(true);

    @Test
    public void testThatCheckIfAirConditionerIsOn(){
        assertEquals("It is on", airConditioner.switchOnAirConditioner());
    }
    @Test
    public void testThatCheckIfAirConditionerIsOff(){
        AirConditioner airConditioner = new AirConditioner(false);
        assertEquals("It is off", airConditioner.switchOffAirConditioner());
    }
    @Test
    public void testThatIncreaseTheAirConditionerTemperature(){
        assertEquals("Temperature is increased to 26", airConditioner.increaseTemperature(10));
    }
    @Test
    public void testThatDecreaseTheAirConditionerTemperature(){
        airConditioner.increaseTemperature(10);
        assertEquals("Temperature is decreased to 21", airConditioner.decreaseTemperature(5));
    }
    @Test
    public void testThatValidateTheMaximumTemperatureOfAirConditioner(){
        airConditioner.increaseTemperature(20);
        assertEquals("Temperature is still 30", airConditioner.increaseTemperature(15));
    }
    @Test
    public void testThatValidateTheMinimumTemperatureOfAirConditioner(){
        assertEquals("Temperature is still 16", airConditioner.decreaseTemperature(15));
    }
    @Test
    public void testThatGetCurrentTemperature(){
        assertEquals(16, airConditioner.getCurrentTemperature());
    }
    @Test
    public void testCurrentTemperatureGreaterThanSixteen(){
        airConditioner.increaseTemperature(10);
        assertEquals(26, airConditioner.getCurrentTemperature());
    }
}
