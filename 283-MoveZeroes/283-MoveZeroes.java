// Last updated: 05/05/2026, 14:12:27
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int k = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] != 0) {
7                int temp = nums[k];
8                nums[k] = nums[i];
9                nums[i] = temp;
10                k++;
11            }
12        }
13    }
14}