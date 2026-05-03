// Last updated: 03/05/2026, 10:39:52
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4        
5        for (int i = 0; i < n; i++) {
6            dp[0][i] = 1;
7        }
8
9        for (int i = 0; i < m; i++) {
10            dp[i][0] = 1;
11        }
12
13        for (int i = 1; i < m; i++) {
14            for (int j = 1; j < n; j++) {
15                dp[i][j] = dp[i-1][j] + dp[i][j-1];
16            }
17        }
18
19        return dp[m-1][n-1];
20    }
21}