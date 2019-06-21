package by.epam.javatraining.alekseev.tasks.maintask02.model.logic;

import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.*;
import by.epam.javatraining.alekseev.tasks.maintask02.model.exception.BadArgumentException;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelperTest {

    private static final Apple APPLE = new Apple(100);
    private static final Banana BANANA = new Banana(150);
    private static final Kiwifruit KIWIFRUIT = new Kiwifruit(80);
    private static final Orange ORANGE = new Orange(120);
    private static final Peach PEACH = new Peach(155);
    private static final Pear PEAR = new Pear(90);
    private static final Pineapple PINEAPPLE = new Pineapple(170);

    private static final FruitSalad NULL_SALAD = null;

    @Test
    public void testCalculateTotalWeightNull() {
        int expResult = -1;
        int result = Helper.calculateTotalWeight(NULL_SALAD);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateTotalWeight() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(APPLE, BANANA, PINEAPPLE);
        int expResult = 420;
        int result = Helper.calculateTotalWeight(fruitSalad);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateTotalCaloriesNull() {
        double expResult = -1;
        double result = Helper.calculateTotalCalories(NULL_SALAD);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculateTotalCalories() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(APPLE, KIWIFRUIT, PINEAPPLE);
        double expResult = 262.0;
        double result = Helper.calculateTotalCalories(fruitSalad);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculateTotalVitaminCNull() {
        int expResult = -1;
        int result = Helper.calculateTotalVitaminC(NULL_SALAD);
        assertEquals(expResult, result);
    }

    public void testCalculateTotalVitaminC() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(APPLE, KIWIFRUIT, PEACH);
        int expResult = 120;
        int result = Helper.calculateTotalVitaminC(fruitSalad);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateTotalVitaminDNull() {
        int expResult = -1;
        int result = Helper.calculateTotalVitaminD(NULL_SALAD);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateTotalVitaminD() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(PEAR, KIWIFRUIT, PEACH, PINEAPPLE);
        int expResult = 210;
        int result = Helper.calculateTotalVitaminD(fruitSalad);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateTotalVitaminB12Null() {
        int expResult = -1;
        int result = Helper.calculateTotalVitaminB12(NULL_SALAD);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateTotalVitaminB12() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(PEAR, KIWIFRUIT, BANANA, PINEAPPLE);
        int expResult = 250;
        int result = Helper.calculateTotalVitaminB12(fruitSalad);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByCaloriesRangeNull() {
        int minCalories = 50;
        int maxCalories = 90;
        FruitSalad expResult = null;
        FruitSalad result = Helper.findByCaloriesRange(NULL_SALAD,
                minCalories, maxCalories);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByCaloriesRange() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(PEAR, BANANA, PINEAPPLE);
        int minCalories = 50;
        int maxCalories = 90;
        FruitSalad expResult = new FruitSalad();
        expResult.addIngredients(PEAR, BANANA);
        FruitSalad result = Helper.findByCaloriesRange(fruitSalad,
                minCalories, maxCalories);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByVitaminCRangeNull() {
        int minVitaminC = 50;
        int maxVitaminC = 75;
        FruitSalad expResult = null;
        FruitSalad result = Helper.findByVitaminCRange(NULL_SALAD,
                minVitaminC, maxVitaminC);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByVitaminCRange() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(PEAR, BANANA, PINEAPPLE);
        int minVitaminC = 50;
        int maxVitaminC = 75;
        FruitSalad expResult = new FruitSalad();
        expResult.addIngredients(PINEAPPLE);
        FruitSalad result = Helper.findByVitaminCRange(fruitSalad,
                minVitaminC, maxVitaminC);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByVitaminDRangeNull() {
        int minVitaminD = 40;
        int maxVitaminD = 90;
        FruitSalad expResult = null;
        FruitSalad result = Helper.findByVitaminDRange(NULL_SALAD,
                minVitaminD, maxVitaminD);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByVitaminDRange() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(APPLE, ORANGE, KIWIFRUIT);
        int minVitaminD = 40;
        int maxVitaminD = 90;
        FruitSalad expResult = new FruitSalad();
        expResult.addIngredients(APPLE, KIWIFRUIT);
        FruitSalad result = Helper.findByVitaminDRange(fruitSalad,
                minVitaminD, maxVitaminD);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByVitaminB12RangeNull() {
        int minVitaminB12 = 70;
        int maxVitaminB12 = 80;
        FruitSalad expResult = null;
        FruitSalad result = Helper.findByVitaminB12Range(NULL_SALAD,
                minVitaminB12, maxVitaminB12);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByVitaminB12Range() {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(ORANGE, KIWIFRUIT, PEAR);
        int minVitaminB12 = 70;
        int maxVitaminB12 = 80;
        FruitSalad expResult = new FruitSalad();
        expResult.addIngredients(ORANGE, KIWIFRUIT);
        FruitSalad result = Helper.findByVitaminB12Range(fruitSalad,
                minVitaminB12, maxVitaminB12);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindTheMostHighCalorieFruitNull() throws BadArgumentException {
        Fruit expResult = null;
        Fruit result = Helper.findTheMostHighCalorieFruit(NULL_SALAD);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindTheMostHighCalorieFruit() throws BadArgumentException {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(APPLE, BANANA, PEACH, PINEAPPLE);
        Fruit expResult = PINEAPPLE;
        Fruit result = Helper.findTheMostHighCalorieFruit(fruitSalad);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindTheLowestCalorieFruitNull() throws BadArgumentException {
        Fruit expResult = null;
        Fruit result = Helper.findTheLowestCalorieFruit(NULL_SALAD);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindTheLowestCalorieFruit() throws BadArgumentException {
        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(APPLE, BANANA, PEACH, PINEAPPLE);
        Fruit expResult = PEACH;
        Fruit result = Helper.findTheLowestCalorieFruit(fruitSalad);
        assertEquals(expResult, result);
    }
}
