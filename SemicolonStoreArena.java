import java.util.Scanner;

public class SemicolonStoreArena{
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

System.out.println("Products deatils in your cart's: \n");
String [] items = new String[5];
	items[0] = "\t1. INDOMIE [Price: 500 per unit]";
	items[1] = "\t2. RICE [Price: 2,500 per unit]";
	items[2] = "\t3. GARRI [Price: 1,500 per unit]";
	items[3] = "\t4. BAMA [Price: 2,000 per unit]";
	items[4] = "\t5. BEANS [Price: 1,300 per unit]\n";

for (int c = 0; c < items.length; c++){
		System.out.println(items[c]);
}

        String userBuy;
        int noOfGoods;
        double usersPrice;
        String userChoice;
        String cashierName = " ";
        double userDiscount = 0;
        double total = 0;

        String userBuy1;
        int noOfGoods1;
        double usersPrice1; double userPayment;

        System.out.println("What is the customer's name ? ");
        String customerName = reader.nextLine();

        System.out.println("What did the user buy? ");
        userBuy = reader.next();
        
        System.out.println("How many pieces? ");
        noOfGoods = reader.nextInt();

        System.out.println("How much per unit? ");
        usersPrice = reader.nextDouble();

        System.out.println("Add more items? (yes/no) ");
        userChoice = reader.next();

    
    do {
        System.out.println("What did the user buy? ");
        userBuy1 = reader.next();
        
        System.out.println("How many pieces? ");
        noOfGoods1 = reader.nextInt();

        System.out.println("How much per unit? ");
        usersPrice1 = reader.nextDouble();

        System.out.println("Add more items? (yes/no) ");
        userChoice = reader.next();

    } while (userChoice.equalsIgnoreCase("Yes"));
	
    if (userChoice.equalsIgnoreCase("No")){
    
        System.out.println("Cashier's name ? ");
        cashierName = reader.next();
    
        System.out.println("How much discount will he/she get? ");
        userDiscount = reader.nextDouble();

    }
        
	total = usersPrice * noOfGoods;
     double total1 = usersPrice1 * noOfGoods1;
     double subTotal = total + total1;
     double discount = (userDiscount  / 100) * subTotal;
     double vat = (17.50 / 100) * subTotal;
     double billTotal = subTotal + vat - discount;
		
        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("TEL: 03293020343");
        System.out.println("DATE: 4 - JAN - 25, 10:45:12 PM ");
        System.out.println("CASHIER NAME: " + cashierName);
        System.out.println("CUSTOMER NAME: " + customerName);
        
        System.out.println("==========================================================================");
        System.out.printf("\t%s\t\t%s\t\t%s\t\t%s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("\n-------------------------------------------------------------------------- ");
		
        System.out.printf("\t%s\t\t%d\t\t%.2f\t\t%.2f\n", userBuy, noOfGoods, usersPrice, total);    
        System.out.printf("\t%s\t\t%d\t\t%.2f\t\t%.2f", userBuy1, noOfGoods1, usersPrice1, total1);    
        System.out.println("\n-------------------------------------------------------------------------- ");
        System.out.printf("%50s\t%.2f \n%50s\t%.2f \n%50s\t%.2f", "Sub Total: ", subTotal, "Discount: ", discount, "VAT @17.50%: ", vat);
        System.out.println("\n==========================================================================");
        System.out.printf("%50s\t%.2f ", "Bill Total: ", billTotal);
        System.out.println("\n==========================================================================");
        System.out.println("\tTHIS IS NOT AN RECEIPT KINDLY PAY " + billTotal);
        System.out.println("\n==========================================================================\n");

        
        System.out.println("How much did the customer pay? ");
        userPayment = reader.nextDouble();

        double balance = userPayment - billTotal; 
           
        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("TEL: 03293020343");
        System.out.println("DATE: 4 - JAN - 25 10:45:12 PM ");
        System.out.println("CASHIER NAME: " + cashierName);
        System.out.println("CUSTOMER NAME: " + customerName);
        
        System.out.println("==========================================================================");
        System.out.printf("\t%s\t\t%s\t\t%s\t\t%s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("\n-------------------------------------------------------------------------- ");
        System.out.printf("\t%s\t\t%d\t\t%.2f\t\t%.2f\n", userBuy, noOfGoods, usersPrice, total);    
        System.out.printf("\t%s\t\t%d\t\t%.2f\t\t%.2f", userBuy1, noOfGoods1, usersPrice1, total1);    
        System.out.println("\n-------------------------------------------------------------------------- ");
        System.out.printf("%50s\t%.2f \n%50s\t%.2f \n%50s\t%.2f", "Sub Total: ", subTotal, "Discount: ", discount, "VAT @17.50%: ", vat);
        System.out.println("\n==========================================================================");
        System.out.printf("%50s\t%.2f \n%50s\t%.2f \n%50s\t%.2f", "Bill Total: ", billTotal, "Amount Paid: ", userPayment, "Balance: ", balance);
      
        System.out.println("\n==========================================================================");
        System.out.printf("%25s", "THANKS FOR YOUR PATRONAGE");
        System.out.println("\n==========================================================================");

      }
 }

