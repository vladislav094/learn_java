package jrush;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print("Type number: ");
                array[i] = scanner.nextInt();
            }

            if (count % 2 != 0) {
                for (int i = 0; i < array.length; i++){
                    System.out.println(array[i]);
                }
            } else {
                for (int i = array.length-1; i>= 0; i--) {
                    System.out.println(array[i]);
                }
            }
        }

    }
}
