package by.epam.javatraining.alekseev.lesson06.task04.controller;

import by.epam.javatraining.alekseev.lesson06.task04.model.logic.DigitsParityChecker;
import by.epam.javatraining.alekseev.lesson06.task04.view.Printer;

public class Task04 {

    public static void main(String[] args) {

        int number = 24862408;
        boolean isEqualParity = DigitsParityChecker.isEqualParity(number);

        Printer.print("Are the digits of number " + number
                + " has an equal parity? " + isEqualParity + "\n");
    }
}
