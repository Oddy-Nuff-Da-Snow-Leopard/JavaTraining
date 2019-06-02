package by.epam.javatraining.alekseev.lesson05.extraTask.controller;

import by.epam.javatraining.alekseev.lesson05.extraTask.model.logic.NextDaySearcher;
import by.epam.javatraining.alekseev.lesson05.extraTask.view.*;

public class extraTask {

    public static void main(String[] args) {

        Printer.print("Enter date in dd/mm/yyyy format: ");
        String date = Scanner.scan();
        Printer.print("\nNext day: ");
        String nextDay = NextDaySearcher.getNextDay(date);
        Printer.print(nextDay + "\n");
    }
}
