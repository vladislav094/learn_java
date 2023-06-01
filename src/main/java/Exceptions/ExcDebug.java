package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExcDebug {

    private static ExcDebugHelper abc = new ExcDebugHelper();

    public static void foo(){
        abc.show();
    }

    public static void foo2(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("abcfile");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void foo3() throws ArithmeticException{
        int a = 1;
        int zero = 0;
//        int c;
////        if (zero == 0) throw new ArithmeticException();
//        try {
//            if (zero == 0) throw new ArithmeticException();
//            c = a /zero;
//        } catch (ArithmeticException e) {
//            System.err.println("Arithmetic exception");
//            e.printStackTrace();
//        }
        try {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if(x<= 30) {
                throw new Exception("Число Х маньше или равно 30. Должно быть больше");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Программа завершена");
    }



    public static void main(String[] args) {
//        try {
////            foo();
//            System.out.println(3/0);
//        } catch (NullPointerException | ArithmeticException e) {
//            System.out.println("It was Null Pointer Exception");
//            e.printStackTrace();
//        }
        foo3();
    }
}
