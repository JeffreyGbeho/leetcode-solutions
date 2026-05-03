// Last updated: 03/05/2026, 11:12:26
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text2.length()][text1.length()];
4
5        for (int i = 0; i < dp.length; i++) {
6            for (int j = 0; j < dp[i].length; j++) {
7                if (text1.charAt(j) == text2.charAt(i)) {
8                    dp[i][j] = (i-1 >=  0 && j-1 >= 0 ? dp[i-1][j-1] : 0) + 1;
9                } else {
10                    dp[i][j] = Math.max((i-1 >= 0 ? dp[i-1][j] : 0), (j-1 >= 0 ? dp[i][j-1] : 0));
11                }
12            }
13        }
14
15        return dp[dp.length - 1][dp[0].length - 1];
16    }
17}