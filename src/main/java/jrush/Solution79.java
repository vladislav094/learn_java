package jrush;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution79 {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if(str.isEmpty()) break;
            else {
                Path path = Path.of(str);
                if (Files.isRegularFile(path)) {
                    System.out.println(path + THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.println(path + THIS_IS_DIR);
                } else break;
            }
        }

    }

}
