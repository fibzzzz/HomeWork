package Lesson5.HW5;

public class Person {
    String fio; //ФИО сотрудника
    String position; //должность
    String email; // эл. почта
    int salary;
    int phonenum;
    int age;

    public Person(String fio, String position, String email, int salary, int phonenum, int age) {
        this.fio = fio.toUpperCase();
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.phonenum = phonenum;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }



    }


