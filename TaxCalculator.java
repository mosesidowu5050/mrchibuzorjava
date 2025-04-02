import java.util.Scanner;
	
	public class TaxCalculator{
	public static void main(String[] args){

Scanner reader = new Scanner(System.in);

double thomas;
double chris;
double victoria;
double totalTax = 0;
double taxRatePercentage = 15;
double excessTaxPercentage = 20;

final double SENTINEL = 0;

while (true){
	System.out.println("Thomas earnings with tax rate of 15% (or 0 to end)");
	thomas = reader.nextDouble();

if (thomas == SENTINEL){
	break;

}
System.out.println("Chris earnings with tax rate of 20% (or 0 to end)");
	chris = reader.nextDouble();

System.out.println("Victoria earnings with tax rate of 15% (or 0 to end)");
	victoria = reader.nextDouble();

	totalTax = taxRatePercentage + excessTaxPercentage + taxRatePercentage;
}
System.out.println("Total Tax Is: " + totalTax);


}


}


//15% for earning 30,000 by each citizens
//20% for earning in excess
//Thomas from US tax 15%, Chris from UK tax 20%, Victoria from Canada tax 15%.. 
//Total tax is 50%

//15% = 15/100 = 0.15 * 30,000 = 4,500
//20% = 20/100 = 0.2 * 30,000 = 6,000