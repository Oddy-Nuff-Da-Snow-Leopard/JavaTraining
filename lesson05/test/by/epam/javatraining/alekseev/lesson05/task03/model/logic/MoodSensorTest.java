package by.epam.javatraining.alekseev.lesson05.task03.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoodSensorTest {

    @Test
    public void testGetBadMood() {
        int moodNumber = 2;
        String expResult = ":|";
        String result = MoodSensor.getMood(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSadMood() {
        int moodNumber = 3;
        String expResult = ":(";
        String result = MoodSensor.getMood(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGoodMood() {
        int moodNumber = 6;
        String expResult = ";)";
        String result = MoodSensor.getMood(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGreatMood() {
        int moodNumber = 8;
        String expResult = ":)))";
        String result = MoodSensor.getMood(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetExcellentMood() {
        int moodNumber = 10;
        String expResult = ":D";
        String result = MoodSensor.getMood(moodNumber);
        assertEquals(expResult, result);
    }

}
