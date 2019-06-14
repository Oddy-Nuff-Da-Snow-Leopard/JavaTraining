package by.epam.javatraining.alekseev.lesson06.task02.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class DigitsSequenceCheckerTest {

    @Test
    public void testIsIncreasingLessThanTen() {
        int number = 8;
        boolean expResult = false;
        boolean result = DigitsSequenceChecker.isIncreasing(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsIncreasingLessThanTenNegative() {
        int number = -8;
        boolean expResult = false;
        boolean result = DigitsSequenceChecker.isIncreasing(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsIncreasing() {
        int number = 1234567;
        boolean expResult = true;
        boolean result = DigitsSequenceChecker.isIncreasing(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsIncreasingNot() {
        int number = 2342351;
        boolean expResult = false;
        boolean result = DigitsSequenceChecker.isIncreasing(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsIncreasingNegative() {
        int number = -1234567;
        boolean expResult = true;
        boolean result = DigitsSequenceChecker.isIncreasing(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsDecreasingLessThanTen() {
        int number = 6;
        boolean expResult = false;
        boolean result = DigitsSequenceChecker.isDecreasing(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsDecreasingLessThanTenNegative() {
        int number = -6;
        boolean expResult = false;
        boolean result = DigitsSequenceChecker.isDecreasing(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsDecreasing() {
        int number = 975420;
        boolean expResult = true;
        boolean result = DigitsSequenceChecker.isDecreasing(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsDecreasingNot() {
        int number = 2362346;
        boolean expResult = false;
        boolean result = DigitsSequenceChecker.isDecreasing(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsDecreasingNegative() {
        int number = 975420;
        boolean expResult = true;
        boolean result = DigitsSequenceChecker.isDecreasing(number);
        assertEquals(expResult, result);
    }
}