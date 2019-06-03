package by.epam.javatraining.alekseev.lesson05.task03.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoodSensorTest {

    @Test
    public void testWrapMethodBadMood() {
        int moodNumber = 0;
        String expResult = ";\\";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodSadMood() {
        int moodNumber = 1;
        String expResult = ":(";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodGoodMood() {
        int moodNumber = 2;
        String expResult = ":)";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodGreatMood() {
        int moodNumber = 3;
        String expResult = ":)))";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodExcellentMood() {
        int moodNumber = 4;
        String expResult = ":D";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }
}
