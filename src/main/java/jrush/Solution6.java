package jrush;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMinInt = Integer.MAX_VALUE;
        int secondMinInt = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x < firstMinInt) {
                secondMinInt = firstMinInt;
                firstMinInt = x;
            }
            if (x < secondMinInt && x > firstMinInt) {
                secondMinInt = x;
            }
        }
        System.out.println(secondMinInt);
    }
}
