package Lesson5;

public class Employer {
    String fio; //ФИО сотрудника
    String position; //должность
    String email; // эл. почта
    int salary;
    int phonenum;
    int age;
    public Employer(String fio, String position, String email, int salary, int phonenum, int age){
        this.fio = fio.toUpperCase();
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.phonenum = phonenum;
        this.age = age;
    }
    public String toString() {
        return String.format("Сотрудник %s занимает должность %s, его данные: %s, %s, %s", this.fio,
        this.position, this.email, this.salary, this.phonenum);
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