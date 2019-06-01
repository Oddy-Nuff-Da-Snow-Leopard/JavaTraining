package by.epam.javatraining.alekseev.lesson05.task03.model.logic;

public class MoodSensor {

    private static final int BAD_MOOD_LIMIT = 2;
    private static final int SAD_MOOD_LIMIT = 4;
    private static final int GOOD_MOOD_LIMIT = 6;
    private static final int GREAT_MOOD_LIMIT = 8;

    public static String getMood() {

        String mood = null;
        int randMoodNumber = Randomizer.getRandonNumber();

        if (randMoodNumber <= BAD_MOOD_LIMIT) {
            mood = ":|";
        } else if (randMoodNumber > BAD_MOOD_LIMIT
                && randMoodNumber <= SAD_MOOD_LIMIT) {
            mood = ":(";
        } else if (randMoodNumber > SAD_MOOD_LIMIT
                && randMoodNumber <= GOOD_MOOD_LIMIT) {
            mood = ";)";
        } else if (randMoodNumber > GOOD_MOOD_LIMIT
                && randMoodNumber <= GREAT_MOOD_LIMIT) {
            mood = ":)))";
        } else if (randMoodNumber > GREAT_MOOD_LIMIT) {
            mood = ":D";
            return mood;
        }
        return mood;
    }
}
