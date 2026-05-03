// Last updated: 03/05/2026, 11:39:53
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
4
5        for (int i = 0; i < dp.length; i++) {
6            dp[i][0] = i;
7        }
8
9        for (int j = 0; j < dp[0].length; j++) {
10            dp[0][j] = j;
11        }
12
13        for (int i = 1; i < dp.length; i++) {
14            for (int j = 1; j < dp[i].length; j++) {
15                if (word1.charAt(i-1) == word2.charAt(j-1)) {
16                    dp[i][j] = dp[i-1][j-1];
17                } else {
18                    dp[i][j] =  Math.min(Math.min(dp[i-1][j-1] + 1, dp[i][j-1] + 1), dp[i-1][j] + 1);
19                }
20            }
21        }
22
23        return dp[dp.length - 1][dp[0].length - 1];
24    }
25}