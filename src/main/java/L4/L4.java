package L4;

import java.util.Random;
import java.util.Scanner;

public class L4 {
    private static final int SIZE = 3;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_HUMAN =  'x';
    private static final char DOT_AI = '0';

    private static final char[][] MAP = new char[SIZE][SIZE];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static final String HEADER_FIRST_SYMBOL = "$";
    private static final String SPACE_MAP = " ";

    public static void manin (String[] args){
        for (int i = 0 ; i<SIZE; i++){
for (int j = 0; j<SIZE; j++) {
    MAP[i][j] = DOT_EMPTY;
    }
}
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + SPACE_MAP);
        }
        System.out.println();
        }
    }

