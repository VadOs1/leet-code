package com.gmail.dissa.vadim.array;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * Example 1:
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Example 2:
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 * engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSell {
    public static int maxProfit(int[] prices) {
        int result = 0;

        if (prices == null || prices.length == 0 || prices.length == 1) {
            return result;
        }

        int idx1 = 0;
        int idx2 = 0;
        boolean isTradeStarted = false;
        boolean isLastElement = false;

        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                isLastElement = true;
            }

            if (isLastElement && isTradeStarted) {
                return result + countDealProfit(prices, idx1, idx2);
            }

            if (isLastElement) {
                return result;
            }

            int price1 = prices[i];
            int price2 = prices[i + 1];

            if (!isTradeStarted) {
                if (isSame(price1, price2) || isFalling(price1, price2)) {
                    idx1++;
                    idx2++;
                } else if (isGrowing(price1, price2)) {
                    isTradeStarted = true;
                    idx1 = i;
                    idx2 = i + 1;

                }
            } else {
                if (isGrowing(price1, price2) || isSame(price1, price2)) {
                    idx2 = i + 1;
                } else if (isFalling(price1, price2)) {
                    result = result + countDealProfit(prices, idx1, idx2);
                    isTradeStarted = false;
                    idx1 = i;
                    idx2 = i;
                }
            }
        }
        return result;
    }

    private static int countDealProfit(int[] prices, int idx1, int idx2) {
        return prices[idx2] - prices[idx1];
    }

    private static boolean isGrowing(int price1, int price2) {
        return price2 > price1;
    }

    private static boolean isFalling(int price1, int price2) {
        return price1 > price2;
    }

    private static boolean isSame(int price1, int price2) {
        return price1 == price2;
    }
}
