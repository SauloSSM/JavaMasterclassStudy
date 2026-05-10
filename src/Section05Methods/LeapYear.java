package Section05Methods;

public class LeapYear {
    public static void main(String[] args) {

        printIsLeapYear(2017);
        printIsLeapYear(2000);
        printIsLeapYear(2026);
        printIsLeapYear(2012);
        printIsLeapYear(1708);
        printIsLeapYear(1998);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void printIsLeapYear(int year) {
        boolean isLeap = isLeapYear(year);

        System.out.println(isLeap ? "Yes" : "No");
    }
}
