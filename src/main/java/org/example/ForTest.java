package org.example;

public class ForTest {
    public static void main(String args[])
        throws java.io.IOException {
        int i;
        System.out.println("Для остановки нажмите клавишу S");
        System.out.println();
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Проход № " + i);
    }
}
