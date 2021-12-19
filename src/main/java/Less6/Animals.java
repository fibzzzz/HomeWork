package Less6;

public   class Animals {
    private String name;

    public static void main(String[] args) {

    }
        public Animals() {
        }

        public Animals(String name) {
            this.name = name;
        }

        public void animalInfo() {
            System.out.println("Животное: " + name);
        }

        public class Run {
            public void run() {
                System.out.println("Животное бежит");
            }

        }

    public class Dog extends Animals {
        public Dog(String name) {
                    }
    }
            public class Swim {
                public void swim() {
                    System.out.println("Животное плывет");
                }
            }
    public class Cat extends Animals {
        public Cat(String name) {
        }
    }
    Cat cat = new Cat("Алеша");
            Dog dog = new Dog("Федя");
    Cross cross = new Cross(777);

//cross.printInfo();

//cat.run(cross);
        }


