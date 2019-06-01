package by.epam.javatraining.alekseev.lesson05.task03.model.logic;

import java.util.Random;

public class Randomizer {
    
    private static final int MAX_VALUE = 10;
    private static final Random RND = new Random();
    
    public static int getRandonNumber() {
        return RND.nextInt(MAX_VALUE);
    }
}
