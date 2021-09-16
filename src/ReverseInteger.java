import java.util.Stack;

public class ReverseInteger {
        public static void main(String[]args) {
            System.out.println(reverse(134));
        }
        public static int reverse(int x) {
            int num = (int) Math.floor(Math.log((double) x));
            int powOfTen = (int) Math.pow(10, num);
            int returnNum = 0;

            Stack<Integer> stack = new Stack<>();
            while (powOfTen >= 1) {
                stack.push((int) Math.floor(num/powOfTen));
                powOfTen = powOfTen/10;
            }
            powOfTen = (int) Math.pow(10, num);
            while (!stack.isEmpty()) {
                num += stack.pop() * powOfTen;
                powOfTen = powOfTen/10;
            }
            return returnNum;
        }
}
