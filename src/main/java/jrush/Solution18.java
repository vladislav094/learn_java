package jrush;

import java.util.Arrays;

public class Solution18 {
    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        int lengthArray = array.length;

        int temp;
        if (lengthArray % 2 == 0) {
            temp = lengthArray / 2;
        } else {
            temp = (int) Math.ceil(lengthArray * 1.0 / 2);
        }
        Arrays.fill(array, 0, temp, valueStart);
        Arrays.fill(array,temp, lengthArray, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}
