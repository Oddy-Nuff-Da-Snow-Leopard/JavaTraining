package by.epam.javatraining.alekseev.tasks.maintask02.model.logic;

import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.Fruit;
import by.epam.javatraining.alekseev.tasks.maintask02.model.exception.BadArgumentException;
import org.apache.log4j.Logger;

public class Helper {

    private static final Logger LOGGER = Logger.getLogger(Helper.class);
    private static final int ZERO = 0;
    private static final int INDEX_NOT_FOUND_VALUE = -1;

    private static final String IS_NULL_MSG
            = "Method received bad parameter! Fruit refers to null!";

    private static boolean isNull(FruitSalad fruitSalad) {
        return fruitSalad == null;
    }

    public static int calculateTotalWeight(FruitSalad fruitSalad) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return INDEX_NOT_FOUND_VALUE;
        }

        int totalWeight = 0;
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public static double calculateTotalCalories(FruitSalad fruitSalad) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return INDEX_NOT_FOUND_VALUE;
        }

        double coeff = 100;
        double totalCalories = 0;
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            totalCalories += fruit.getAmountOfCalories() / coeff
                    * fruit.getWeight();
        }
        return totalCalories;
    }

    public static int calculateTotalVitaminC(FruitSalad fruitSalad) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return INDEX_NOT_FOUND_VALUE;
        }

        int totalVitaminC = 0;
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            totalVitaminC += fruit.getAmountOfVitaminC();
        }
        return totalVitaminC;
    }

    public static int calculateTotalVitaminD(FruitSalad fruitSalad) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return INDEX_NOT_FOUND_VALUE;
        }

        int totalVitaminD = 0;
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            totalVitaminD += fruit.getAmountOfVitaminD();
        }
        return totalVitaminD;
    }

    public static int calculateTotalVitaminB12(FruitSalad fruitSalad) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return INDEX_NOT_FOUND_VALUE;
        }

        int totalVitaminB12 = 0;
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            totalVitaminB12 += fruit.getAmountOfVitaminB12();
        }
        return totalVitaminB12;
    }

    public static void sortFruitsByWeight(FruitSalad fruitSalad)
            throws BadArgumentException {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            throw new BadArgumentException(IS_NULL_MSG);
        }

        Fruit[] fruits = fruitSalad.getAllIngredients();
        for (int i = 0; i < fruits.length - 1; i++) {
            int n = fruits.length - 1 - i;
            for (int j = 0; j < n; j++) {
                if (fruits[j].getWeight()
                        > fruits[j + 1].getWeight()) {
                    Fruit temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }
    }

    public static void sortFruitsByCalories(FruitSalad fruitSalad)
            throws BadArgumentException {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            throw new BadArgumentException(IS_NULL_MSG);
        }

        Fruit[] fruits = fruitSalad.getAllIngredients();
        for (int i = 0; i < fruits.length - 1; i++) {
            int n = fruits.length - 1 - i;
            for (int j = 0; j < n; j++) {
                if (fruits[j].getAmountOfCalories()
                        > fruits[j + 1].getAmountOfCalories()) {
                    Fruit temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }
    }

    public static FruitSalad findByCaloriesRange(FruitSalad fruitSalad,
            int minCalories, int maxCalories) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return null;
        }

        FruitSalad listOfFruits = new FruitSalad();
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            int amountOfCalories = fruit.getAmountOfCalories();
            if (amountOfCalories >= minCalories
                    && amountOfCalories <= maxCalories) {
                listOfFruits.addIngredient(fruit);
            }
        }
        return listOfFruits;
    }

    public static FruitSalad findByVitaminCRange(FruitSalad fruitSalad,
            int minVitaminC, int maxVitaminC) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return null;
        }

        FruitSalad listOfFruits = new FruitSalad();
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            int amountOfVitaminC = fruit.getAmountOfVitaminC();
            if (amountOfVitaminC >= minVitaminC
                    && amountOfVitaminC <= maxVitaminC) {
                listOfFruits.addIngredient(fruit);
            }
        }
        return listOfFruits;
    }

    public static FruitSalad findByVitaminDRange(FruitSalad fruitSalad,
            int minVitaminD, int maxVitaminD) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return null;
        }

        FruitSalad listOfFruits = new FruitSalad();
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            int amountOfVitaminD = fruit.getAmountOfVitaminD();
            if (amountOfVitaminD >= minVitaminD
                    && amountOfVitaminD <= maxVitaminD) {
                listOfFruits.addIngredient(fruit);
            }
        }
        return listOfFruits;
    }

    public static FruitSalad findByVitaminB12Range(FruitSalad fruitSalad,
            int minVitaminB12, int maxVitaminB12) {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return null;
        }

        FruitSalad listOfFruits = new FruitSalad();
        for (Fruit fruit : fruitSalad.getAllIngredients()) {
            int amountOfVitaminB12 = fruit.getAmountOfVitaminB12();
            if (amountOfVitaminB12 >= minVitaminB12
                    && amountOfVitaminB12 <= maxVitaminB12) {
                listOfFruits.addIngredient(fruit);
            }
        }
        return listOfFruits;
    }

    public static Fruit findTheMostHighCalorieFruit(FruitSalad fruitSalad)
            throws BadArgumentException {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return null;
        }

        Fruit fruit = fruitSalad.getIngredient(ZERO);
        int max = fruit.getAmountOfCalories();
        for (int i = 0; i < fruitSalad.getAllIngredients().length; i++) {
            if (fruitSalad.getIngredient(i).getAmountOfCalories() > max) {
                fruit = fruitSalad.getIngredient(i);
            }
        }
        return fruit;
    }

    public static Fruit findTheLowestCalorieFruit(FruitSalad fruitSalad)
            throws BadArgumentException {
        if (isNull(fruitSalad)) {
            LOGGER.warn(IS_NULL_MSG);
            return null;
        }

        Fruit fruit = fruitSalad.getIngredient(ZERO);
        int min = fruit.getAmountOfCalories();
        for (int i = 0; i < fruitSalad.getAllIngredients().length; i++) {
            if (fruitSalad.getIngredient(i).getAmountOfCalories() < min) {
                fruit = fruitSalad.getIngredient(i);
            }
        }
        return fruit;
    }
}
