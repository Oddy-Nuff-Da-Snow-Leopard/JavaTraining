package by.epam.javatraining.alekseev.lesson06.task05.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberCheckerTest {

    @Test
    public void testIsPrimeNegative() {
        int number = -23;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrimeZero() {
        int number = 0;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrimeOne() {
        int number = 1;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrime() {
        int number = 137;
        boolean expResult = true;
        boolean result = PrimeNumberChecker.isPrime(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeNotPrime() {
        int number = 120;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(number);
        assertEquals(expResult, result);
    }
}
