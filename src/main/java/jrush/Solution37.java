package jrush;

public class Solution37 {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //напишите тут ваш код
        String t1 = first.intern();
        String t2 = second.intern();
        if (t1 == t2) return true;
        else return false;
    }
}
