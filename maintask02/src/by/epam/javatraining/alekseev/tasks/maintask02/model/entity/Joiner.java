package by.epam.javatraining.alekseev.tasks.maintask02.model.entity;

import java.util.StringJoiner;

public final class Joiner {

    public static String join(String superToString, int amountOfCalories,
            int amountOfVitaminC, int amountOfVitaminD,
            int amountOfVitaminB12) {
        return new StringJoiner("\n")
                .add(superToString)
                .add("amount of calories: " + amountOfCalories)
                .add("amount of vitamin C: " + amountOfVitaminC)
                .add("amount of vitamin D: " + amountOfVitaminD)
                .add("amount of vitamin B12: " + amountOfVitaminB12)
                .toString();
    }
}
