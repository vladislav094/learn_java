package jrush;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Solution53 {
    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
//        if (destination.size() < source.size()) {
//            throw new IndexOutOfBoundsException("Source does not fit in dest");
//        }
//        for (int i = 0; i < source.size(); i++) {
//            destination.set(i, source.get(i));
//        }
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
//        for (String string : strings) {
//            list.add(string);
//        }
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
//        for (int i = 0; i < list.size(); i++) {
//            String string = list.get(i);
//            if (string.equals(oldValue)) {
//                list.set(i, newValue);
//            }
        Collections.replaceAll(list, oldValue, newValue);

    }

    public static void reverse(ArrayList<Integer> list) {
//        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++) {
//            Integer integer = list.get(i);
//            list.set(i, list.get(j - i));
//            list.set(j - i, integer);
//        }
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
//        int n = list.size();
//        int temp;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (n - i); j++) {
//                if (list.get(j - 1) > list.get(j)) {
//                    temp = list.get(j - 1);
//                    list.set(j - 1, list.get(j));
//                    list.set(j, temp);
//                }
//            }
//        }
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
//        for (int i = 0; i < distance; i++) {
//            list.add(0, list.get(list.size() - 1));
//            list.remove(list.size() - 1);
//        }
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
//        Random rand = new Random();
//        for (int i = 0; i < list.size(); i++) {
//            int randomIndexToSwap = rand.nextInt(list.size());
//            int temp = list.get(randomIndexToSwap);
//            list.set(randomIndexToSwap, list.get(i));
//            list.set(i, temp);
//        }
        Collections.shuffle(list);
    }
}
