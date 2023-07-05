package jrush;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        Path path = Paths.get(filePath);
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                for (char c : line.toCharArray()) {
                    if (c != '.' && c != ',' && c != ' ') {
                        System.out.print(c);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
