package by.epam.javatraining.alekseev.tasks.maintask02.model.entity;

public class Orange extends Fruit {

    int amountOfCalories = 50;
    int amountOfVitaminC = 100;
    int amountOfVitaminD = 20;
    int amountOfVitaminB12 = 75;

    public Orange() {
        super();
    }

    public Orange(int weight) {
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
        if (!(obj instanceof Orange)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Orange orange = (Orange) obj;
        return orange.amountOfCalories == this.amountOfCalories
                && orange.amountOfVitaminC == this.amountOfVitaminC
                && orange.amountOfVitaminD == this.amountOfVitaminD
                && orange.amountOfVitaminB12 == this.amountOfVitaminB12;
    }

    @Override
    public int hashCode() {
        int hash = 1337;
        hash = 1488 * hash + this.amountOfCalories + this.amountOfVitaminC
                + this.amountOfVitaminD + this.amountOfVitaminB12;
        return hash + super.hashCode();
    }
}
