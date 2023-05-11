package org.example;

public class KbIn {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        System.out.print("Pushh keys and ENTER: ");
        ch = (char) System.in.read();
        System.out.println("You push keys " + ch);
    }
}
