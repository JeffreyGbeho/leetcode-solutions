// Last updated: 16/04/2026, 20:12:53
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) return false;
4        
5        Map<Character, Integer> map = new HashMap<>();
6
7        for (char c : s.toCharArray()) {
8            map.put(c, map.getOrDefault(c, 0) + 1);
9        }
10
11        for (char c : t.toCharArray()) {
12            map.put(c, map.getOrDefault(c, 0) - 1);
13        }
14
15        for (int v : map.values()) {
16            if (v != 0) {
17                return false;
18            }
19        }
20
21        return true;
22    }
23}