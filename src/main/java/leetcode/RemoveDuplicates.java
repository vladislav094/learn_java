package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int k = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        k = set.size();
        int[] result = new int[nums.length];
        for(int x: set) {
            result[index++] = x;
        }
        System.out.println(k);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] arrInt = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arrInt);
//        System.out.println(removeDuplicates(arrInt));
    }
}
