package generics;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is " + ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();

        System.out.println("Value: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Text with message");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}
