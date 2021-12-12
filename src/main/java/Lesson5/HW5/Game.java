package Lesson5.HW5;

public class Game {
    public static  void main(String[]args) {
        Person[] emplArray = new Person[5]; // Вначале объявляем массив объектов
        emplArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mail.com", 777777, 3000, 30);
        // потом для каждой ячейки массива задаем объект
        emplArray[1] = new Person("Ivanov A", "Test", "iviva@mail.com", 3333, 741, 31);
        emplArray[2] = new Person("Ivanov B", "Man", "iviv@mail.com", 4444, 147, 42);
        emplArray[3] = new Person("Ivanov C", "Dir", "ivi@mail.com", 5555, 321, 47);
        emplArray[4] = new Person("Ivanov D", "Aut", "iv@mailb.com", 6666, 123,23);
       System.out.println(emplArray);

    }
}
