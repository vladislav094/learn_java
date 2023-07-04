package jrush;

import java.util.LinkedList;
import java.util.List;

/*
Стек в домашних условиях
*/

public class MyStack {
    public static void main(String[] args) {
        storage.add("q");
        storage.add("qqwe");
        System.out.println(storage.size());
        System.out.println(empty());
        System.out.println(search("qqwe"));
        System.out.println(peek());
    }

    private static final List<String> storage = new LinkedList<>();

    public static void push(String s) {
        //напишите тут ваш код
        storage.add(storage.size(), s);
    }

    public static String pop() {
        //напишите тут ваш код
        if (!empty()) {
            String temp = storage.get(storage.size() - 1);
            storage.remove(storage.size() - 1);
            return temp;
        } else return "";
    }

    public static String peek() {
//        напишите тут ваш код
        return storage.get(storage.size() - 1);
    }

    public static boolean empty() {
        //напишите тут ваш код
        if (storage.size() == 0) return true;
        return false;
    }

    public static int search(String s) {
        //напишите тут ваш код
//        if (empty())
        if (!empty()) {
            for (String elt : storage) {
                if (elt.equals(s)) return storage.indexOf(elt);
            }
        }
        return -1;
    }
}
