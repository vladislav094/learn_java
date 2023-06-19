package jrush;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;
        String digits = String.valueOf(x + y) + "" + String.valueOf(z); //напишите тут ваш код
        System.out.println(digits);


        String bigAmount = "500".toLowerCase();
        String greatAmount = "100000";
        System.out.println(greatAmount.toLowerCase());

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount); //напишите тут ваш код

        System.out.println(hugeAmount);

        String emptyString = "";
        //напишите тут ваш код
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
//        System.out.println(name);
//        System.out.println(age);
//
//
//        Scanner first = new Scanner(System.in);
//        String firstString = first.nextLine().toLowerCase();
//
//        Scanner second = new Scanner(System.in);
//        String secondString = second.nextLine().toUpperCase();
//
//        Scanner third = new Scanner(System.in);
//        String thirdString = third.nextLine();
//        System.out.println(thirdString);
//        System.out.println(secondString);
//        System.out.println(firstString);
        System.out.println();
        System.out.println(5%2);

        Scanner scanner1 = new Scanner(System.in);
        int firstInt = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int secondInt = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        int thirdInt = scanner3.nextInt();
        if (firstInt == secondInt && secondInt == thirdInt) {
            System.out.println(firstInt + " " + secondInt + " " + thirdInt);
        } else if (firstInt == secondInt) {
            System.out.println(firstInt + " " + secondInt);
        } else if (firstInt == thirdInt) {
            System.out.println(firstInt + " " + thirdInt);
        } else if (secondInt == thirdInt) {
            System.out.println(secondInt + " " + thirdInt);
        }
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int maxInt = numberA > numberB ? numberA : numberB;
        double d = scanner.nextDouble();
    }
}
