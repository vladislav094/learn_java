package leetcode;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(target == nums[mid]) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 2));
        System.out.println(searchInsert(arr, 4));
        System.out.println(searchInsert(arr, 7));
    }
}
