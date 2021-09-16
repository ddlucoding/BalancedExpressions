import java.util.Stack;

public class StacksDemo {
    public static void main(String[]args) {
        System.out.println(reverseString("abcdefghijklmnopqrstuvwxyz"));
        
        StringBuilder Daniel = new StringBuilder("hello");
        System.out.println(Daniel.reverse());
    }

    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        var array = str.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char character : array) {
            stack.push(character);
        }

        str = "";
        while (!stack.empty()) {
            char character = stack.peek();
            String c = String.valueOf(character);
            str = str.concat(c);
            stack.pop();
        }

        return str;

    }
}
