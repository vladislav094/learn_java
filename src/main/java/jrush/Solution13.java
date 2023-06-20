package jrush;

import java.util.Scanner;

public class Solution13 {
//    public static String[] strings = {"Hello", "Hello", "World", "Java", "Tasks", "World"};
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String iString = strings[i];
            for (int j = i+1; j< strings.length; j++) {
                if (strings[i] == null) continue;
                if (iString.equalsIgnoreCase(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
