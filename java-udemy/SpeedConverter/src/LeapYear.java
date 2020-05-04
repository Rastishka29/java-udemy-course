public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("should be false = " + isLeapYear(0));
        System.out.println("should be true = " + isLeapYear(1600));
        System.out.println("should be false = " + isLeapYear(2017));
        System.out.println("should be true = " + isLeapYear(2000));
        System.out.println("should be false = " + isLeapYear(1800));
        System.out.println("should be true = " + isLeapYear(1924));
    }
}
