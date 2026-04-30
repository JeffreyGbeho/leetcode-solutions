// Last updated: 30/04/2026, 17:27:39
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] dp = new int[amount + 1];
4        Arrays.fill(dp, amount + 1);
5        dp[0] = 0;
6
7        for (int i = 1; i <= amount; i++) {
8            for (int coin : coins) {
9                if (coin <= i) {
10                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
11                }
12            }
13        }
14
15        return dp[amount] > amount ? -1 : dp[amount];
16    }
17}