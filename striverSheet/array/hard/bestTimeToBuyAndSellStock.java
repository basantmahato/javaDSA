/**
 * bestTimeToBuyAndSellStock
 */
public class bestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        // brute force approach

        // int maxProfit = 0;

        // for (int i = 0; i < prices.length; i++) {

        // for (int j = i + 1; j < prices.length; j++) {

        // int profit = prices[j] - prices[i];

        // maxProfit = Math.max(maxProfit, profit);
        // }
        // }

        // System.out.println(maxProfit);

        // optimal approach

        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            int profit = prices[i] - min;

            maxProfit = Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);

    }
}