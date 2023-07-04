package jrush;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution66 {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //напишите тут ваш код
        for (StackTraceElement elt: stackTrace) {
            String method = elt.getMethodName();
            String className = elt.getClassName();
            String fileName = elt.getFileName();
            int line = elt.getLineNumber();
        System.out.printf(OUTPUT_FORMAT, method, line, className, fileName);
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}

