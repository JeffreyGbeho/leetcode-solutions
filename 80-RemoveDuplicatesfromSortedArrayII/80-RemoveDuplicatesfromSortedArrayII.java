// Last updated: 11/05/2026, 12:50:02
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int j = 0;
4        Map<Integer, Integer> map = new HashMap<>();
5        for (int i = 0; i < nums.length; i++) {
6            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
7            if (map.get(nums[i]) <= 2) {
8                nums[j] = nums[i];
9                j++;
10            }
11        }
12
13        return j;
14    }
15}