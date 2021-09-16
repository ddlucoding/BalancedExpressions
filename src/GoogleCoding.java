import java.util.Arrays;

public class GoogleCoding {
    public static void main(String[]args) {
        int[] array = {2,3,0,6,7,-1};
        returnNthSmallest(array, 1);


    }
    public static void returnNthSmallest(int[] array, int n) {
        Arrays.sort(array);
        System.out.println(array[n-1]);
    }
}
