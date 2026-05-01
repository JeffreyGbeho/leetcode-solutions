// Last updated: 01/05/2026, 18:35:38
1class Solution {
2    public int singleNumber(int[] nums) {
3        int res = nums[0];
4        for (int i = 1; i < nums.length; i++) {
5            res = res ^ nums[i];
6        }
7
8        return res;
9    }
10}