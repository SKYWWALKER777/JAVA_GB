package ru.geekbrains.lesson2.sample1;

public class CatFoodManager {
    private Plate plate;
    private Cat[] cats;

    public CatFoodManager(int initialFood, Cat[] cats) {
        this.plate = new Plate(initialFood);
        this.cats = cats;
    }

    public void feedCats() {
        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isFull()) {
                System.out.println(cat.getName() + " поел и теперь сыт.");
            } else {
                System.out.println(cat.getName() + " не смог насытиться. Необходимо добавить еды.");
            }
        }
    }

    public void addFoodToPlate(int amount) {
        plate.addFood(amount);
        System.out.println("Добавлено " + amount + " еды в тарелку.");
    }
}
