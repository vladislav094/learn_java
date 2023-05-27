package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}



public class Solution {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int l = str.length();
        for(int i = 0; i < l/2; i++) {
            if(str.charAt(i) != str.charAt(l - i - 1)) return false;
        }
        return true;
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) !=0 ) {
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if( top != map.get(c))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static int minLength(String s) {
        String ab = "AB";
        String cd = "CD";
        while(s.contains(cd) | s.contains(ab)) {
            s = s.replace(ab, "");
            s = s.replace(cd, "");
        }
        return s.length();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        return dummy;
    }

    public static int strStr(String haystack, String needle) {
        int lenNeedle = needle.length();
        int lenHaystack = haystack.length();
        int startIndex = 0;
        int resultIndex = -1;
        String tempWord ="";
        System.out.println(haystack.charAt(4));
        while (startIndex < lenHaystack - lenNeedle + 1) {
            tempWord = haystack.substring(startIndex, startIndex + lenNeedle);
            if(tempWord.equals(needle)) {
                resultIndex = startIndex;
                break;
            }
            startIndex++;
        }
        if(resultIndex != -1) {
            return resultIndex;
        } else return -1;
    }

/* Это решение увидел в решениях под задачей на Leetcode:
    public int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
 */

    public static void main(String[] args) {
//        System.out.println(isPalindrome(1212));
//
//        String[] s = {"flower","flow","flight"};
//        System.out.println(longestCommonPrefix(s));
//
////        System.out.println(isValid("(){}[]"));
//        System.out.println(isValid("(]"));
//
//        System.out.println(isValid("{()[]{}}"));
//        System.out.println(minLength("ABFCACDB"));

        String h = "sadbutsad";
        String n = "sad";
        System.out.println(strStr(h, n));
    }
}


