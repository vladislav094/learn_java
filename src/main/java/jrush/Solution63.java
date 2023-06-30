package jrush;

import java.util.Scanner;

public class Solution63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
            throw new SecurityException();
        } catch (Exception e) {
            //напишите тут ваш код
            System.out.println(answer);
            throw e;
        }
    }
}
