package Lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private int satiety = 15;
    private String name = "Лев";
    /*public StringBuilder cat = new StringBuilder();
            for (int i = 0; i < 3; i++) {
        cat.append(String name, int satiety);{ this.name = name; this.satiety = satiety;};
    }
*/

    public Cat(String name, int satiety){ this.name = name; this.satiety = satiety;}
    public void eat(Plate plate){
        plate.decreaseFood(ThreadLocalRandom.current().nextInt(4)+3);
            }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
}
