package leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
               if(nums[i] != val) {
                   int t = nums[counter];
                   nums[counter] = nums[i];
                   nums[i] = t;
                   counter++;

               }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int[] arr2 = {3,2,2,3};
        removeElement(arr, 2);
        removeElement(arr2, 3);
    }
}
