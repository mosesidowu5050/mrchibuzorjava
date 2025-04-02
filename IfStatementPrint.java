import java.util.Scanner;

public class IfStatementPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many times would you like to greet? ");
        int greetings = input.nextInt();

        ifStatmentControl(greetings); 
        
    }

    public static void ifStatmentControl(int counting) {
        if (counting > 0) { 
            System.out.println("Hello");
	int result = counting - 1;
            ifStatmentControl(result); 
        }
    }
}
