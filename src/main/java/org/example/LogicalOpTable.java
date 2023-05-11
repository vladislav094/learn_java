package org.example;

public class LogicalOpTable {
    public static void main(String args[]) {
        boolean p, q;
        byte b;
        int simple;
        b = 10;
        b = (byte) ( b * b);
        int j, i;
        boolean isprime;
        for (i = 2; i < 100; i++ ) {
            isprime = true;
            for (j = 2; j <= i/j; j++)
                if ((i % j) == 0 ) isprime = false;
            if (isprime)
                System.out.println(i + " Simple");
        }

        System.out.print("One");
        System.out.print("Two");
        System.out.print("Three");
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p&q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
}
