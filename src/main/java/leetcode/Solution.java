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
        for(int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) !=0 ) {
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));

        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}


