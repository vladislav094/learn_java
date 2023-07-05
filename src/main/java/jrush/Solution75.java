package jrush;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution75 {
    public static void main(String[] args) throws IOException {
        String someText = "Hello!";
        byte[] byteArr = someText.getBytes();
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/jrush/text");) {
            fileOutputStream.write(byteArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
