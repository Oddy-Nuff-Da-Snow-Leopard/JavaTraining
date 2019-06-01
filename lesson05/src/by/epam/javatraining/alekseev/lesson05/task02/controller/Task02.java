package by.epam.javatraining.alekseev.lesson05.task02.controller;

import by.epam.javatraining.alekseev.lesson05.task02.model.logic.CharacterChecker;
import by.epam.javatraining.alekseev.lesson05.task02.view.Printer;

public class Task02 {

    public static void main(String[] args) {

        char character = 'A';
        boolean isVowel = CharacterChecker.isVowelOne(character);

        Printer.print("Is charcater" + " '" + character + "' "
                + "is vowel? " + isVowel + '\n');
    }
}
