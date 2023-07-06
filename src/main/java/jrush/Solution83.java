package jrush;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class Solution83 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишите тут ваш код
        URL url = new URL(line);
        InputStream input = url.openStream();
        byte[] arr = input.readAllBytes();
        Path path = Files.createTempFile(null, null);
        Files.write(path, arr);
    }
}
