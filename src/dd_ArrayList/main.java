package dd_ArrayList;

import java.util.ArrayList;

public class main {

    public static void main(String[]args){
        int[] numbers_1 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        var numbers = new DDArrayList(numbers_1);

        numbers.removeAtIndex(7);
        System.out.println(numbers.printNumbers());
    }

    public static String intersection(int[] a, int[] b) {
        ArrayList<Integer> intersection = new ArrayList<>();
        DDArrayList obj = new DDArrayList(a);
        for (int i : a) {
            for (int j : b) {
                if (i==j)
                    intersection.add(i);
            }
        }
        return intersection.toString();
    }
}
