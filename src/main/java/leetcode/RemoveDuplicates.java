package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int[] x = new int[nums.length];
        Set<Integer> set = new HashSet<>();
        int unique = 0;
        for(int i =0; i < nums.length; i++) {
            set.add(nums[i]);
            if(nums[i] != nums[unique]) {
                unique++;
                nums[unique] = nums[i];
            }
        }
        int k = set.size();
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] arrInt = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arrInt);
//        System.out.println(removeDuplicates(arrInt));
    }
}
