package ru.geekbrains.lesson2.sample1;

public class Cat extends Animal {
    private String color;
    private int appetite;
    private boolean isFull;

    public Cat(String name, String color, int appetite) {
        super(name);
        this.color = color;
        this.appetite = appetite;
        this.isFull = false; // При создании кот голоден
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает");
    }

    @Override
    public void jump() {
        System.out.println("Котик подпрыгнул");
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        } else {
            isFull = false;
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
