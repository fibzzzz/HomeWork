package Lesson3;
public class HW3_3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        invertArray();        System.out.println();
        System.out.println("Задание 2");
             fillArray();
        System.out.println("Задание 3");
        changeArray();         System.out.println();
        System.out.println("Задание 4");
        fillDiagonal();
        System.out.println("Задание 5");
        System.out.println();
        massive(); System.out.println();
        System.out.println("Задание 6");
        minmax();
    }

    public static void invertArray() {
        int[] arra = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] == 0) {
                System.out.print(arra[i] + 1);
            } else {
                System.out.print(arra[i] - 1);
            }
        }
    }

    public static void fillArray() {
        int counter = 1;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter++;
            System.out.println(arr[i]);
        }
    }
        public static void changeArray() {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    System.out.print(array[i] * 2);
                }
            }
        }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j ) {
                    System.out.print('1');
                }
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
    public static void massive() {
        int len = 7;
        int initialValue = 5;
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }
    }

    public static void minmax() {
    int[] arra = {1, 2, 3, 4, 5, 6};
    int max = arra[0];
    int min = arra[0];
      for (int i = 1; i < arra.length; i++) {
        if (arra[i] > max) max = arra[i];
        }
        System.out.println(max);
        for (int i = 1; i < arra.length; i++) {
        if (arra[i] < min) min = arra[i];
        }
        System.out.println(min);
        }
}