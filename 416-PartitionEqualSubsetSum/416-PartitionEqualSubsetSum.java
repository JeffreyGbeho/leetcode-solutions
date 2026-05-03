// Last updated: 03/05/2026, 12:01:10
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum = 0;
4        for (int num : nums) sum += num;
5        if (sum % 2 != 0) return false;
6        int target = sum / 2;
7        boolean[] dp = new boolean[target + 1];
8        dp[0] = true;
9
10        for (int num : nums) {
11            for (int i = target; i >= num; i--) {
12                dp[i] = dp[i] || dp[i - num];
13            }
14        }
15
16        return dp[target];
17    }
18}