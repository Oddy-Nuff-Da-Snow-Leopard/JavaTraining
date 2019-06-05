package by.epam.javatraining.alekseev.lesson05.task03.model.logic;

public class MoodSensor {

    private static final int BAD_MOOD_SMILEY_NUMBER = 0;
    private static final int SAD_MOOD_SMILEY_NUMBER = 1;
    private static final int GOOD_MOOD_SMILEY_NUMBER = 2;
    private static final int GREAT_MOOD_SMILEY_NUMBER = 3;
    
    private static final String BAD_MOOD_SMILEY = ";\\";
    private static final String SAD_MOOD_SMILEY = ":(";
    private static final String GOOD_MOOD_SMILEY = ":)";
    private static final String GREAT_MOOD_SMILEY = ":)))";
    private static final String EXCELLENT_MOOD_SMILEY = ":D";

    public static String getRandomMood() {
        int randMoodNumber = Random.getRandomNumber();
        return getMood(randMoodNumber);
    }
    
    public static String wrapMethod(int moodNumber) {
        return getMood(moodNumber);
    }

    private static String getMood(int moodNumber) {

        String mood = EXCELLENT_MOOD_SMILEY;

        switch(moodNumber){
            case BAD_MOOD_SMILEY_NUMBER: mood = BAD_MOOD_SMILEY; break;
            case SAD_MOOD_SMILEY_NUMBER: mood = SAD_MOOD_SMILEY; break;
            case GOOD_MOOD_SMILEY_NUMBER: mood = GOOD_MOOD_SMILEY; break;
            case GREAT_MOOD_SMILEY_NUMBER: mood = GREAT_MOOD_SMILEY; break;
        }
        return mood;
    }
}

