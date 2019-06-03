package by.epam.javatraining.alekseev.lesson05.task03.model.logic;

public class MoodSensor {

    private static final int BAD_MOOD_LIMIT = 2;
    private static final int SAD_MOOD_LIMIT = 4;
    private static final int GOOD_MOOD_LIMIT = 6;
    private static final int GREAT_MOOD_LIMIT = 8;

    public static String getRandomMood() {
        int randMoodNumber = Random.getRandomNumber();
        return getMood(randMoodNumber);
    }

    public static String getMood(int moodNumber) {

        String mood = null;

        if (moodNumber <= BAD_MOOD_LIMIT) {
            mood = ":|";
        } else if (moodNumber > BAD_MOOD_LIMIT
                && moodNumber <= SAD_MOOD_LIMIT) {
            mood = ":(";
        } else if (moodNumber > SAD_MOOD_LIMIT
                && moodNumber <= GOOD_MOOD_LIMIT) {
            mood = ";)";
        } else if (moodNumber > GOOD_MOOD_LIMIT
                && moodNumber <= GREAT_MOOD_LIMIT) {
            mood = ":)))";
        } else if (moodNumber > GREAT_MOOD_LIMIT) {
            mood = ":D";
            return mood;
        }
        return mood;
    }
}
