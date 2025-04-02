import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class IntegersDivisibleTest {

	IntegersDivisible divisibleByThree = new IntegersDivisible();

	@Test
	public void testToCheckIntegersDivisibleByThree(){
	int actual = divisibleByThree.findIntegersDivisibleByThree(30);
	int expected = 165;
	assertEquals(actual, expected);
   }
}