package org.example;

import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input you age");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("you born");
                break;
            case 7:
                System.out.println("You go to school");
                break;
            case 18:
                System.out.println("You finish school");
                break;
            default:
                System.out.println("No one of these");
        }
    }
}
