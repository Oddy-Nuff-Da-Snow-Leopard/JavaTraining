package by.epam.javatraining.alekseev.lesson05.task01.model.logic;

public class DragonLogic {

    private static final int FIRST_NUMBER_OF_HEADS = 3;
    private static final int SECOND_NUMBER_OF_HEADS = 2;
    private static final int THIRD_NUMBER_OF_HEADS = 1;

    private static final int FIRST_AGE_LIMIT = 200;
    private static final int SECOND_AGE_LIMIT = 300;

    private static final int NUMBER_OF_EYES = 2;

    private static final int ALLOWABLE_AGE = 0;

    public static int countHeads(int age) {

        int numberOfHeads;

        if (age < ALLOWABLE_AGE) {
            numberOfHeads = 0;
        } else {
            numberOfHeads = FIRST_NUMBER_OF_HEADS;

            if (age == ALLOWABLE_AGE) {
                return numberOfHeads;
            } else if (age <= FIRST_AGE_LIMIT) {
                numberOfHeads += age * FIRST_NUMBER_OF_HEADS;
            } else if (age > FIRST_AGE_LIMIT && age <= SECOND_AGE_LIMIT) {
                numberOfHeads += FIRST_AGE_LIMIT * FIRST_NUMBER_OF_HEADS
                        + (age - FIRST_AGE_LIMIT) * SECOND_NUMBER_OF_HEADS;
            } else {
                numberOfHeads += FIRST_AGE_LIMIT * FIRST_NUMBER_OF_HEADS
                        + (SECOND_AGE_LIMIT - FIRST_AGE_LIMIT)
                        * SECOND_NUMBER_OF_HEADS
                        + (age - SECOND_AGE_LIMIT) * THIRD_NUMBER_OF_HEADS;
            }
        }
        return numberOfHeads;
    }

    public static int countEyes(int age) {
        return countHeads(age) * NUMBER_OF_EYES;
    }
}
