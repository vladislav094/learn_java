package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        int temp = 0;
        int lengthArr = nums.length;
        Set<Integer> setArr = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            setArr.add(nums[i]);
        }
        if (setArr.size() < lengthArr) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(arr2));
    }
}
