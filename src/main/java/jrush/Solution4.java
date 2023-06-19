package jrush;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        int count = 1;
        int result = 0;
        while (count <= 100) {
            if (count % 3 == 0) {
                count++;
                continue;
        } else {
                result += count;
                count++;
            }
        }
        System.out.println(result);
    }
}
