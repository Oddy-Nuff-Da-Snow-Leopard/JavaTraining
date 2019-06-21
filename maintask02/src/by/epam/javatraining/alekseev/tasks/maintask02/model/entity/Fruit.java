package by.epam.javatraining.alekseev.tasks.maintask02.model.entity;

public abstract class Fruit {

    private int weight;

    public Fruit() {
        this.weight = 0;
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public abstract void setAmountOfCalories(int amountOfCalories);
    public abstract void setAmountOfVitaminC(int amountOfVitaminC);
    public abstract void setAmountOfVitaminD(int amountOfVitaminD);
    public abstract void setAmountOfVitaminB12(int AmountOfVitaminB12);

    public abstract int getAmountOfCalories();
    public abstract int getAmountOfVitaminC();
    public abstract int getAmountOfVitaminD();
    public abstract int getAmountOfVitaminB12();

    @Override
    public String toString() {
        return "--- " + getClass().getSimpleName() + " ---"
                + "\nweigth: " + weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Fruit)) {
            return false;
        }
        Fruit fruit = (Fruit) obj;
        return fruit.weight == this.weight;
    }

    @Override
    public int hashCode() {
        int hash = 228;
        hash = 100500 * hash + this.weight;
        return hash;
    }
}
