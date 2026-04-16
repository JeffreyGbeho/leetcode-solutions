// Last updated: 16/04/2026, 18:02:33
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> diff = new HashMap<>();
4        int[] res = new int[2];
5        for (int i = 0; i < nums.length; i++) {
6            if (diff.get(nums[i]) != null) {
7                res[0] = diff.get(nums[i]);
8                res[1] = i;
9                return res;
10            }
11
12            if (diff.get(target - nums[i]) == null) {
13                diff.put(target - nums[i], i);
14            }
15        }
16
17        return res;
18    }
19}