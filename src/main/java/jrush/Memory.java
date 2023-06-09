package jrush;

import java.util.Arrays;
import java.util.Objects;

/*
Дефрагментация памяти
*/

public class Memory {

    private static boolean hasEggs = true;
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));

        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }
    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == null) {
                    String t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
