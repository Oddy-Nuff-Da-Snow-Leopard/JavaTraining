package by.epam.javatraining.alekseev.lesson06.task01.model.logic;

import java.util.Random;

public class HeadsLogic {

    private static final int DEFAULT_NUMBER_OF_HEADS = -1;
    private static final int ALLOWABLE_VALUE = 0;

    public static int getNumberOfHeads(int numberOfFlips) {

        int numberOfHeads = DEFAULT_NUMBER_OF_HEADS;

        if (numberOfFlips > ALLOWABLE_VALUE) {
            Random rnd = new Random();

            numberOfHeads = 0;
            for (int i = 0; i < numberOfFlips; i++) {
                if (rnd.nextBoolean()) {
                    numberOfHeads++;
                }
            }
        }
        return numberOfHeads;
    }
}
