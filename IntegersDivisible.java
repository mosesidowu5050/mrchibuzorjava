public class IntegersDivisible{
	public static void main(String[] args){

int number = 30;
int result = findIntegersDivisibleByThree(number);
System.out.println("Sum Of The Integers Is: " + result);


}

public static int findIntegersDivisibleByThree(int number){
int sum = 0;

for(int counter = 3; counter <= number; counter = counter + 3){
	sum +=counter;
  }
  return sum;
  }
}



