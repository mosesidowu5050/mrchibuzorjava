import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClockTesting {

    @Test
    void testValidClockInitialization() {
        Clock clock = new Clock();

        assertEquals(12, clock.getHour());
        assertEquals(30, clock.getMinutes());
        assertEquals(45, clock.getSeconds());
//        assertEquals("12:30:45", clock.displayTime());
    }
}