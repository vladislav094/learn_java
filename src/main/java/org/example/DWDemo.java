package org.example;

public class DWDemo {
    public static void main(String aargs[])
        throws java.io.IOException {
        char ch;
        do {
            System.out.println("Нажмите нужную клавишу, а затем клавишу ENTER: ");
            ch = (char) System.in.read();
        }   while (ch != 'q');
    }
}
