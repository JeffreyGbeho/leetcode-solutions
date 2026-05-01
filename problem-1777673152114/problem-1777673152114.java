// Last updated: 01/05/2026, 18:05:52
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        Set<String> dict = new HashSet<>(wordDict);
4        boolean[] dp = new boolean[s.length() + 1];
5        dp[0] = true;
6
7        for (int i = 1; i <= s.length(); i++) {
8            for (int j = 0; j < i; j++) {
9                if (dp[j] && dict.contains(s.substring(j, i))) {
10                    dp[i] = true;
11                    break;
12                }
13            }
14        }
15
16        return dp[s.length()];
17    }
18}