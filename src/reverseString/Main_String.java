package reverseString;

import java.util.Arrays;

public class Main_String {

    public static void main(String[]args) {
        String[] words = {"David", "Daniel", "Sophia", "Teddy Betty", "Mr. Fish"};
        System.out.println(reverseStringArray(words));

    }

    public static String reverseStringArray(String[] array) {
        if (array.length == 0 || array==null) {
           return null;
        }
        for (int x = 0; x < array.length / 2; x++) {
            String n = array[x];
            String m = array[array.length - 1 - x];
            array[x] = m;
            array[array.length - 1 - x] = n;
        }
        return Arrays.toString(array);

    }
}
