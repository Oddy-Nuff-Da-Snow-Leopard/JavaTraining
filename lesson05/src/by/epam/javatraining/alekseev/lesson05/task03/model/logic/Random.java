package by.epam.javatraining.alekseev.lesson05.task03.model.logic;

public class Random {

    private static final int MAX_VALUE = 5;
    private static final java.util.Random RND = new java.util.Random();

    public static int getRandomNumber() {
        return RND.nextInt(MAX_VALUE);
    }
}
