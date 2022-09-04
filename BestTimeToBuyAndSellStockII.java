// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
// however, you can buy it then immediately sell it on the same day.
// Find and return the maximum profit you can achieve.
// Input: 6
// prices = [7,1,5,3,6,4]
// Output: 7
// Input: 5
// prices = [1,2,3,4,5]
// Output: 4
// Input: 5
// prices = [7,6,4,3,1]
// Output: 0

import java.util.*;

class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                profit += diff;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] prices = new int[size];
        for (int i = 0; i < size; i++) {
            prices[i] = sc.nextInt();
        }
        int solution = maxProfit(prices);
        System.out.println(solution);
        sc.close();
    }
}