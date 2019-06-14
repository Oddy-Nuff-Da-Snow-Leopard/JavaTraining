package by.epam.javatraining.alekseev.lesson06.task01.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class HeadsLogicTest {

    @Test
    public void testGetNumberOfHeadsNegativeValue() {
        int numberOfFlips = -100;
        int expResult = -1;
        int result = HeadsLogic.getNumberOfHeads(numberOfFlips);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNumberOfHeadsZeroValue() {
        int numberOfFlips = 0;
        int expResult = -1;
        int result = HeadsLogic.getNumberOfHeads(numberOfFlips);
        assertEquals(expResult, result);
    }
}
