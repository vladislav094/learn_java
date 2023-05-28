package leetcode;

import java.math.BigInteger;
import java.util.*;

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
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left+right) /2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        } return left;
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int lastLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty()){
                lastLength = arr[i].length();
            }
        }
        return lastLength;
    }

//    public static int[] plusOne(int[] digits) {
//        String str = "";
//        BigInteger num =0;
//        for(int i: digits){
//            str += i;
//        }
//        num = BigInteger.ad(str) + 1;
//        String str2 = String.valueOf(num);
//        int[] result = new int[str2.length()];
//        for(int i = 0; i<str2.length(); i++) {
//            result[i] = Character.getNumericValue(str2.charAt(i));
//        }
//        return result;
//    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }

    public static int mySqrt(int x) {
        int t;
        int squareRoot = x / 2;
        double z = 2.8;
        int a = (int) z;
        System.out.println(a);
        return 1;
    }

    public static int climbStairs(int n) {
        int first = 0;
        int second = 1;
        for (int j = 0; j < n; j++){
            int t = first;
            first = second;
            second = t + second;
        }
        System.out.println(second);
        return second;
    }


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

//        String h = "sadbutsad";
//        String n = "sad";
//        System.out.println(strStr(h, n));

//        int[] n = {1, 3, 5, 7};
//        int[] n2 = {1, 3, 5, 6, 7};
//        System.out.println(searchInsert(n, 6));
//        System.out.println(searchInsert(n2, 7));
//        String s = " лети со мной на луну ";
//        System.out.println(lengthOfLastWord(s));

//        int[] arr = {4,3,2,1};
//        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(climbStairs(3));
    }
}


