/*
    Time complexity : O(N)
    Space comeplxity: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {
        int minCost = prices[0], profit = 0;
        
        for (int i=1; i<prices.length; i++) {
            if (prices[i] < minCost) {
                minCost = prices[i];
            }
            if (prices[i] - minCost > profit) {
                profit = prices[i] - minCost;
            }
        }
        return profit;
    }
}
