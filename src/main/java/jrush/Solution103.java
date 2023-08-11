package jrush;

import java.io.*;

public class Solution103 {
    public static void main(String[] args) throws IOException {
        String myTestString = "Тестируем подмену переменной in в классе System";
        byte[] byteArray = myTestString.getBytes();

        InputStream inputStream = new ByteArrayInputStream(byteArray);
        System.setIn(inputStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;


        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
