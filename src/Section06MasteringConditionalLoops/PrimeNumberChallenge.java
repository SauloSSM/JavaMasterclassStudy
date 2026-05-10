package Section06MasteringConditionalLoops;

public class PrimeNumberChallenge {
    public static void main(String[] args) {

        int count = 0;

        for(int i = 10; i <= 50; i++) {
            if(isPrime(i)) {
                System.out.println("Número " + i + " é um número primo");
                count++;

                if(count == 3) {
                    System.out.println("Encontrou 3 números primos");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
