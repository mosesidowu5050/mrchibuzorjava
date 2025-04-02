import java.util.Scanner;

public class PizzaWahalaApp {
 public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);

  System.out.println("""
        \n\tIYA MOSES PIZZA JOINT AJEGUNLE

    PIZZA TYPE          NUMBER OF SLICES        PRICE PER BOX
1.  Supa size               4                       2,500

2.  Small Money             6                       2,900

3.  Big Boys                8                       4,000

5.  Odogwu                  12                      5,200

0.  Exit...

    """);

    System.out.println("Hello, You are welcome to Iya Moses Pizza Joint...");
    
while (true){
    System.out.println("You can enter your choice of Pizza Type from (1 - 5) and (press 0 to Exit)...");
    int userOption = reader.nextInt();
if (userOption == 5){
    System.out.println("\nEnter the number of people you want to order for? ...");
    int option1 = reader.nextInt();
    
if (option1 == 45){
    System.out.println("\nNumber of boxes of pizza to buy = 4 boxes (explanation: Odogwu size contains 12 slices per box, 4 boxes should be sufficient for 45 persons as it would contain 48 slices in all).");
    System.out.println("Number left over slices after serving = 3 slices (explanation: After serving 45 slices, you should have 3 slices left).");
    System.out.println("\nPrice = 20,800 (explanation: 5,200 per box for 4 boxes).");
    }
else if (option1 == 1){
    System.out.println("\nNumber of box of pizza to buy = 1 box (explanation: Odogwu size contains 12 slices per box).");
    System.out.println("\nPrice = 5,200.");
    }
}
else if (userOption == 0){
    System.out.println("\nExit... Thanks for your patronage!!!");
    break;  
}
                  
    } 
        

}


 }
