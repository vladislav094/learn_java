package debug;

import java.util.Arrays;
import java.util.Random;

public class MyDebug {
    protected int j;
    MyDebug() {
        j = 39;
    }
}

class D1 extends MyDebug {
    private int k = 47;
    public D1() {
        System.out.println(k);
        System.out.println(j);
    }

    public static void main(String[] args) {
        D1 d = new D1();
    }
}

