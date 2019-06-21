package by.epam.javatraining.alekseev.tasks.maintask02.controller;

import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.Apple;
import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.Banana;
import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.Kiwifruit;
import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.Orange;
import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.Peach;
import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.Pear;
import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.Pineapple;
import by.epam.javatraining.alekseev.tasks.maintask02.model.exception.BadArgumentException;
import by.epam.javatraining.alekseev.tasks.maintask02.model.logic.FruitSalad;
import by.epam.javatraining.alekseev.tasks.maintask02.model.logic.Helper;
import com.sun.jndi.toolkit.ctx.HeadTail;

public class Main {

    private static final Apple APPLE = new Apple(100);
    private static final Banana BANANA = new Banana(150);
    private static final Kiwifruit KIWIFRUIT = new Kiwifruit(80);
    private static final Orange ORANGE = new Orange(120);
    private static final Peach PEACH = new Peach(155);
    private static final Pear PEAR = new Pear(90);
    private static final Pineapple PINEAPPLE = new Pineapple(170);
    
    public static void main(String[] args) throws BadArgumentException {
        FruitSalad f = new FruitSalad();
        f.addIngredients(BANANA, PEAR, PINEAPPLE);
        Helper.sortFruitsByWeight(f);
        System.out.println(f.toString());
    }
}
