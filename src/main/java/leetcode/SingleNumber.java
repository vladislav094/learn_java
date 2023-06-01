package leetcode;

import java.util.Arrays;

public class SingleNumber {
    /*
    Используя побитовую операцию XOR сохраняем во временную переменную полученый результат для элементов массива
    array = [4,1,2,1,2]
    let sort array [1,1,2,2,4]
    1 ^ 1 = 0
    0 ^ 2 ^ 2 = 0 (0 результат 1 ^ 1 = 0)
    0 ^ 4 = 4
    (поэтому результат равен 4)
     */
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int resultInt = nums[0];
        int start = 0;
        while (start < nums.length-1) {
//            resultInt = resultInt ^ nums[start+1];
            resultInt ^= nums[start+1];
            start++;
        }
        return resultInt;
    }

    public static void main(String[] args) {
        int[] arr ={4, 1, 2, 1, 2};
        int[] arr2 ={2, 2, 1};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber(arr2));
    }
}
