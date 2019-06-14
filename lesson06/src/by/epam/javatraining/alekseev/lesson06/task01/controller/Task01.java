package by.epam.javatraining.alekseev.lesson06.task01.controller;

import by.epam.javatraining.alekseev.lesson06.task01.model.logic.HeadsLogic;
import by.epam.javatraining.alekseev.lesson06.task01.view.Printer;

public class Task01 {

    public static void main(String[] args) {
        int numberOfFlips = 3000;

        int numberOfHeads = HeadsLogic.getNumberOfHeads(numberOfFlips);
        int numberOfTails = numberOfFlips - numberOfHeads;
        Printer.print("Number of flips: " + numberOfFlips + "\n"
                + "Number of heads: " + numberOfHeads + "\n"
                + "Number of tails: " + numberOfTails);
    }
}
