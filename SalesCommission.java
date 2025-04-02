import java.util.Scanner;

	public class SalesCommission{
	public static void main(String[] args){

Scanner reader = new Scanner(System.in);

double commissionPerWeek = 200;
double earning; double percentage = 9;

	System.out.println("Salesperson's Item Sold Last Week $: ");
	double itemSold = reader.nextDouble();

	earning = percentage / 100 * itemSold + commissionPerWeek;

	System.out.println("Salesperson's Earning Is: " + earning);

}

//$200 per week + 9% = 9/100 = 0.09 x $350.89 = 31.5 + 200 = $231.5801

}

