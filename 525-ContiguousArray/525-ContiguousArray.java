// Last updated: 13/05/2026, 12:37:10
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int res = 0;
4        int c = 0;
5        Map<Integer, Integer> map = new HashMap<>();
6        map.put(0, -1);
7        for (int i = 0; i < nums.length; i++) {
8            c += nums[i] == 0 ? -1 : 1;
9
10            if (map.get(c) != null) {
11                res = Math.max(res, i - map.get(c));
12            } else {
13                map.put(c, i);
14            }
15        }
16
17        return res;
18    }
19}