package by.epam.javatraining.alekseev.lesson06.task02.model.logic;

public class DigitsSequenceChecker {

    private static final int TEN = 10;

    public static boolean isIncreasing(int number) {
        number = Math.abs(number);
        if (number < TEN) {
            return false;
        }

        boolean isIncreasing = true;
        while (number / TEN != 0) {
            int digit = number % TEN;
            number /= TEN;
            if (digit <= number % TEN) {
                isIncreasing = false;
                break;
            }
        }
        return isIncreasing;
    }

    public static boolean isDecreasing(int number) {
        number = Math.abs(number);
        if (number < TEN) {
            return false;
        }

        boolean isDecreasing = true;
        while (number / TEN != 0) {
            int digit = number % TEN;
            number /= TEN;
            if (digit >= number % TEN) {
                isDecreasing = false;
                break;
            }
        }
        return isDecreasing;
    }
}
