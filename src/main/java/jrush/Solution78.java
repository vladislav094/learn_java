package jrush;

import java.nio.file.Path;
import java.util.Scanner;

public class Solution78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        //напишите тут ваш код
//        Path root = Path.of(str).getRoot();
//        System.out.println(root);

//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        //напишите тут ваш код
//        Path path1 = Path.of(str1);
//        Path path2 = Path.of(str2);
//        try {
//            System.out.println(path1.relativize(path2));
//        } catch(Exception e){
//
//        }

        String str = scanner.nextLine();
        //напишите тут ваш код
        Path path = Path.of(str);
        if (path.isAbsolute()) {
            System.out.println(path);
        } else {
            System.out.println(path.toAbsolutePath());
        }
    }
}
