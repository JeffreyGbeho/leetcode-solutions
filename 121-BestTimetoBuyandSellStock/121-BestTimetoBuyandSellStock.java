// Last updated: 10/12/2025 18:06:29
1class Solution {
2    public int maxProfit(int[] prices) {
3        // int res = 0;
4
5        // for (int i = 0; i < prices.length; i++) {
6        //     for (int j = i+1; j < prices.length; j++) {
7        //         if (prices[j] - prices[i] > res) {
8        //             res = prices[j] - prices[i];
9        //         }
10        //     }
11        // }
12
13        // return res;
14
15        int max = prices[prices.length - 1];
16        int res = 0;
17
18        for (int i = prices.length - 2; i >= 0; i--) {
19            if (prices[i] > max) {
20                max = prices[i];
21            } else {
22                res = Math.max(res, max - prices[i]);
23            }
24        }
25
26        return res;
27    }
28}