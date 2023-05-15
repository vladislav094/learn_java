package org.example;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "-");
            if ((i % 2) == 0) continue;
            System.out.println('_');
        }

        for ( int j = 1;  j < 100; j += j) {
            System.out.println(j);
        }
    }
    public static double find_average(int[] array){
        System.out.println('s');
        int sum = Arrays.stream(array).sum();
        return sum;
    }

}




