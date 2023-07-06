package jrush;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class Solution80 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        //напишите тут ваш код
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        } else {
            if (Files.notExists(fileNewPath)) {
                Files.move(filePath, fileNewPath);
            } else Files.delete(filePath);
        }
    }
}
