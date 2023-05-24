package leetcode;

import java.util.Arrays;

public class Solution {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String s = "";
        String[] result1 = new String[str.length()];
        String[] result2 = new String[str.length()];
        char[] strArr_1 = new char[str.length()];
        for (int i = 0; i < strArr_1.length; i++) {
            s += str.charAt(i) + " ";
        }
        result1 = s.split(" ");
        for (int i = result1.length -1, j = 0; i >= 0; i--, j++){
            result2[j] = result1[i];
        }
        return Arrays.equals(result1, result2);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}


