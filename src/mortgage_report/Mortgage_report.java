package mortgage_report;

import java.text.NumberFormat;

public class Mortgage_report {
    private Calculations_mortgage_report calculator;

    public Mortgage_report(Calculations_mortgage_report calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double i : calculator.getRemainingBalance())
            System.out.println(NumberFormat.getCurrencyInstance().format(i));

    }
}
