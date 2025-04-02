import java.util.Scanner;

class Petrol {
   public static void main(String[] args){

PetrolPurchase client1 = new PetrolPurchase("Location: Sabo, Yaba", "Petrol Type: Diesel");

Scanner scan = new Scanner(System.in);

System.out.print("What is the quantity: $");
int rate = scan.nextInt();
client1.theQuantity(rate);

System.out.print("What is the price per liter: $");
double priceLiter = scan.nextDouble();
client1.thePricePerLiter(priceLiter);

System.out.print("What is customer discount: $");
double discountRate = scan.nextDouble();
client1.theDiscount(discountRate);

//System.out.printf("%s%s%s%s", "Location: ", client1.getLocation(), "Type Of Petrol", client1.getPetrolType);
//System.out.printf("%s%d", "Quantity Is: ", client1.getQuatity());
System.out.printf("%s%.2f", "Price Per Liter Is: ", client1.getPricePerLiter());
System.out.println();
System.out.printf("%s%.2f", "Discount Rate Is: ", client1.getDiscount());
System.out.println();
System.out.printf("%s%.2f", "Your Payment Is: ", client1.getPurchaseAmount());
   }
}