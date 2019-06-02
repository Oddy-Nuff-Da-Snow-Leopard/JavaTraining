package by.epam.javatraining.alekseev.lesson05.task01.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class DragonLogicTest {
    
    @Test
    public void testCountHeadsNegative() {
        int age = -100;
        int expResult = 0;
        int result = DragonLogic.countHeads(age);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountEyesNegative() {
        int age = -100;
        int expResult = 0;
        int result = DragonLogic.countEyes(age);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountHeadsZero() {
        int age = 0;
        int expResult = 3;
        int result = DragonLogic.countHeads(age);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountEyesZero() {
        int age = 0;
        int expResult = 6;
        int result = DragonLogic.countEyes(age);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountHeadsFirstAgeLimit() {
        int age = 100;
        int expResult = 303;
        int result = DragonLogic.countHeads(age);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountEyesFirstAgeLimit() {
        int age = 100;
        int expResult = 606;
        int result = DragonLogic.countEyes(age);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testCountHeadsSecondAgeLimit() {
        int age = 250;
        int expResult = 703;
        int result = DragonLogic.countHeads(age);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountEyesSecondAgeLimit() {
        int age = 250;
        int expResult = 1406;
        int result = DragonLogic.countEyes(age);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountHeadsNoAgeLimit() {
        int age = 1000;
        int expResult = 1503;
        int result = DragonLogic.countHeads(age);
        assertEquals(expResult, result);
    }

    @Test
    public void testCountEyesNoAgeLimit() {
        int age = 1000;
        int expResult = 3006;
        int result = DragonLogic.countEyes(age);
        assertEquals(expResult, result);
    }
}
