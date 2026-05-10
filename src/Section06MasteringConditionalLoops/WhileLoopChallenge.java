package Section06MasteringConditionalLoops;

public class WhileLoopChallenge {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber){
            number++;

            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }

            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total Odd number = " + oddCount);
        System.out.println("Total Even number = " + evenCount);
    }

    public static boolean isEvenNumber (int evenNumber) {

        return evenNumber % 2 == 0;
    }
}
