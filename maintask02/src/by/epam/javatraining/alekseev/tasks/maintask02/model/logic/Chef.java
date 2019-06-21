package by.epam.javatraining.alekseev.tasks.maintask02.model.logic;

import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.*;
import by.epam.javatraining.alekseev.tasks.maintask02.model.exception.BadArgumentException;
import org.apache.log4j.Logger;

public class Chef {

    private static final Logger LOGGER = Logger.getLogger(Chef.class);

    private static final String SALAD_COOKED_MSG = "salad cooked successfully!";

    public FruitSalad makeSummerFruitSalad() throws BadArgumentException {

        int appleWeight = 300;
        int pearWeight = 150;
        int peachWeight = 100;
        int kiwifruitWeight = 200;

        Apple apple = new Apple(appleWeight);
        Pear pear = new Pear(pearWeight);
        Peach peach = new Peach(peachWeight);
        Kiwifruit kiwiFruit = new Kiwifruit(kiwifruitWeight);

        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(apple, pear, peach, kiwiFruit);

        LOGGER.info(SALAD_COOKED_MSG);
        return fruitSalad;
    }

    public FruitSalad makeWavyFruitSalad() throws BadArgumentException {

        int pearWeight = 150;
        int peachWeight = 100;
        int pineappleWeight = 100;
        int kiwifruitWeight = 100;
        int bananaWeight = 150;

        Pear pear = new Pear(pearWeight);
        Peach peach = new Peach(peachWeight);
        Pineapple pineapple = new Pineapple(pineappleWeight);
        Kiwifruit kiwiFruit = new Kiwifruit(kiwifruitWeight);
        Banana banana = new Banana(bananaWeight);

        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(pear, peach, pineapple,
                kiwiFruit, banana);

        LOGGER.info(SALAD_COOKED_MSG);
        return fruitSalad;
    }

    public FruitSalad makeFunnyFruitSalad() throws BadArgumentException {

        int appleWeight = 60;
        int pearWeight = 100;
        int peachWeight = 100;
        int orangeWeight = 70;
        int pineappleWeight = 80;
        int kiwifruitWeight = 100;
        int bananaWeight = 120;

        Apple apple = new Apple(appleWeight);
        Pear pear = new Pear(pearWeight);
        Peach peach = new Peach(peachWeight);
        Orange orange = new Orange(orangeWeight);
        Pineapple pineapple = new Pineapple(pineappleWeight);
        Kiwifruit kiwiFruit = new Kiwifruit(kiwifruitWeight);
        Banana banana = new Banana(bananaWeight);

        FruitSalad fruitSalad = new FruitSalad();
        fruitSalad.addIngredients(apple, pear, peach, orange,
                pineapple, kiwiFruit, banana);

        LOGGER.info(SALAD_COOKED_MSG);
        return fruitSalad;
    }
}
