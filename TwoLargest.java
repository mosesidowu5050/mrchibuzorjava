	public class TwoLargest{
	public static void main(String[] args){

Scanner reader = new Scanner(System.in);

int count = 1;
int number;
int largest = 0;
int firstMax = Integer.MIN_VALUE;
int secondMax = Integer.MIN_VALUE;

for (count = 1; count <= 10; ++count){
	System.out.println("Enter number" + (count + 1) + ": ");
	number = reader.nextInt();

if (number > firstMax){
	secondMax = firstMax;
	firstMax = number;
} else if (number > secondMax);
	secondMax = number;
}

}

System.out.println("First Largest Number is: " + firstMax);
System.out.println("Second Largest Number is: " + secondMax);

}


}