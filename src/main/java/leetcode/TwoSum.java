package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length-1; i ++) {
            for (int j = 1; j < nums.length; j++) {
                System.out.println(nums[i] + " " + nums[j]);
                if (nums[i] + nums[j] == target && i !=j) {
//                    System.out.println(nums[i] + " " + nums[j]);
                    result[0] = i;
                    result[1] = j;
                    break;
                }
//                if (result.length == 2) break;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] arr2 = {3, 2, 3};
        int[] arr3 = {-1,-2,-3,-4,-5};
        int target = 9;
        int target2 = 6;
        int target3 = -8;

        System.out.println(twoSum(arr, target));
        System.out.println(twoSum(arr2, target2));
        System.out.println(twoSum(arr3, target3));
    }
}
