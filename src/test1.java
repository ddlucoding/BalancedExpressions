import java.util.Arrays;

public class test1 {

    public static void main(String args[]){
        System.out.println("Start:");
        printNumbers(16);
        System.out.println("Finish!");
        int[] array1 = {2,3,4,5,6};
        int[][] array2 = new int[2][2];
        System.out.println(Arrays.toString(array1));
    }

    public static void printNumbers(int limit) {
        for (int i = 1; i < limit; i++) {
            System.out.println(i);
        }
    }

}
