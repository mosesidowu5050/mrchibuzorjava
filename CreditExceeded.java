import java.util.Scanner;

public class CreditExceeded{
public static void main(String[] args){

Scanner reader = new Scanner(System.in);

double newBalance = 0; 
double balanceBeginning; 
double itemCharge;
double creditApplied;
double creditLimit;

final double SENTINEL = -1;

	System.out.println(" Account Number: 3090705020");

while (true){
	System.out.println("Enter Balance at the Beginning (or -1 to end)");
	balanceBeginning = reader.nextDouble();

if (balanceBeginning == SENTINEL){
	break;
}
	System.out.println("Total Items Charged This Month (or -1 to end)");
	itemCharge = reader.nextDouble();

	System.out.println("Total Credits Applied This Month (or -1 to end)");
	creditApplied = reader.nextDouble();

	System.out.println("Credits Limit This Month (or -1 to end)");
	creditLimit = reader.nextDouble();

	newBalance = balanceBeginning + itemCharge - creditLimit;

if (newBalance < creditLimit);

}
	System.out.println("New Customer Balance Is: " + newBalance);
	System.out.println("Credit Limit Exceeded");



	}


}