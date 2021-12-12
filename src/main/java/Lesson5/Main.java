package Lesson5;

public class Main {
    public static void main(String[]args) {
        Player player1 = new Player ("Alina", 1500, 57, 100);
        Player player2 = new Player ("Alin", 1500, 57, 100);
        Player player3 = new Player("Ali");

        // player1.nickname = "Alina";

        System.out.println(("Получили имя: " + player1.getNickname()));
        player1.printInfo();
        player2.printInfo();
        player3.printInfo();

    }
}
