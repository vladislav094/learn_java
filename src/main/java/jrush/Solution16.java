package jrush;

import java.util.Scanner;

public class Solution16 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        multiArray = new int[numb][];

        for (int i = 0; i < multiArray.length; i++){
            int temp = scanner.nextInt();
            multiArray[i] = new int[temp];
        }

        for (int[] elt: multiArray) {
            for (int item: elt) {
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
