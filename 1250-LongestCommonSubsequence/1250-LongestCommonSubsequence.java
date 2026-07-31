// Last updated: 30/07/2026, 22:22:06
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text2.length()][text1.length()];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (text1.charAt(j) == text2.charAt(i)) {
                    dp[i][j] = (i-1 >=  0 && j-1 >= 0 ? dp[i-1][j-1] : 0) + 1;
                } else {
                    dp[i][j] = Math.max((i-1 >= 0 ? dp[i-1][j] : 0), (j-1 >= 0 ? dp[i][j-1] : 0));
                }
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }
}