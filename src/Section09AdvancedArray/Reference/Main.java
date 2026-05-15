package Section09AdvancedArray.Reference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray = " +
                Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " +
                Arrays.toString(anotherIntArray));
    }

    private static void modifyArray(int[] array) {

        array[1] = 2;
    }
}
