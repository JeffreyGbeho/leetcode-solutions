// Last updated: 10/12/2025 18:29:58
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        StringBuilder sb = new StringBuilder();
4        int res = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            if (sb.toString().indexOf(s.charAt(i)) == -1) {
8                sb.append(s.charAt(i));
9                res = Math.max(res, sb.toString().length());
10            } else {
11                while (sb.toString().indexOf(s.charAt(i)) != -1) {
12                    sb = sb.deleteCharAt(0);
13                }
14                sb.append(s.charAt(i));
15            }
16        }
17
18        return res;
19    }
20}