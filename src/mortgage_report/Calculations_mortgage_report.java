package mortgage_report;

public class Calculations_mortgage_report {

    private final static byte PERCENT = 100;
    private final byte MONTHS_IN_YEAR = 12;

    private int principal;
    private float annualInterest;
    private byte years;

    public Calculations_mortgage_report(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(float numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getYears() * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }


    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getYears() * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public byte getYears() {
        return years;

    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    public double[] getRemainingBalance() {
        double[] balances = new double[getYears() * MONTHS_IN_YEAR];
        for (short month = 1; month <= balances.length; month++) {
            balances[month-1] = calculateBalance(month);
        }
        return balances;
    }
}
