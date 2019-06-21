package by.epam.javatraining.alekseev.tasks.maintask02.model.entity;

public class Apple extends Fruit {

    int amountOfCalories = 60;
    int amountOfVitaminC = 40;
    int amountOfVitaminD = 50;
    int amountOfVitaminB12 = 55;

    public Apple() {
        super();
    }

    public Apple(int weight) {
        super(weight);
    }

    public void setAmountOfCalories(int amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }

    public void setAmountOfVitaminC(int amountOfVitaminC) {
        this.amountOfVitaminC = amountOfVitaminC;
    }

    public void setAmountOfVitaminD(int amountOfVitaminD) {
        this.amountOfVitaminD = amountOfVitaminD;
    }

    public void setAmountOfVitaminB12(int amountOfVitaminB12) {
        this.amountOfVitaminB12 = amountOfVitaminB12;
    }

    public int getAmountOfCalories() {
        return amountOfCalories;
    }

    public int getAmountOfVitaminC() {
        return amountOfVitaminC;
    }

    public int getAmountOfVitaminD() {
        return amountOfVitaminD;
    }

    public int getAmountOfVitaminB12() {
        return amountOfVitaminB12;
    }

    @Override
    public String toString() {
        return Joiner.join(super.toString(), amountOfCalories,
                amountOfVitaminC, amountOfVitaminD, amountOfVitaminB12);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Apple)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Apple apple = (Apple) obj;
        return apple.amountOfCalories == this.amountOfCalories
                && apple.amountOfVitaminC == this.amountOfVitaminC
                && apple.amountOfVitaminD == this.amountOfVitaminD
                && apple.amountOfVitaminB12 == this.amountOfVitaminB12;
    }

    @Override
    public int hashCode() {
        int hash = 1337;
        hash = 1488 * hash + this.amountOfCalories + this.amountOfVitaminC
                + this.amountOfVitaminD + this.amountOfVitaminB12;
        return hash + super.hashCode();
    }

}
