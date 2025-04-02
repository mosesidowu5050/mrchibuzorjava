import java.util.Scanner;

public class BackToSenderLogisticsServices {
  
    public static int ridersWage(int userOption){
        
        int amountPerParcel = 500, basePay = 5000;
        
        int total = 0;

        if (userOption <= 50){
        System.out.println("Successful Delivery... (Less than or equals to 50% deliveries).");
           total = (userOption * amountPerParcel) + basePay;
        }
        if (userOption >= 50 && userOption <= 59){
        System.out.println("Successful Delivery... (Between the range of 50% - 59% deliveries).)");
            total = (userOption * amountPerParcel) + basePay;
        }
        else if (userOption >= 60 && userOption <= 69){
        System.out.println("Successful Delivery... (Between the range of 60% - 69% deliveries).");
            total = (userOption * amountPerParcel) + basePay;
        }
        else if (userOption >= 70){
        System.out.println("Successful Delivery... (Gretear than or equals to 70% deliveries).");
            total = (userOption * amountPerParcel) + basePay;
        }

        return total;
    }

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
    while (true) {
        System.out.println("\nRider's Number Of Successful Delivery...");
        int userOption = reader.nextInt();
        System.out.printf("%s\t%d\n", "Rider's Payment at the close of the day is: ", ridersWage(userOption));

        if (userOption == 0){
            System.out.println("\nExisting...");       
            break; 
        }
      
            
      }
        
    }
     
    }
