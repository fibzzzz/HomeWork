package Lesson7;

import Less6.Animals;

public class Main {
    public static void main(String[] args) throws InterruptedException {


   Cat cat = new Cat("Мартин", 15);
        Plate plate = new Plate (59);
        plate.printInfo();
        cat.eat(plate);

       // plate.setFoodCount();
        while (plate.getFoodCount() - cat.getSatiety()> 0 ) {
            cat.eat(plate);
            plate.printInfo();
            Thread.sleep(3000);
        }
    }
}
