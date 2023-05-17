package org.example;
import java.util.Arrays;

public class Bubble {
    public static void main(String args[]){
        int array[] = {123, -11, 0, 25, 33, -15, 22, 43, 99, -9};
        int array2[] = {123, -11, 3, 25, 33, -15, 22, 43, 99, -9};
        int table[][] = new int [3][4];
        int a, b, t;
        for (a = 1; a < 10; a++)
            for (b = 9; b >= a; b--) {
                if(array[b-1] > array[b]) {
                    t = array[b-1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
            }
        System.out.println(Arrays.toString(array));
        for (int i: array2) {
            System.out.print(i+" ");
        }

    }
}
