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
        System.out.println(name);
        System.out.println(age);


        Scanner first = new Scanner(System.in);
        String firstString = first.nextLine().toLowerCase();

        Scanner second = new Scanner(System.in);
        String secondString = second.nextLine().toUpperCase();

        Scanner third = new Scanner(System.in);
        String thirdString = third.nextLine();

        System.out.println(thirdString);
        System.out.println(secondString);
        System.out.println(firstString);

    }
}
