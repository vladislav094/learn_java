package java_libs.strings;

public class FirstStrings {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c'};
        String s = new String(chars);
        System.out.println(s);

        int[] codePoints = {2, 1, 3, 2, 4, 5};
        System.out.println(new String(codePoints, 2, 2));

        String q = "Это демонстрация метода getChars()";
        int start = 4;
        int end = 8;
        char buf[] = new char[end-start];
        q.getChars(start, end, buf, 0);
        System.out.println(buf);

        String first = "Hello World!";
        String second = "World Hel";
        System.out.println(first.regionMatches(0, second, 6, 4));

        String exm1 = "equals";
        String exm2 = exm1;
        System.out.println(exm1 == exm2);
    }
}
