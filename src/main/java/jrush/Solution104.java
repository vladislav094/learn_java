package jrush;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution104 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(args[0]);

        List<Character> keys = new ArrayList<>();
        Map<Character, Integer> result = new TreeMap<>();

        while (fileReader.ready()) {
            keys.add((char) fileReader.read());
        }

        Collections.sort(keys);

        for (Character key : keys) {
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        fileReader.close();
    }
}
