// Last updated: 20/05/2026, 09:30:00
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        Map<Character, Integer> rn = new HashMap<>();
4        for (char c : ransomNote.toCharArray()) {
5            rn.put(c, rn.getOrDefault(c, 0) + 1);
6        }
7
8        Map<Character, Integer> mz = new HashMap<>();
9        for (char c : magazine.toCharArray()) {
10            mz.put(c, mz.getOrDefault(c, 0) + 1);
11        }
12
13        for (char c : rn.keySet()) {
14            if (mz.get(c) == null || mz.get(c) < rn.get(c)) return false;
15        }
16
17        return true;
18    }
19}