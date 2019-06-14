package by.epam.javatraining.alekseev.lesson06.task03.model.logic;

import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialLogicTest {

    @Test
    public void testGetFactorialOfNegative() {
        int number = -2;
        BigInteger expResult = BigInteger.valueOf(-1);
        BigInteger result = FactorialLogic.getFactorialOf(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFactorialOfZero() {
        int number = 0;
        BigInteger expResult = BigInteger.valueOf(1);
        BigInteger result = FactorialLogic.getFactorialOf(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFactorialOfOne() {
        int number = 1;
        BigInteger expResult = BigInteger.valueOf(1);
        BigInteger result = FactorialLogic.getFactorialOf(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFactorialOfFive() {
        int number = 5;
        BigInteger expResult = BigInteger.valueOf(120);
        BigInteger result = FactorialLogic.getFactorialOf(number);
        assertEquals(expResult, result);
    }
}
