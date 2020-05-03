public class MinutesToDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(0);
        printYearsAndDays(-1);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long reminderDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + reminderDays + " d");
        }
    }
}
