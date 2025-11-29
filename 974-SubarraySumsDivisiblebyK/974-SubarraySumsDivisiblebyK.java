// Last updated: 29/11/2025 10:38:28
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4        map.put(0, 1);
5        int count = 0, sum = 0;
6        for(int a : nums) {
7            sum = (sum + a) % k;
8            if(sum < 0) sum += k;  // Because -1 % 5 = -1, but we need the positive mod 4
9            count += map.getOrDefault(sum, 0);
10            map.put(sum, map.getOrDefault(sum, 0) + 1);
11        }
12        return count;
13    }
14}