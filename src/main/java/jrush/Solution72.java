package jrush;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Path path = Paths.get(s);
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i += 2) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
