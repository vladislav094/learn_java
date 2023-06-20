package jrush;

import java.util.Arrays;

public class Solution14 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];

        int d = 0;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j ++) {
                MULTIPLICATION_TABLE[d][j-1] = j * i;
            }
            d += 1;
        }

        for (int[] elt: MULTIPLICATION_TABLE){
            for (int i: elt) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
