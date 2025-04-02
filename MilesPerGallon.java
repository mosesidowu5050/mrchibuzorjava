import java.util.Scanner;

public class MilesPerGallon{
public static void main(String[] args){

Scanner reader = new Scanner(System.in);

double totalMiles = 0;     
double totalGallons = 0;   
double miles, gallons;

final double SENTINEL = -1;

while (true) {
	System.out.print("Enter miles traveled (or -1 to stop): ");
	miles = reader.nextDouble();

if (miles == SENTINEL) {
	break;  
}
System.out.print("Enter gallons of fuel used: ");
gallons = reader.nextDouble();

	totalMiles += miles;
	totalGallons += gallons;
}

if (totalGallons > 0) {
	double mpg = totalMiles / totalGallons;
	System.out.println("The average MPG for all trips is: " + mpg);
} else {
	System.out.println("No data entered for fuel usage.");
}

}


}