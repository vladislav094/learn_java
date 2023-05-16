package org.example;

public class QDemo {
    char q[];
    int putloc, getloc;
    QDemo(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Очеред заполнена");
            return;
        }
        q[putloc++] = ch;
    }
}
