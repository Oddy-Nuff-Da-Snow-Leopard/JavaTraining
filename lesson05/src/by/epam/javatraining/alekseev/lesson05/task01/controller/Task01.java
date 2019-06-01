package by.epam.javatraining.alekseev.lesson05.task01.controller;

import static by.epam.javatraining.alekseev.lesson05.task01.model.logic.DragonLogic.*;
import by.epam.javatraining.alekseev.lesson05.task01.view.Printer;

public class Task01 {

    public static void main(String[] args) {

        int age = 228;

        int numberOfHeads = countHeads(age);
        int numberOfEyes = countEyes(age);

        Printer.print("Dragon age is " + age + "\n"
                + "His number of heads is " + numberOfHeads + "\n"
                + "His number of eyes is " + numberOfEyes + "\n");
    }
}
