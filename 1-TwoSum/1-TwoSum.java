// Last updated: 06/12/2025 10:37:22
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        for (int i = 0; i < nums.length; i++) {
4            int t = target-nums[i];
5            for (int j = i+1; j < nums.length; j++) {
6                if (nums[j] == t) {
7                    int[] res = {i, j};
8                    return res;
9                }
10            }
11        }
12
13        return new int[2];
14    }
15}