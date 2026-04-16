// Last updated: 16/04/2026, 18:40:44
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min = prices[0];
4        int res = 0;
5
6        for (int i = 1; i < prices.length; i++) {
7            res = Math.max(res, prices[i] - min);
8
9            min = Math.min(min, prices[i]);
10        }
11
12        return res;
13    }
14}