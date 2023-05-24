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

    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));
    }
}


