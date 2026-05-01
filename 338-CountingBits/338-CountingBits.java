// Last updated: 01/05/2026, 19:33:31
1class Solution {
2    public int[] countBits(int n) {
3        int[] dp = new int[n + 1];
4        dp[0] = 0;
5
6        for (int i = 1; i <= n; i++) {
7            dp[i] = dp[i/2] + (i % 2);
8        }
9
10        return dp;
11    }
12}