package jrush;

import java.util.Arrays;

public class Solution19 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //напишите тут ваш код
        int length = array.length;
        int temp;

        if (length % 2 == 0) {
            temp = length / 2;
            result[0] = Arrays.copyOfRange(array, 0, temp);
            result[1] = Arrays.copyOfRange(array, temp, array.length);
        } else {
            temp = (int) Math.ceil(length * 1.0 / 2);
            result[0] = Arrays.copyOfRange(array, 0, temp);
            result[1] = Arrays.copyOfRange(array, temp, array.length);
        }



        System.out.println(Arrays.deepToString(result));
    }
}
