package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
            File file2 = new File("abc");
        try{
            Scanner scanner = new Scanner(file2);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        System.out.println("Continue after try/catch");

        try {
            readFile();
        } catch (FileNotFoundException f){
            System.out.println("Обработка исключения в методе main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}
