import java.util.Scanner;

public class Exercise3{
public static void main(String[] args){

Scanner userReader = new Scanner(System.in);

int count = 1;
int number;
int factorial = 1;

//control statement can be combine by selection and iteration


//Exercise 4.13
//for loop would be appropriate for obtaining an input from the user.

//for (count = 1; count <= 3; count++){
//	System.out.println("Enter number: " + count);
//	number = userReader.nextInt();
//}


//for loop would be appropriate for calculating the factorial of 5.

public static long factorial(int number){

long factorial = 1;
for (int counter = 1; counter >= number; counter++){
	factorial *= counter;
}
return factorial;
}
System.out.println(factorial(5));

}



}