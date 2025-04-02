import java.security.SecureRandom;
import java.util.Arrays;


public class TheArcheryGame {
static SecureRandom randomNumber = new SecureRandom();
static int[] totalPoints = new int[4];

	public static void main(String[]args){

int[][] archeryGame = new int[4][3];
int[] eachPlayersScore = new int[4];

archeryGame = setPlayerScore(archeryGame);
int[] playersScores = getThePlayersTotalPoints(archeryGame, eachPlayersScore);

System.out.println("PLAYER NUMBER  |  1ST SCORE  |  2ND SCORE  |  THIRD SCORE  |  SCORES AFTER 3RD CHANCES");
for (int row = 0; row < archeryGame.length; row++){
 System.out.print("Player " + (row + 1) + " points: ");
   for (int column = 0; column < archeryGame[row].length; column++){
     System.out.printf("%10d", archeryGame[row][column]);
    
     }
     System.out.printf("                     %d%n", playersScores[row]);
   }
int winner = findTheWinner(playersScores);
System.out.println("\nThe winner is Player " + winner + "!");

 }


public static int[][] setPlayerScore (int[][] playerScores){

for (int row = 0; row < playerScores.length; row++){
int total = 0;

   for (int column = 0; column < playerScores[row].length; column++){
      int points = 0 + randomNumber.nextInt(10);
        playerScores[row][column] = points; 
         total += points;
     }
	totalPoints[row] = total;
   } 
   return playerScores;
  }


public static int[] getThePlayersTotalPoints(int[][] playerScores, int[] playersTotalPoints) {
 for (int row = 0; row < playerScores.length; row++) {
 int total = 0;
    for (int column = 0; column < playerScores[row].length; column++) {
      total += playerScores[row][column];
   }
       playersTotalPoints[row] = total;
    }
    return playersTotalPoints;
 }


public static int findTheWinner(int[] playerScores){
int highestScore = playerScores[0];
int winner = 1;

  for (int check = 1; check < playerScores.length; check++){
	if (playerScores[check] > highestScore){
            highestScore = playerScores[check];
            winner = check + 1;
      }
    }
    return winner;

  }
}