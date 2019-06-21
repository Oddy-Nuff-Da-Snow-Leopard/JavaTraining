package by.epam.javatraining.alekseev.lesson05.task02.model.logic;

public class CharacterChecker {

    private static final String STRING_OF_VOWEL_CHARACTERS = "AEIOUY";

    private static final char[] ARRAY_OF_VOWEL_CHARACTERS
            = {'A', 'E', 'I', 'O', 'U', 'Y'};

    private static final char A = 'A';
    private static final char E = 'E';
    private static final char I = 'I';
    private static final char O = 'O';
    private static final char U = 'U';
    private static final char Y = 'Y';

    private static char getUpperCase(char character) {
        return Character.toUpperCase(character);
    }

    public static boolean isVowelOne(char character) {
        character = getUpperCase(character);
        return STRING_OF_VOWEL_CHARACTERS.contains(
                Character.toString(character));
    }

    public static boolean isVowelTwo(char character) {
        character = getUpperCase(character);
        return STRING_OF_VOWEL_CHARACTERS.indexOf(character) != -1;
    }

    public static boolean isVowelThree(char character) {
        character = getUpperCase(character);
        for (int i = 0; i < ARRAY_OF_VOWEL_CHARACTERS.length; ++i) {
            if (ARRAY_OF_VOWEL_CHARACTERS[i] == character) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelFour(char character) {
        character = getUpperCase(character);
        return character == A || character == E
                || character == I || character == O
                || character == U || character == Y;
    }

    public static boolean isVowelFive(char character) {
        switch (getUpperCase(character)) {
            case A:
            case E:
            case I:
            case O:
            case U:
            case Y:
                return true;
        }
        return false;
    }
}
