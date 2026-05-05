// Last updated: 05/05/2026, 13:36:08
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int res = 1;
4        int j = 1;
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i-1] != nums[i])  {
8                nums[j] = nums[i];
9                j++;
10                res++;
11            }
12        }
13
14        return res;
15    }
16}