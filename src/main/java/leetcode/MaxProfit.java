package leetcode;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int result = 0;
        for(int i = 0; i <= prices.length-1; i++) {
            for (int j = i + 1; j <= prices.length-1; j++) {
//                System.out.println(prices[i] + " " + prices[j]);
                if (prices[i] < prices[j] && result < prices[j] - prices[i]) {
                    result = prices[j] - prices[i];
//                    System.out.println(prices[i] + " " + prices[j]);
//                    System.out.println(result);
                }
            }
        }
//        System.out.println();
//        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr2));
    }
}
