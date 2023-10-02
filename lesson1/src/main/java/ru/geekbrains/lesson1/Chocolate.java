// Chocolate.java
package ru.geekbrains.lesson1;

public class Chocolate extends Product {
    private int calories;

    public Chocolate(String brand, String name, double price, int calories) {
        super(brand, name, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
