import java.util.Scanner;

public class fizzbuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");

        int input = scanner.nextInt();

        if (input % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (input % 5 == 0) {
            System.out.println("Fizz");
        } else if (input % 3==0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println(input);
        }

    }
}

