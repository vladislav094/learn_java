package org.example;

public class Arrays {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
//            System.out.println(i);
            sample[i] = i + 1;
        }
        System.out.println(sample);
        for (i = 0; i < 10; i++) {
            System.out.println(sample[i]);
        }
    }
}