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
    public void testGetNextDayInvalidFormat3() {
        String date = "abc/-2/-2019";
        String expResult = "Invalid format!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate1() {
        String date = "-3/02/2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate2() {
        String date = "30/-02/2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate3() {
        String date = "30/02/-2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate4() {
        String date = "-30/-2/-2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate5() {
        String date = "32/05/2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate6() {
        String date = "12/23/2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate7() {
        String date = "29/02/2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate8() {
        String date = "30/02/2020";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayWrongDate9() {
        String date = "31/06/2019";
        String expResult = "Wrong date!";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDay() {
        String date = "02/06/2019";
        String expResult = "03/06/2019";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayNewMonth() {
        String date = "30/06/2019";
        String expResult = "01/07/2019";
        String result = NextDaySearcher.getNextDay(date);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNextDayNewYear() {
        String date = "31/12/2020";
        String expResult = "01/01/2021";
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
}