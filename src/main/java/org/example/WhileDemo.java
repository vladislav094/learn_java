package org.example;

public class WhileDemo {
    public static void main(String args[]) {
        char ch;
        ch = 'a';
        while (ch <= 'z') {
            System.out.println(ch);
            ch += 1;
        }
    }
}

class Power {
    public static void main(String args[]) {
        int e;
        int result;

        for (int i=0; i < 10; i++) {
            result = 1;
            e = i;
            while(e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 in step " + i + "  equals " + result);
        }
    }
}
