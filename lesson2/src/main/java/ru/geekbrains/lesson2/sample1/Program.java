package ru.geekbrains.lesson2.sample1;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", "Gray", 5),
                new Cat("Murzik", "Black", 10)
        };

        CatFoodManager catFoodManager = new CatFoodManager(20, cats);
        catFoodManager.feedCats();

        catFoodManager.addFoodToPlate(15);
        catFoodManager.feedCats();
    }
}
