package Section09AdvancedArray.FundationPrinciples;

import java.util.Arrays;

public class Declaring {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        myIntArray[4] = 40;
        myIntArray[3] = 30;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First = " + firstTen[0]);

        int arrayLength = firstTen.length;
        System.out.println("Array length = " + arrayLength);
        System.out.println("Last = " + firstTen[arrayLength - 1]);

        int[] newArray;
//      newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is int[]");
        }
    }
}
