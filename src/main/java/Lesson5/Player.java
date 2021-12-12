package Lesson5;
public class Player {
    String nickname;
    int points;
    int level;
    int money;
//конструктор
    public Player(String nickname, int points, int level, int money) {
        this.nickname = nickname.toUpperCase();
        this.level = level;
    setPoints(points);
        this.money = money;
    }
    //дефолтные значения экземпляра конструктор
    public Player(String nickname) {
        this(nickname, 0, 1, 100);
    }
    public String toString() {
        return String.format("У игрока %s(уровень: %d)  %d очков и накоплено %d монет", this.nickname, this.level, this.points, this.money);
    }
    //метод вывода информации
    public void printInfo() {
     System.out.println(this);
     }
public String getNickname() {
        return nickname;
}
    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return level;
    }

    public int getMoney() {
        return money;
    }

     public void setPoints(int points) {
        if (points < 0 ||money +  points > 999999){
            System.out.println("Кол-во очков " + "недопустимо!");
        }
        this.points = points;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
