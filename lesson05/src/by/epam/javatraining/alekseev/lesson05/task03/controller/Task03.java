package by.epam.javatraining.alekseev.lesson05.task03.controller;

import by.epam.javatraining.alekseev.lesson05.task03.model.logic.MoodSensor;
import by.epam.javatraining.alekseev.lesson05.task03.view.Printer;

public class Task03 {

    public static void main(String[] args) {
        
        String mood = MoodSensor.getRandomMood();
        Printer.print(mood + '\n');
    }
}
