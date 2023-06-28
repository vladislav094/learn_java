package jrush;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Solution50 {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }

        checkWords("JavaScript");
        checkWords("Java");
    }

    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        //напишите тут ваш код
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        for (String elt : strings) {
            set.add(elt);
        }
        return set;
    }
}
