import java.util.List;
import java.util.ArrayList;


	public class ArrayReturnEven{
	public static void main(String[] args){

List<Integer> reader = new ArrayList<Integer>();

	reader.add(301);
	reader.add(452);
	reader.add(773);
	reader.add(237);
	reader.add(424);
	reader.add(64);
	reader.add(135);
	reader.add(75);

System.out.print("Even Positions: ");

	for(int count = 2; count < 8; count = count + 2){
		System.out.print(reader.get(count) + " ");

}
	}


}