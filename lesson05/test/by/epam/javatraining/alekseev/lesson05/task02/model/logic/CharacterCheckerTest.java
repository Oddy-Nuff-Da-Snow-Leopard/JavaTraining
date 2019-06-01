package by.epam.javatraining.alekseev.lesson05.task02.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterCheckerTest {
    
    @Test
    public void testIsVowelOne() {
        char character = 'b';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelOne(character);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsVowelOneLower() {
        char character = 'a';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelOne(character);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsVowelOneUpper() {
        char character = 'A';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelOne(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelTwo() {
        char character = 'c';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelTwo(character);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsVowelTwoLower() {
        char character = 'e';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelTwo(character);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsVowelTwoUpper() {
        char character = 'E';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelTwo(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelThree() {
        char character = 'd';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelThree(character);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsVowelThreeLower() {
        char character = 'i';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelThree(character);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsVowelThreeUpper(){
        char character = 'I';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelThree(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelFour() {
        char character = 'f';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelFour(character);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testIsVowelFourLower() {
        char character = 'o';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelFour(character);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testIsVowelFourUpper() {
        char character = 'O';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelFour(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelFive() {
        char character = 'g';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelFive(character);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsVowelFiveLower() {
        char character = 'u';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelFive(character);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsVowelFiveUpper() {
        char character = 'U';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelFive(character);
        assertEquals(expResult, result);
    }
}
