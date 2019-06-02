package by.epam.javatraining.alekseev.lesson05.extraTask.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class NextDaySearcherTest {
    
    public NextDaySearcherTest() {
    }

    @Test
    public void testGetNextDayInvalidFormat1() {
        String date = "20.02.2019";
        String expResult = "Invalid format!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }
    
     public void testGetNextDayInvalidFormat2() {
        String date = "20-02-2019";
        String expResult = "Invalid format!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNextDayNonLeapFebruary() {
        String date = "28/02/2019";
        String expResult = "01/03/2019";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
}
    
    @Test
    public void testGetNextDayLeapFebruary() {
        String date = "29/02/2020";
        String expResult = "01/03/2020";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNextDayNonLeapFebruaryWrongDate() {
        String date = "29/02/2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNextDayLeapFebruaryWrongDate() {
        String date = "30/02/2020";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }
    
}
