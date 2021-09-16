package mortgage_report;

public class Main_mortgage {

    public static void main(String[] args){
        Console myConsole = new Console();
        int principal = (int) myConsole.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) myConsole.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) myConsole.readNumber("Period (Years): ", 1, 30);

        var calculator = new Calculations_mortgage_report(principal, annualInterest, years);
        var report = new Mortgage_report(calculator);




        report.printMortgage();
        report.printPaymentSchedule();
    }

}
