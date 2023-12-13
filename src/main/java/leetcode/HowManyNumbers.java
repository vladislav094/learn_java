package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowManyNumbers {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result =  new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            for (int k = 0; k < nums.length; k++) {
                if (k != i && nums[k] < digit) {
                    result[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 1, 2, 2, 3};
        int[] arr2 = {6, 5, 4, 8};
        int[] arr3 = {7, 7, 7, 7};

        smallerNumbersThanCurrent(arr1);
        smallerNumbersThanCurrent(arr2);
        smallerNumbersThanCurrent(arr3);
    }
}
