public class Exercise6{
public static void main(String[] args){

int x = -2; int y = 0; int total = 0;

while (x <= 10){
	y = x + 2;
	x++;
	total += y;

}
System.out.printf("Y is: %d and total is %d\n", y, total);

}


}