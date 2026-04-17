// Last updated: 16/04/2026, 20:11:43
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        Map<Character, Integer> map = new HashMap<>();
4
5        for (char c : s.toCharArray()) {
6            map.put(c, map.getOrDefault(c, 0) + 1);
7        }
8
9        for (char c : t.toCharArray()) {
10            map.put(c, map.getOrDefault(c, 0) - 1);
11        }
12
13        for (int v : map.values()) {
14            if (v != 0) {
15                return false;
16            }
17        }
18
19        return true;
20    }
21}