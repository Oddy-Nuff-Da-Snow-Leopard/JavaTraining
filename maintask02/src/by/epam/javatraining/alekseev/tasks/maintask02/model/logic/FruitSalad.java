package by.epam.javatraining.alekseev.tasks.maintask02.model.logic;

import by.epam.javatraining.alekseev.tasks.maintask02.model.entity.*;
import by.epam.javatraining.alekseev.tasks.maintask02.model.exception.BadArgumentException;
import static java.lang.System.arraycopy;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class FruitSalad {

    private static final Logger LOGGER = Logger.getLogger(FruitSalad.class);

    private static final int ZERO = 0;

    private static final String IS_NULL_MSG
            = "Method received bad parameter! Fruit refers to null!";

    private static final String OUT_OF_BOUNDS_MSG
            = "Method received bad parameter! Index out of array bounds!";

    private static final String IS_NULL_OR_EMPTY_MSG
            = "Method received bad parameter! Fruits array is null or empty!";

    private static boolean isNull(Fruit fruit) {
        return fruit == null;
    }

    private static boolean isNullOrEmpty(Fruit[] fruits) {
        return fruits == null || fruits.length == ZERO;
    }

    private boolean checkIndex(int index) {
        return index < ZERO || index >= fruits.length;
    }

    private Fruit[] fruits;

    public FruitSalad() {
        fruits = new Fruit[ZERO];
    }

    public Fruit getIngredient(int index) throws BadArgumentException {
        if (checkIndex(index)) {
            LOGGER.warn(OUT_OF_BOUNDS_MSG);
            throw new BadArgumentException(OUT_OF_BOUNDS_MSG);
        }
        return fruits[index];
    }

    public Fruit[] getAllIngredients() {
        return fruits;
    }

    public void addIngredient(Fruit fruit) {
        if (isNull(fruit)) {
            LOGGER.warn(IS_NULL_MSG);
            return;
        }

        fruits = Arrays.copyOf(fruits, fruits.length + 1);
        fruits[fruits.length - 1] = fruit;
    }

    public void addIngredients(Fruit... fruits) {
        if (isNullOrEmpty(fruits)) {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
            return;
        }

        int size = this.fruits.length;
        this.fruits = Arrays.copyOf(fruits, size + fruits.length);
        arraycopy(fruits, 0, this.fruits, size, this.fruits.length);
    }

    public void removeIngredient(Fruit fruit) {
        if (isNull(fruit)) {
            LOGGER.warn(IS_NULL_MSG);
            return;
        }

        int index = 0;
        for (Fruit f : fruits) {
            if (f != fruit) {
                fruits[index++] = f;
            }
        }
        fruits = Arrays.copyOf(fruits, index);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("Salad ingredients: \n");
        builder.append('{');
        for (int i = 0; i < fruits.length; i++) {
            builder.append(fruits[i].getClass().getSimpleName());
            if (i != fruits.length - 1) {
                builder.append(", ");
            }
        }
        builder.append('}');
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof FruitSalad)) {
            return false;
        }
        FruitSalad fruitSalad = (FruitSalad) obj;
        return Arrays.equals(fruits, fruitSalad.fruits);
    }

    @Override
    public int hashCode() {
        int hash = 1337;
        hash = 228 * hash + Arrays.hashCode(fruits);
        return hash;
    }

}
