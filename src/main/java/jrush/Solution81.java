package jrush;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution81 {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //напишите тут ваш код
//        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory)) {
//            for (Path path: directoryStream) {
//                if (Files.isRegularFile(path)) {
//                    System.out.println(path + THIS_IS_FILE);
//                } if (Files.isDirectory(path)){
//                    System.out.println(path + THIS_IS_DIR);
//                }
//            }
//        }

//        Path sourceDirectory = Path.of(scanner.nextLine());
//        Path targetDirectory = Path.of(scanner.nextLine());
//        //напишите тут ваш код
//        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDirectory)) {
//            for (Path path : directoryStream) {
//                if (Files.isRegularFile(path)) {
//                    Files.copy(path, targetDirectory.resolve(path.getFileName()));
//                }
//            }
//        }

        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path)) {
                    Files.move(path, targetDirectory.resolve(path.getFileName()));
                }
            }
        }

    }
}
