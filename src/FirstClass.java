import java.lang.String;
import java.text.NumberFormat;
import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        double interest = 0;
        float annualInterest = 0;
        byte years = 0;

        while (true) {
            System.out.print("Enter your principal: ");
            principal = scanner.nextInt();
            if (principal > 1000 && principal < 1_000_000)
                break;
            System.out.println("Enter a valid value please.");

        }

        System.out.println("Principal: " + principal);

        while (true) {
            System.out.print("Interest: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest>1 && annualInterest < 30)
                break;
            System.out.println("Enter a valid value please.");
        }
        System.out.println("Annual Interest Rate: " + interest);

        while (true) {
            System.out.println("Period(Years): ");
            years = scanner.nextByte();
            if (years >=1 && years < 30) {
                break;
            }
            System.out.println("Enter a valid value please.");
        }
        System.out.println("Period (Years): " + years);
        double result = calculateMortgage(principal, annualInterest, years);
        String final_result = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage: " + final_result);
    }

    public static double calculateMortgage(
            int principal,
            double annualInterest,
            byte years) {

        final byte percent = 100;
        final byte months_in_year = 12;
        double num_payments = years * months_in_year;
        double monthly_interest_rate = annualInterest / months_in_year / years;
        double calculation = principal * (monthly_interest_rate * Math.pow(1+monthly_interest_rate, num_payments))/(Math.pow(1+monthly_interest_rate, num_payments) - 1);

        return calculation;
    }
}
