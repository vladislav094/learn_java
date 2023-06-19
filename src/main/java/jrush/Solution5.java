package jrush;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int numb = scanner.nextInt();
            if (numb < min) {
                min = numb;
            }
        }
        System.out.println(min);
    }
}
