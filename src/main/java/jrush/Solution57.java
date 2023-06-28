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
        //напишите тут ваш код
        if (last == null){
            last = new Node();
            return;
        }
        Node currentNode = last;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node();
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
    }
}
