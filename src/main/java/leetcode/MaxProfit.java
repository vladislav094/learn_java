package leetcode;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int result = 0;
        int sell = prices[0];
        for(int i = 1; i <= prices.length-1; i++) {
            if (prices[i] > sell) {
                result = Math.max(result, prices[i] - sell);
            } else {
               sell = prices[i];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr2));
    }
}
