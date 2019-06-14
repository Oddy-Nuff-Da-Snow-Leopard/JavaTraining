package by.epam.javatraining.alekseev.lesson06.task04.model.logic;

public class DigitsParityChecker {

    private static final int TEN = 10;
    private static final int TWO = 2;

    public static boolean isEqualParity(int number) {
        return isDigitsOdd(number) || isDigitsEven(number);
    }

    private static boolean isDigitsOdd(int number) {
        number = Math.abs(number);
        boolean isDigitsOdd = true;
        while (number != 0) {
            if (number % TEN % TWO == 0) {
                isDigitsOdd = false;
                break;
            }
            number /= TEN;
        }
        return isDigitsOdd;
    }

    private static boolean isDigitsEven(int number) {
        number = Math.abs(number);
        boolean isDigitsEven = true;
        while (number != 0) {
            if (number % TEN % TWO != 0) {
                isDigitsEven = false;
                break;
            }
            number /= TEN;
        }
        return isDigitsEven;
    }
}
