import java.util.Scanner;
import java.util.Arrays;

class AirlineReservationsSystem {
    public static void main(String[] args) {
 
Scanner input = new Scanner(System.in);

boolean[] seatingChart = new boolean[10];
int firstClassSeats = 0;
int economySeats = 5;

for (int isEmpty = 0; isEmpty < seatingChart.length; isEmpty++){
   seatingChart[isEmpty] = false;
}



while (true) {
System.out.print("\nType 1 for First Class Section and " + "\nType 2 for Economy Class Section (press 0 to exit): ");
int userChoice = input.nextInt();

if (userChoice == 0) {
System.out.println("\nExiting system. Thank you!");
break;

}

if (userChoice == 1) { 
if (firstClassSeats < 5) { 
seatingChart[firstClassSeats] = true;
firstClassSeats++;

System.out.println("\nFirst Class Section >>> " + " \nAssigned Seat: " + firstClassSeats);

} else {
System.out.print("\nFirst Class is fully booked! " + "\nWould you like to be seated in Economy Class? (1 for Yes, 2 for No): ");
int seatOption = input.nextInt();

if (seatOption == 1 && economySeats < 10) {
seatingChart[economySeats] = true;
System.out.println("Economy Class Section >>> " + " \nAssigned Seat: " + (economySeats + 1));
economySeats++;

} else {
System.out.println("\nNext flight leaves in 3 hours...");

    }
  }
} 

else if (userChoice == 2) { 
if (economySeats < 10) { 
seatingChart[economySeats] = true;

System.out.println("\nEconomy Class Section >>> " + " \nAssigned Seat: " + (economySeats + 1));
economySeats++;

} else {
System.out.print("\nEconomy is fully booked! " + "\nWould you like a First Class seat instead? (1 for Yes, 2 for No): ");
int seatOption = input.nextInt();

if (seatOption == 1 && firstClassSeats < 5) {
seatingChart[firstClassSeats] = true;

System.out.println("First Class Section >>> " + " \nAssigned Seat: " + (firstClassSeats + 1));
firstClassSeats++;

} else {
System.out.println("\nNext flight leaves in 3 hours...");
    }
  }
} 

else {
System.out.println("Invalid input! Please enter 1 for First Class, 2 for Economy, or 0 to exit.");
  }
}

System.out.println("\nFinal Seating Chart: " + Arrays.toString(seatingChart)); 

   }
}