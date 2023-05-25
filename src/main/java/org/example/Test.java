package org.example;

public class Test {
    int a;
    Test(int i) {
        a = i;
    }

    void show() {
        System.out.println(a);
    }
    static void swap(Test v1, Test v2) {
        int t1 = v1.a;
        int t2 = v2.a;
        v2.a = t1;
        v1.a = t2;
    }


    public static void main(String[] args) {
        Test myObj1 = new Test(11);
        Test myObj2 = new Test(22);
        myObj1.show();
        myObj2.show();

        swap(myObj1, myObj2);

        myObj1.show();
        myObj2.show();



    }
}
