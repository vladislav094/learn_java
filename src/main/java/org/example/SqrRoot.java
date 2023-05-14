package org.example;

public class SqrRoot {
    public static void main(String args[]) {
        double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратны из " + num + " равен " + sroot);
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
