package leetcode;

import java.util.Arrays;

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
        String temp = s;
        for(int i = 0, j = 1; i < temp.length() - 1; i += 2, j+= 2) {
            System.out.println(temp.charAt(i) + " " + temp.charAt(j));
            int t1 = temp.charAt(j);
            int t2 = temp.charAt(i);
            System.out.println(t1 + " " + t2);
            if(t1 - t2 > 2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));

        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));

//        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("(]"));
    }
}


