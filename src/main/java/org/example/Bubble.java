package org.example;
import java.util.Arrays;

public class Bubble {
    public static void main(String args[]){
        int array[] = {123, -11, 0, 25, 33, -15, 22, 43, 99, -9};
        String[] arrayString = {"qwe", "abc", "jjq", "yuyyi", "zp"};
        int a, b;
        String t;
        for (a = 1; a < 5; a++)
            for (b = 4; b >= a; b--) {
                if(arrayString[b-1].compareTo(arrayString[b]) > 0) {
                    t = arrayString[b-1];
                    arrayString[b-1] = arrayString[b];
                    arrayString[b] = t;
                }
            }
        System.out.println(Arrays.toString(arrayString));
    }
}
