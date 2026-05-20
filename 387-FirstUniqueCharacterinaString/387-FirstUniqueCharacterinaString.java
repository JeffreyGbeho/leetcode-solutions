// Last updated: 20/05/2026, 09:59:34
1class Solution {
2    public int firstUniqChar(String s) {
3        Map<Character, Integer> map = new HashMap<>();
4        for (char c : s.toCharArray()) {
5            map.put(c, map.getOrDefault(c, 0) + 1);
6        }
7
8        for (int i = 0; i < s.length(); i++) {
9            if (map.get(s.charAt(i)) == 1) return i;
10        }
11
12        return -1;
13    }
14}