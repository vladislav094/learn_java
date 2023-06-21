package jrush;

import java.util.Arrays;

public class Solution20 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код
        int[] tempArray = Arrays.copyOf(array, array.length);
        Arrays.sort(tempArray);
        boolean result = true;
        int d = Arrays.binarySearch(tempArray, element);
        if (d < 0) {
            result = false;
        }
        System.out.println(result);
    }
}


