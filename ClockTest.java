import java.util.Scanner;

public class ClockTest {
	public static void main(String[] args){

Clock time = new Clock ();

Scanner scan = new Scanner(System.in);

System.out.println();

System.out.print("Enter hour: ");
int hourTime = scan.nextInt();
time.hour(hourTime);

System.out.print("Enter minutes: ");
int minutesTime = scan.nextInt();
time.minutes(minutesTime);

System.out.print("Enter seconds: ");
int secondsTime = scan.nextInt();
time.seconds(secondsTime);

System.out.println("Updated Time: " + time.getDisplayTime());

  }
}