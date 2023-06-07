package leetcode;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] resultArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = 0; j < nums.length; j++ ){
                if (j !=i ) {
                    temp *= nums[j];
                }
            }
            resultArr[i] = temp;
        }
        System.out.println(Arrays.toString(resultArr));
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {-1, 1, 0 -3, 3};
        System.out.println(productExceptSelf(arr));
        System.out.println(productExceptSelf(arr2));
    }
}


