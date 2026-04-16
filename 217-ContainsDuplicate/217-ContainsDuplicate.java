// Last updated: 16/04/2026, 18:54:54
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> s = new HashSet<>();
4
5        for (int num : nums) {
6            if (s.contains(num)) {
7                return true;
8            }
9
10            s.add(num);
11        }
12
13        return false;
14    }
15}