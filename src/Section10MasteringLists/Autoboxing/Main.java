package Section10MasteringLists.Autoboxing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);
        Integer deprecatedBoxing = new Integer(15);
        int unboxedInt = boxedInt.intValue();

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
    }

    private static Double getDoubleObject() {

        return Double.valueOf(100.000);
    }

    private static double getLiteralDoublePrimitive() {

        return 100.0;
    }
}
