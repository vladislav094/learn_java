package jrush;

import java.util.*;

public class Solution51 {
    public static void printList(ArrayList<String> words) {
        for (String elt: words){
            System.out.println(elt);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String elt: words){
            System.out.println(elt);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
