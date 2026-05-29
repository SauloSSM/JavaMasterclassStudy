package Section10MasteringLists.EnumProject;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal Value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a Friday!!");
//            }

            switchDayOfWeek(weekDay);
        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case SUN -> System.out.println("Sunday is Day " + weekDayInteger);
            case MON -> System.out.println("Monday is Day " + weekDayInteger);
            case TUES -> System.out.println("Tuesday is Day " + weekDayInteger);
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case THURS -> System.out.println("Thursday is Day " + weekDayInteger);
            case FRI -> System.out.println("Friday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
        }
    }
    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
