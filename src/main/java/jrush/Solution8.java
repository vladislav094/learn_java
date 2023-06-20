package jrush;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int number = scanner.nextInt();
        int count =0;
        do {
            if (number <= 0 || number >= 5) {
                System.out.println(word);
                break;
            }
            System.out.println(word);
            count++;

        } while (count<number);
    }
}
