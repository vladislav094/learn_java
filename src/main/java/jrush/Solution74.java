package jrush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Solution74 {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
