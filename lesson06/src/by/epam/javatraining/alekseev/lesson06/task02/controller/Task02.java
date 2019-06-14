package by.epam.javatraining.alekseev.lesson06.task02.controller;

import by.epam.javatraining.alekseev.lesson06.task02.view.Printer;
import by.epam.javatraining.alekseev.lesson06.task02.model.logic.DigitsSequenceChecker;

public class Task02 {

    public static void main(String[] args) {

        int number1 = 124689;
        boolean isIncreasing = DigitsSequenceChecker.isIncreasing(number1);
        Printer.print("Are the digits of number " + number1
                + " form an increasing sequence? " + isIncreasing + "\n");

        int number2 = 975420;
        boolean isDecreasing = DigitsSequenceChecker.isDecreasing(number2);
        Printer.print("Are the digits of number " + number2
                + " form a decreasing sequence? " + isDecreasing + "\n");
    }
}
