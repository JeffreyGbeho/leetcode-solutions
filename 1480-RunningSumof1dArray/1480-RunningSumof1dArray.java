// Last updated: 13/05/2026, 09:16:11
1class Solution {
2    public int[] runningSum(int[] nums) {
3        for (int i = 1; i < nums.length; i++) {
4            nums[i] += nums[i-1];
5        }
6
7        return nums;
8    }
9}