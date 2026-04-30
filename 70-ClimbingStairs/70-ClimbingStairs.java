// Last updated: 30/04/2026, 15:44:12
1class Solution {
2    public int climbStairs(int n) {
3        if (n == 1) return 1;
4
5        int[] dp = new int[n + 1];
6        dp[1] = 1;
7        dp[2] = 2;
8
9        for (int i = 3; i <= n; i++) {
10            dp[i] = dp[i-1] + dp[i-2];
11        }
12
13        return dp[n];
14    }
15}