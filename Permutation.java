public class Permutation {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5};
        int[] n = new int [arr.length];
        int temp = 0;
        int nums = 0;

        for (int i = 1; i < 5; i++) {
            int count = 0;
            for (int k : arr) {
                if (k != i) {
                    count++;
                }
            }
            if(count > nums) {
                nums = count;
                temp = i;
                System.out.print(temp + " ");
            }
        }

    }
}
