package org.example;

public class IsPrime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;
        for ( i = 2; i <= 100; i ++) {
            isprime = true;
            for (j = 2; j < i; j++) {
                if(i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i + " Is prime");
            }
        }
    }
}
