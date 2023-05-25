package org.example;

import java.util.Arrays;
import java.util.EmptyStackException;

class Stacks {
    private char[] stacks;
    private int pushloc, poploc;

    Stacks(int l) {
        stacks = new char[l];
//        pushloc = 0;
        poploc = -1;
    }

    public void push(char ch){
        if(pushloc == stacks.length) {
            System.out.println(" - Очеред переполнена");
            return;
        }

        System.out.println(ch);
        stacks[++poploc] = ch;
        System.out.println(Arrays.toString(stacks));
    }

    public char pop() {
        if(isEmpty()) {
           throw new EmptyStackException();
        }
        return stacks[poploc--];
    }
    private boolean isEmpty() {
        return poploc == -1;
    }

}



public class Chapter6 {

    public static void main(String[] args) {
        Stacks s1 = new Stacks(5);
        System.out.println();
        s1.push('a');
        s1.push('a');
        s1.push('a');
        s1.push('a');
        s1.push('a');
        s1.push('a');
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
