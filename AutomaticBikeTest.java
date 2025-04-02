package TDDSnacksTest;

import TDDSnacks.AutomaticBike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AutomaticBikeTest {

    private AutomaticBike autoBike;
    @Before
    public void setUp() {
        autoBike = new AutomaticBike(true);
    }

    @Test
    public void testThatCheckIfBikeIsOn() {
        assertEquals("Bike is on", autoBike.turnOnBike());
    }

    @Test
    public void testThatCheckIfTheBikeIsOff() {
        assertEquals("Bike is off", autoBike.turnOffBike());
    }

    @Test
    public void testThatThrowsExceptionIfGearIsGreaterThanFour() {
        assertThrows(IllegalArgumentException.class, () -> {
            autoBike.changeGear(6);
        });
    }

    @Test
    public void testThatThrowsExceptionIfGearIsLessThanOne() {
        assertThrows(IllegalArgumentException.class, () -> {
            autoBike.changeGear(-1);
        });
    }

    @Test
    public void testThatCheckIfBikeAccelerateInGearOne() {
        autoBike.changeGear(1);
        autoBike.accelerate();
        autoBike.accelerate();
        assertEquals( 2, autoBike.getCurrentSpeed());
    }

    @Test
    public void testThatCheckIfBikeAccelerateInGearTwo() {
        autoBike.changeGear(2);
        autoBike.accelerate();
        assertEquals( 2, autoBike.getCurrentSpeed());
    }

    @Test
    public void testThatCheckIfBikeAccelerateInGearThree() {
        autoBike.changeGear(3);
        autoBike.accelerate();
        assertEquals( 3, autoBike.getCurrentSpeed());
    }

    @Test
    public void testThatCheckIfBikeAccelerateInGearFour() {
        autoBike.changeGear(4);
        autoBike.accelerate();
        assertEquals(4, autoBike.getCurrentSpeed());
    }

    @Test
    public void testThatCheckIfBikeDecelerateInGearOne() {
        autoBike.changeGear(1);
        autoBike.accelerate();
        autoBike.decelerate();
        assertEquals( 0, autoBike.getCurrentSpeed());
    }

    @Test
    public void testThatCheckIfBikeDecelerateInGearThree() {
        autoBike.changeGear(3);
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.decelerate();
        assertEquals( 3, autoBike.getCurrentSpeed());
    }

    @Test
    public void testThatCheckGearOneChangesAutomaticallyToGearTwo() {
        autoBike.changeGear(1);
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();

    assertEquals(2, autoBike.getCurrentGear());
    }

    @Test
    public void testThatCheckGearTwoChangesAutomaticallyToGearThree(){
        autoBike.changeGear(1);
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.changeGear(2);
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();

        assertEquals(3, autoBike.getCurrentGear());
}

    @Test
    public void testThatCheckGearThreeChangesAutomaticallyToGearFour() {
        autoBike.changeGear(1);
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.changeGear(2);
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.changeGear(3);
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();
        autoBike.accelerate();

        assertEquals(4, autoBike.getCurrentGear());
    }
    @Test
    public void testThatDecelerateGearTwoToGearOne() {
        autoBike.changeGear(1);
        for(int speed = 0; speed < 22; speed++){
            autoBike.accelerate();
        }
        for (int speed = 0; speed < 5; speed++){
            autoBike.decelerate();
        }
        assertEquals( 1, autoBike.getCurrentGear());
    }

    @Test
    public void testThatDecelerateGearThreeToTwo(){
        autoBike.changeGear(1);
        for (int speed = 0; speed < 31; speed++){
            autoBike.accelerate();
        }
        for (int speed = 0; speed < 5; speed++){
            autoBike.decelerate();
        }
        assertEquals( 2, autoBike.getCurrentGear());
    }

    @Test
    public void testThatDecelerateGearFourToThree(){
        autoBike.changeGear(1);
        for (int speed = 0; speed < 41; speed++){
            autoBike.accelerate();
        }
        for (int speed = 0; speed < 12; speed++){
            autoBike.decelerate();
        }
        assertEquals( 3, autoBike.getCurrentGear());
    }

    @Test
    public void testThrowsExceptionsIfSpeedIsBelowZero(){
        assertThrows(IllegalArgumentException.class, () -> {
                autoBike.decelerate();
        });
    }
}
