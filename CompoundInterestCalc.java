import java.util.Scanner;

public class CompoundInterestCalc {
    
    static double displayCompundCalculation (double initial, double contribution, double length, double interestPercentage, int compound){

        double result = 0;
        int daily = 365; int monthly = 12; 

    if (compound == 1){
        result = initial * Math.pow(1 + interestPercentage / daily, daily * length) + contribution * ((Math.pow(1 + interestPercentage / daily, daily * length) - 1) / (interestPercentage / daily));
    }
    else if (compound == 2){
        result = initial * Math.pow(1 + interestPercentage / monthly, monthly * length) + contribution * ((Math.pow(1 + interestPercentage / monthly, monthly * length) - 1) / (interestPercentage / monthly)); 
    }
    else if (compound == 3){
        result = initial * Math.pow(1 + interestPercentage, length) + contribution * ((Math.pow(1 + interestPercentage, length) - 1) / (interestPercentage));
    }
        return result;
    
    }

    public static void main(String[] args) {
     
    Scanner reader = new Scanner(System.in);

    System.out.println("\tCompound Interest Calculator");
    System.out.println("Determine how much your money can grow using the power of compound calculator.");

    System.out.println("\nEnter your Initial Investment ");
    double initial = reader.nextDouble();

    System.out.println("Enter your Monthly Contribution ");
    double contribution = reader.nextDouble();
    
    System.out.println("\nEnter Length of Time In Years");
    double length = reader.nextDouble();

    System.out.println("Enter your Estimated Interest Rate");
    double interest = reader.nextDouble();
    double interestPercentage = interest / 100;
     
    System.out.println(""" 
        \nChoose Compound Frequency...
    
    1. Daily
    2. Monthly
    3. Annually

    """);

    while (true){
            System.out.println("Select your times per year that interest will be compounded");
            int compound = reader.nextInt();

        if (compound >= 1 && compound <= 3){
            double totalResult = displayCompundCalculation(initial, contribution, length, interestPercentage, compound);
            System.out.printf("%s%.0f%s%.2f", "At the end of ", length, "year/years your money is: $", totalResult);
            break;
        } 
        else if (compound == 0 || compound > 3){
            System.out.println("Error...");
    }
            break;
    }

        }
}


