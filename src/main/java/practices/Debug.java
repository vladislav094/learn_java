package practices;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Quicksort {
    static void qsort(char items[]) {
        qs(items, 0, items.length-1);
    }

    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left+right) / 2];

        do{
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while (i <= j);
        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }


    public static boolean isValid(String s){
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stack);
            char c = s.charAt(i);

            if(!map.containsKey(c)){
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if(top != map.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

public class Debug {
    public static void main(String[] args) {
        char[] a = {'c', 's', 'a', 'e', 'x'};
//        char[] result = practices.Quicksort.qsort(a);
        System.out.println(Quicksort.isValid("{()[]{}}"));
    }
}
