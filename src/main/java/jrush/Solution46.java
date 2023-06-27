package jrush;

import java.util.ArrayList;
import java.util.Arrays;
class CustomStringArrayList{

    private String[] elements = new String[10];
    private int size = 0;
    private int capacity;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        String[] el = new String[capacity + (capacity / 2)];
        System.arraycopy(elements, 0, el,0, elements.length);
        elements = el;
        capacity = elements.length;
    }
}

public class Solution46 {

    public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
//        print();
//        sort();
//        System.out.println("\nОтсортированные числа в натуральном порядке:");
//        print();

        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }

    public static void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
