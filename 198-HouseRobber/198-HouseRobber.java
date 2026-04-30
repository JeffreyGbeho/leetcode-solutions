// Last updated: 30/04/2026, 16:37:32
1class Solution {
2    public int rob(int[] nums) {
3        int[] rob = new int[nums.length];
4        int res = 0;
5
6        int prev1 = 0;
7        int prev2 = 0;
8        for (int i = 0; i < nums.length; i++) {
9            rob[i] = Math.max(nums[i] + prev2, prev1);
10            prev2 = prev1;
11            prev1 = rob[i];
12
13            res = Math.max(res, rob[i]);
14        }
15
16        return res;
17    }
18}