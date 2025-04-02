import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AirlineReservationsSystemTest {


    @Test
    void testInitializeSeatingChart() {
    boolean[] expectedSeats = new boolean[10];
    assertArrayEquals(expectedSeats, AirlineReservationsSystem.initializeSeatingChart());
    }


    private void simulateUserInput(String input) {
    ByteArrayInputStream testInput = new ByteArrayInputStream(input.getBytes());
    System.setIn(testInput);
    }
}
