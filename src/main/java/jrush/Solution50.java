package jrush;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

public class Solution50 {
    public static void main(String[] args) {
//        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("___________________________________");
//
//        HashSet<String> hashSet = arrayToHashSet(array);
//        for (String s : hashSet) {
//            System.out.println(s);
//        }

        checkWords("JavaScript");
        checkWords("Java");
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }

    public static void print(HashSet<String> words) {
        //напишите тут ваш код
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        //напишите тут ваш код
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слова " + word + " нет в множестве");
        }
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
