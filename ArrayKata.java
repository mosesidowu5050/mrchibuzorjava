public class ArrayKata{
    public static int arr[] = { 23, 324, 65, 84, 9 };

	static int getMinimum(){
	int min = arr[0];

	for (int a = 1; a < arr.length; a++){
	if (arr[a] < min){
	min = arr[a];
    }
  }
        return min;
}
	static int getMaximum(){
	int max = arr[0];

	for(int b = 1; b < arr.length; b++){
	if (arr[b] > max){
	max = arr[b];
   } 
 }
	return max;
}
	public static int getSum(){
	int sum = arr[0];

	for(int c = 1; c < arr.length; c++){
		sum += arr[c];
}
	return sum;
}



   public static void main(String[] args){

	System.out.println("\nLargest Is: " + getMaximum());
        System.out.println("\nSmallest Is: " + getMinimum());
	System.out.println("\nSum Is: " + getSum());

    }
}