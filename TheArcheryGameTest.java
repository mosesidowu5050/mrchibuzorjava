import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TheArcheryGameTest {

	TheArcheryGame players = new TheArcheryGame();

	@Test
	public void testToCheckTheArcheryGame(){
	int[][] archeryGame = new int[4][3];
	int[][] actual = players.setPlayerScore(archeryGame);
	int[][] result = {{1, 4, 5}, {1, 2, 5}, {3, 6, 9}, {7, 9, 0}};
	assertArrayEquals(actual, result);
    }

	@Test
	public void testToCheckThePlayersTotalPoints(){
	int[][] archeryGame = new int[4][3];
	int[] totalPoints = new int[4];
	int[] actual = players.getThePlayersTotalPoints(archeryGame, totalPoints);
	int[] result = {15, 16, 22, 9};
	assertArrayEquals(actual, result);
    }

	@Test
	public void testToFindTheWinnerOFTheGame(){
	int[] totalPoints = new int[4];
	int actual = players.findTheWinner(totalPoints);
	int result = 1;
	assertEquals(actual, result);
    }
}