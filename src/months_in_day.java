public class months_in_day {

    public static void main(String[]args) {
        System.out.println(numDaysOfMonth("June"));
    }

    private static String numDaysOfMonth(String month) {
        int numDays = 0;
        if (month == null) {
            return "N/A";
        }
        String[] thirtyOneDays = {"January", "March", "May", "July", "August", "October", "December"};
        String[] thirtyDays = {"April", "June", "September", "November"};
        for (String i : thirtyDays) {
            if (month.toUpperCase().equals(i.toUpperCase())) {
                numDays = 30;
            }
        }
        for (String j : thirtyOneDays) {
            if (month.toUpperCase().equals(j.toUpperCase())) {
                numDays = 31;
            }
        }
        if (month.toUpperCase().equals("FEBRUARY")) {
            numDays = 28;
        }
        return month.toUpperCase() + " has " + Integer.toString(numDays) + " days.";
    }
}
