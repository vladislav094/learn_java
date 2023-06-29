package jrush;

import java.util.LinkedList;

class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        if (first.next == null){
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        //напишите тут ваш код
        Node temp = first.next;
        for (int i = 0; i< index; i++) {
            if (temp.next == null) return null;
            temp = temp.next;

        }
        return temp.value;
    }



    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }

}
public class Solution57 {
    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.printAll();
        System.out.println();
        System.out.println(stringLinkedList.get(4)); // 5
        System.out.println(stringLinkedList.get(0)); // 5
        System.out.println(stringLinkedList.get(15)); // 5
    }
}
