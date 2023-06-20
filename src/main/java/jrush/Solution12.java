package jrush;

import java.util.Scanner;

public class Solution12 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int digital = scanner.nextInt();
        array =  new int[digital];
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < minNumber) minNumber = array[i];
        }
        System.out.println(minNumber);
    }
}
