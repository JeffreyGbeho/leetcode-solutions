// Last updated: 05/12/2025 13:04:06
1class Solution {
2    public boolean isAnagram(String s, String t) {
3         if(s.length() != t.length()) return false;
4
5        Map<Character,Integer> map = new HashMap<>();
6        for(char c : s.toCharArray())
7        {
8            map.put(c,map.getOrDefault(c,0)+1);
9        }
10
11        for(char c : t.toCharArray())
12        {
13            if(!map.containsKey(c)) return false;
14
15            map.put(c,map.get(c)-1);
16            if(map.get(c) == 0) map.remove(c);
17        }
18        return map.isEmpty();
19    }
20}