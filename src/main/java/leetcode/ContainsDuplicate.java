package leetcode;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    return true;

                }
            }
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
