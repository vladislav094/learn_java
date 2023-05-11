package org.example;

public class Guess {
    public static void main(String args[])
        throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Letter from - A to - Z");
        System.out.print("Try to guess: ");

        ch = (char) System.in.read();
        if(ch == answer) System.out.println(" *** You right! ***");
        else {
            System.out.println("It's no true.");
            if (ch < answer) System.out.println("go to end");
            else System.out.println("go to start");

        }
    }
}


