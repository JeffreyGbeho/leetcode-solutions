// Last updated: 16/04/2026, 20:48:38
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> set = new HashSet<>();
4        int end = 0;
5        int max = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8            max = Math.max(max, i-end);
9            while (set.contains(s.charAt(i))) {
10                set.remove(s.charAt(end));
11                end++;
12            }
13
14            set.add(s.charAt(i));
15        }
16
17        max = Math.max(max, s.length() - end);
18
19        return max;
20    }
21}