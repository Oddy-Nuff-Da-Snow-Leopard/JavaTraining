package by.epam.javatraining.alekseev.lesson06.task04.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class DigitsParityCheckerTest {

    @Test
    public void testIsEqualParityEvenNegative() {
        int number = -2468026;
        boolean expResult = true;
        boolean result = DigitsParityChecker.isEqualParity(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsEqualParityEven() {
        int number = 2468026;
        boolean expResult = true;
        boolean result = DigitsParityChecker.isEqualParity(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEqualParityNotEven() {
        int number = 240863;
        boolean expResult = false;
        boolean result = DigitsParityChecker.isEqualParity(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsEqualParityOddNegative() {
        int number = -137951;
        boolean expResult = true;
        boolean result = DigitsParityChecker.isEqualParity(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsEqualParityOdd() {
        int number = 137951;
        boolean expResult = true;
        boolean result = DigitsParityChecker.isEqualParity(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEqualParityNotOdd() {
        int number = 135879;
        boolean expResult = false;
        boolean result = DigitsParityChecker.isEqualParity(number);
        assertEquals(expResult, result);
    }
}
