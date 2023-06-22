package jrush;

import java.util.Arrays;
import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int minInt = Integer.MAX_VALUE;
        for (int i = 0; i< ints.length; i++) {
            minInt = Math.min(minInt, ints[i]);
        }
        return minInt;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
