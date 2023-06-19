package jrush;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                result += scanner.nextInt();
            } else {
                if (scanner.hasNextLine()) {
                    String word = scanner.next();
                    if (word.equals("ENTER")) {
                        System.out.println(result);
                        break;
                    }
                }
            }
        }
    }
}