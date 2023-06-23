package jrush;

public class Solution38 {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));

        String string1 = "Ходит кот задом наперед";
        System.out.println(string1);
        System.out.println(reverseString(string1));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.replace(start, end, str);
    }

    public static String reverseString(String string) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
}
