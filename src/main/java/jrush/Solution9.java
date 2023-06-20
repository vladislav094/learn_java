package jrush;

import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = scanner.nextBoolean();
        double glass = 0.5;
        int result = 0;
        if (first) {
            result = (int) Math.ceil(glass);
        } else result = (int) Math.floor(glass);
        System.out.println(result);
    }
}
