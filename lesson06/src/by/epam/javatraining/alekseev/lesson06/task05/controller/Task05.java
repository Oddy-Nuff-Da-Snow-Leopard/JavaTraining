package by.epam.javatraining.alekseev.lesson06.task05.controller;

import by.epam.javatraining.alekseev.lesson06.task05.model.logic.PrimeNumberChecker;
import by.epam.javatraining.alekseev.lesson06.task05.view.Printer;

public class Task05 {

    public static void main(String[] args) {
        int number = 13;
        boolean isPrime = PrimeNumberChecker.isPrime(number);
        
        Printer.print("Is the number " + number + " prime? " + isPrime);
    }
}
