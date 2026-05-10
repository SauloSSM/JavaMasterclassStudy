package Section05Methods;

public class BarkingDog {
    public static void main(String[] args) {

        printShouldWakeup(true, 1);
        printShouldWakeup(false, 2);
        printShouldWakeup(true, 8);
        printShouldWakeup(false, -1);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            return barking && (hourOfDay < 8 || hourOfDay > 22);
        }

    }

    public static void printShouldWakeup(boolean barking, int hourOfDay) {
        boolean isBarking = shouldWakeUp(barking, hourOfDay);
        System.out.println("Barking: " + barking + " | Hour: " + hourOfDay + " | Wake up? " + isBarking);

    }
}
