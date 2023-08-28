package jrush;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/*
Решаем пример
*/

public class Solution105 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        long count = 0;


        PrintStream defaultStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        int firstInt = Integer.parseInt(result.split(" ")[0]);
        int secondInt = Integer.parseInt(result.split(" ")[2]);
        System.setOut(defaultStream);

        String symbol = result.split(" ")[1];

        if (symbol.equals("+")) {
            count = firstInt + secondInt;
        } else if (symbol.equals("*")) {
            count = firstInt * secondInt;
        } else {
            count = firstInt - secondInt;
        }

        System.out.printf("%s %s %s = %s", firstInt, symbol, secondInt, count);
    }


    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}