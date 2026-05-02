// Last updated: 02/05/2026, 10:07:43
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] left = new int[nums.length];
4        left[0] = 1;
5        int[] right = new int[nums.length];
6        right[nums.length - 1] = 1;
7        int[] ans = new int[nums.length];
8
9        for (int i = 1; i < nums.length; i++) {
10            left[i] = left[i-1] * nums[i-1];
11        }
12
13        for (int i = nums.length - 2; i >= 0; i--) {
14            right[i] = right[i+1] * nums[i+1];
15        }
16
17        for (int i = 0; i < left.length; i++) {
18            ans[i] = left[i] * right[i];
19        }
20
21        return ans;
22
23    }
24}