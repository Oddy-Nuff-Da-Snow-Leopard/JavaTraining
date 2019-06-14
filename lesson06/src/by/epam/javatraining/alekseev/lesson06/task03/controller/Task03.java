package by.epam.javatraining.alekseev.lesson06.task03.controller;

import by.epam.javatraining.alekseev.lesson06.task03.model.logic.FactorialLogic;
import by.epam.javatraining.alekseev.lesson06.task03.view.Printer;
import java.math.BigInteger;

public class Task03 {

    public static void main(String[] args) {

        int number = 37;
        BigInteger result = FactorialLogic.getFactorialOf(number);
        Printer.print("The factorial of number " + number + " is\n" + result);
    }
}
