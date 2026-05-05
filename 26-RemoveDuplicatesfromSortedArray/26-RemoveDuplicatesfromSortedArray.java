// Last updated: 05/05/2026, 13:36:59
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int j = 1;
4
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i-1] != nums[i])  {
7                nums[j] = nums[i];
8                j++;
9            }
10        }
11
12        return j;
13    }
14}