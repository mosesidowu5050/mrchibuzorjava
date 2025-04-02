public class Exercise4{
public static void main(String[] args){

int x = 7; int y = 3;

x = y++;

System.out.println("Value of first x is: " + x);
System.out.println("Value of second x is: " + ++x);
}

// the value of x after x=y++ is 3 and after x=++y value is 4.
}