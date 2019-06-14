package by.epam.javatraining.alekseev.lesson06.task05.model.logic;

public class PrimeNumberChecker {
    private static final int ALLOWABLE_VALUE = 1;

    public static boolean isPrime(int number) {
        if (number <= ALLOWABLE_VALUE) {
            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
