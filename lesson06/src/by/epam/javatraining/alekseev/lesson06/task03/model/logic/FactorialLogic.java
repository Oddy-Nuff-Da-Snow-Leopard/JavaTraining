package by.epam.javatraining.alekseev.lesson06.task03.model.logic;

import java.math.BigInteger;

public class FactorialLogic {

    private static final int NO_FACTORIAL_VALUE = -1;
    private static final int START_VALUE = 1;

    public static BigInteger getFactorialOf(int number) {

        if (number < 0) {
            return BigInteger.valueOf(NO_FACTORIAL_VALUE);
        }

        BigInteger result = BigInteger.valueOf(START_VALUE);
        if (number > START_VALUE) {
            for (int i = 2; i <= number; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        return result;
    }
}
