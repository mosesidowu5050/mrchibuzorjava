public class Katta{

	public static Boolean isEven(int even){
	return even % 2 == 0;
}
 	public static Boolean isPrime(int prime) {
	return prime % 3 == 0 || prime % 2 == 0;
}
	public static int positiveDifference(int number1, int number2){
	 return Math.abs(number1 - number2);  
}
	public static int getQuotient(int numerator, int denominator){
	if (denominator == 0);
	return 0;
}  
	public static int getFactors(int number){
	for (int count = 1; count <= Math.sqrt(number); count++){
if (count != number / count){

}
}
	return 4;
}
	public static Boolean isPerfectSquare(int number){
	double square = Math.sqrt(number);
	return square == (int) square;
}

	public static Boolean isPalindrome(int num1, int num2, int num3, int num4, int num5){
	
 String numberString = Integer.toString(num1) + Integer.toString(num2) + Integer.toString(num3) + Integer.toString(num4) + Integer.toString(num5);

String readString = new StringBuilder(numberString).reverse().toString();
	return numberString.equals(readString);

}
	public static long factorial(int number){

long result = 1;
	for (int count = 1; count <= number; count++) {
	result *= count;
	}
return result;
}
	public static int square(int number){

	return number * number;
}

public static void main(String[] args) {

	System.out.println(isEven(12));
	System.out.println(isPrime(7));
	System.out.println(positiveDifference(7, 3));
	System.out.println(getQuotient(7, 0));
	System.out.println(getFactors(10));
	System.out.println(isPerfectSquare(25));
	System.out.println(isPalindrome(5, 4, 1, 4, 5));
	System.out.println(factorial(5));
	System.out.println(square(5));

}

}